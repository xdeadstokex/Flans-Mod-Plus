package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class FlightController {
	//Aircraft control paramaters
	public float throttle;
	public float yawControl;
	public float pitchControl;
	public float rollControl;
	public EnumPlaneMode mode;

	//Physics parameters
	public float gravity;
	public float drag;
	public float thrust;
	public float lift;

	public void UpdateParams(EntityPlane plane)
	{
		throttle = plane.throttle;
		yawControl = plane.flapsYaw;
		pitchControl = (plane.flapsPitchLeft + plane.flapsPitchRight) / 2F;
		rollControl = (plane.flapsPitchRight - plane.flapsPitchLeft) / 2F;
		mode = plane.mode;
	}

	public void fly(EntityPlane plane)
	{
		PlaneType type = plane.getPlaneType();
		DriveableData data = plane.getDriveableData();
		UpdateParams(plane);
		SetAxes(plane);

		thrust = 0.01F * (type.maxThrottle + (data.engine == null ? 0 : data.engine.engineSpeed));
		gravity = 0.98F / 10F;
		drag = 1F - (0.05F * type.drag);

		if(mode == EnumPlaneMode.PLANE)
		{
			PlaneModeFly(plane);
		}

		if(mode == EnumPlaneMode.HELI)
		{
			HeliModeFly(plane);
		}
	}

	public void SetAxes(EntityPlane plane)
	{
		PlaneType type = plane.getPlaneType();
		//Set angles
		float sensitivityAdjust = (throttle > 0.5F ? 1.5F - throttle : 4F * throttle - 1F);
		if(sensitivityAdjust < 0F)
			sensitivityAdjust = 0F;
		//Scalar
		sensitivityAdjust *= 0.125F;
		float yaw = yawControl * (yawControl > 0 ? type.turnLeftModifier : type.turnRightModifier) * sensitivityAdjust;
		float pitch = pitchControl * (pitchControl > 0 ? type.lookUpModifier : type.lookDownModifier) * sensitivityAdjust;
		float roll = rollControl * (rollControl > 0 ? type.rollLeftModifier : type.rollRightModifier) * sensitivityAdjust;
		//Damage modifiers
		if(mode == EnumPlaneMode.PLANE)
		{
			if(!plane.isPartIntact(EnumDriveablePart.tail))
			{
				yaw = 0;
				pitch = 0;
			}
			if(!plane.isPartIntact(EnumDriveablePart.leftWing))
				roll -= 2F * plane.getSpeedXZ();
			if(!plane.isPartIntact(EnumDriveablePart.rightWing))
				roll += 2F * plane.getSpeedXZ();
		}

		plane.axes.rotateLocalYaw(yaw);
		plane.axes.rotateLocalPitch(pitch);
		plane.axes.rotateLocalRoll(-roll);
	}

	public void PlaneModeFly(EntityPlane plane)
	{	
		if(plane.mode == EnumPlaneMode.HELI) return;
		PlaneType type = plane.getPlaneType();
		DriveableData data = plane.getDriveableData();
		int numPropsWorking = 0;
		int numProps = 0;
		float fuelConsumptionMultiplier = 2F;
		float flap = (float)Math.sqrt(plane.flapsYaw*plane.flapsYaw) + (float)Math.sqrt(plane.flapsPitchLeft*plane.flapsPitchLeft) + + (float)Math.sqrt(plane.flapsPitchRight*plane.flapsPitchRight);
		drag -=flap/500;
		throttle -= - flap/500;
		//Count the number of working propellers
		for(Propeller prop : type.propellers)
			if(plane.isPartIntact(prop.planePart))
				numPropsWorking++;
		numProps = type.propellers.size();

		//Got no propellers. Derp.
		if(numProps == 0)
			return;

		//Apply forces
		Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();

		//Sanity limiter
		float lastTickSpeed = (float)plane.getSpeedXYZ();
		if(lastTickSpeed > 2F)
			lastTickSpeed = 2F;

		float newSpeed = lastTickSpeed + thrust * 2F;

		//Calculate the amount to alter motion by
		float proportionOfMotionToCorrect = 2F * throttle - 0.5F;
		if(proportionOfMotionToCorrect < 0F)
			proportionOfMotionToCorrect = 0F;
		if(proportionOfMotionToCorrect > 1.5F)
			proportionOfMotionToCorrect = 1.5F;

		plane.motionY -= gravity;

		//Apply lift
		int numWingsIntact = 0;
		if(plane.isPartIntact(EnumDriveablePart.rightWing)) numWingsIntact++;
		if(plane.isPartIntact(EnumDriveablePart.leftWing)) numWingsIntact++;

		float amountOfLift = 2F * gravity * throttle * numWingsIntact / 2F * drag;
		if(amountOfLift > gravity)
			amountOfLift = gravity;
		Vector3f up2 = (Vector3f)plane.axes.getYAxis().normalise();
		amountOfLift *= Math.sqrt(up2.y*up2.y);

		plane.motionY += amountOfLift;


		//Cut out some motion for correction
		plane.motionX *= 1F - proportionOfMotionToCorrect;
		plane.motionY *= 1F - proportionOfMotionToCorrect;
		plane.motionZ *= 1F - proportionOfMotionToCorrect;

		//Add the corrected motion
		plane.motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
		plane.motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
		plane.motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
		
		plane.motionY -= - flap/500;

		if(!plane.isPartIntact(EnumDriveablePart.rightWing) && !plane.isPartIntact(EnumDriveablePart.rightWing)){
			plane.motionY += -1;
		}

		//Apply drag
		plane.motionX *= drag;
		if(plane.posY - plane.prevPosY < 0)
		{
			plane.motionY *= drag < 1? 0.999: 1;
		}
		else
		{
			plane.motionY *= drag;
		}
		plane.motionZ *= drag;

		plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);

		data.fuelInTank -= thrust * fuelConsumptionMultiplier * data.engine.fuelConsumption;

	}

	public void HeliModeFly(EntityPlane plane)
	{
		PlaneType type = plane.getPlaneType();
		DriveableData data = plane.getDriveableData();
		int numPropsWorking = 0;
		int numProps = 0;
		float fuelConsumptionMultiplier = 2F;

		//Count the number of working propellers
		for(Propeller prop : type.heliPropellers)
			if(plane.isPartIntact(prop.planePart))
				numPropsWorking++;
		numProps = type.heliPropellers.size();
		gravity = 0.05F;
		//Got no propellers. Derp.
		if(numProps == 0)
			return;

		Vector3f up = (Vector3f)plane.axes.getYAxis().normalise();

		thrust *= numPropsWorking / numProps * 2F;

		float upwardsForce = throttle * thrust + (gravity - thrust / 2F);
		if(throttle < 0.5F)
			upwardsForce = gravity * throttle * 2F;

		if(!plane.isPartIntact(EnumDriveablePart.blades))
		{
			upwardsForce = 0F;
		}

		if(throttle < 0.52F && throttle > 0.48F && up.y >= 0.7F){
			upwardsForce = gravity/up.y;
		}
		if(plane.getPlaneType().mode != EnumPlaneMode.VTOL){
			//Move up
			if(up.y < 0){
				up.y*=-1;
				up.x*=-1;
				up.z*=-1;
			}
		}

		//Throttle - 0.5 means that the positive throttle scales from -0.5 to +0.5. Thus it accounts for gravity-ish
		plane.motionX += upwardsForce * up.x * 0.5F;
		plane.motionY += (upwardsForce * up.y) - gravity;
		plane.motionZ += upwardsForce * up.z * 0.5F;

		//Apply wobble
		//motionX += rand.nextGaussian() * wobbleFactor;
		//motionY += rand.nextGaussian() * wobbleFactor;
		//motionZ += rand.nextGaussian() * wobbleFactor;
		drag = 1-(1-drag)/5;
		//Apply drag
		plane.motionX *= drag;
		plane.motionY *= drag;
		plane.motionZ *= drag;

		plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);

		data.fuelInTank -= upwardsForce * fuelConsumptionMultiplier * data.engine.fuelConsumption;
	}

}
