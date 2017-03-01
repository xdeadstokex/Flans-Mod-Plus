package com.flansmod.client.model.animation;

import java.util.ArrayList;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.animation.PoseComponent;

public class AnimationController 
{
	public ArrayList<AnimationPart> parts = new ArrayList<AnimationPart>();
	public int state = 0;
	int animStage = 1;
	ArrayList<AnimationPose> poses = new ArrayList<AnimationPose>();
	AnimationPose pose;
	int timeSinceSwitch = 0;
	
	
	public void initAnim()
	{
		//core ALWAYS REGISTER THIS FIRST
		addPartToSkeleton(new AnimationPart(0, new Vector3f(-6,-38,0),new Vector3f(0,0,0),new Vector3f(0,0,0)), -1);//-1 for no parent
		//MidFront
		addPartToSkeleton(new AnimationPart(1, new Vector3f(-1,-30,0),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
		//Nose
		addPartToSkeleton(new AnimationPart(2, new Vector3f(-33,-37,0),new Vector3f(0,0,0),new Vector3f(0,0,0)), 1);
		//LeftLegTop
		addPartToSkeleton(new AnimationPart(3, new Vector3f(-44,-31,-18),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
		//LeftLegMid
		addPartToSkeleton(new AnimationPart(4, new Vector3f(-4,-22,-18),new Vector3f(0,0,0),new Vector3f(0,0,0)), 3);
		//LeftLegShin
		addPartToSkeleton(new AnimationPart(5, new Vector3f(34,-17,-20),new Vector3f(0,0,0),new Vector3f(0,0,0)), 4);
		//RightLegTop
		addPartToSkeleton(new AnimationPart(6, new Vector3f(-44,-31,18),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
		//RightLegMid
		addPartToSkeleton(new AnimationPart(7, new Vector3f(-4,-22,18),new Vector3f(0,0,0),new Vector3f(0,0,0)), 6);
		//RightLegShin
		addPartToSkeleton(new AnimationPart(8, new Vector3f(34,-17,20),new Vector3f(0,0,0),new Vector3f(0,0,0)), 7);
		//RearBody
		addPartToSkeleton(new AnimationPart(9, new Vector3f(1,-31,0),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
		//TailMid
		addPartToSkeleton(new AnimationPart(10, new Vector3f(49,-39,0),new Vector3f(0,0,0),new Vector3f(0,0,0)), 9);
		//FinLeft
		addPartToSkeleton(new AnimationPart(11, new Vector3f(54,-38,-14.5),new Vector3f(0,0,0),new Vector3f(0,0,0)), 10);
		//FinRight
		addPartToSkeleton(new AnimationPart(12, new Vector3f(54,-38,14.5),new Vector3f(0,0,0),new Vector3f(0,0,0)), 10);
		//LeftWing
		addPartToSkeleton(new AnimationPart(13, new Vector3f(0,-34,-46),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
		//RightWing
		addPartToSkeleton(new AnimationPart(14, new Vector3f(0,-34,46),new Vector3f(0,0,0),new Vector3f(0,0,0)), 0);
	}
	
	public void initPoses()
	{
		addDefaultPose();
		addGERWALKPose();
	}
	
	public void addDefaultPose()
	{
		AnimationPose pose = new AnimationPose();
		pose.parts.add(new PoseComponent("core",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("midfront",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("nose",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegmid",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegshin",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 4, false));
		pose.parts.add(new PoseComponent("rightlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightlegmid",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightlegshin",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 4, false));
		pose.parts.add(new PoseComponent("rearbody",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("tailmid",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 12, false));
		pose.parts.add(new PoseComponent("finleft",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 4, false));
		pose.parts.add(new PoseComponent("finright",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 4, false));
		pose.parts.add(new PoseComponent("leftwing",new Vector3f(0,0,0), new Vector3f(0,10,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightwing",new Vector3f(0,0,0), new Vector3f(0,-10,0), 2, 2, false));
		poses.add(pose);
	}
	
	public void addGERWALKPose()
	{
		AnimationPose pose = new AnimationPose();
		pose.parts.add(new PoseComponent("core",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("midfront",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("nose",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegmid",new Vector3f(0,0,0), new Vector3f(-20,0,-50), 2, 8, false));
		pose.parts.add(new PoseComponent("leftlegshin",new Vector3f(0,0,0), new Vector3f(0,0,-100), 2, 16, false));
		pose.parts.add(new PoseComponent("rightlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightlegmid",new Vector3f(0,0,0), new Vector3f(20,0,-50), 2, 8, false));
		pose.parts.add(new PoseComponent("rightlegshin",new Vector3f(0,0,0), new Vector3f(0,0,-100), 2, 16, false));
		pose.parts.add(new PoseComponent("rearbody",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("tailmid",new Vector3f(0,0,0), new Vector3f(0,0,170), 2, 12, false));
		pose.parts.add(new PoseComponent("finleft",new Vector3f(0,0,0), new Vector3f(-100,0,0), 2, 14, false));
		pose.parts.add(new PoseComponent("finright",new Vector3f(0,0,0), new Vector3f(100,0,0), 2, 14, false));
		pose.parts.add(new PoseComponent("leftwing",new Vector3f(0,0,0), new Vector3f(0,-20,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightwing",new Vector3f(0,0,0), new Vector3f(0,20,0), 2, 2, false));
		poses.add(pose);
		
		addGERWALK2();
	}
	
	public void addGERWALK2()
	{
		AnimationPose pose = new AnimationPose();
		pose.parts.add(new PoseComponent("core",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("midfront",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("nose",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("leftlegmid",new Vector3f(0,0,0), new Vector3f(-20,0,-50), 2, 3, false));
		pose.parts.add(new PoseComponent("leftlegshin",new Vector3f(-5,10,0), new Vector3f(0,0,-70), 2, 6, false));
		pose.parts.add(new PoseComponent("rightlegtop",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightlegmid",new Vector3f(0,0,0), new Vector3f(20,0,-50), 2, 3, false));
		pose.parts.add(new PoseComponent("rightlegshin",new Vector3f(-5,10,0), new Vector3f(0,0,-70), 2, 6, false));
		pose.parts.add(new PoseComponent("rearbody",new Vector3f(0,0,0), new Vector3f(0,0,0), 2, 2, false));
		pose.parts.add(new PoseComponent("tailmid",new Vector3f(0,0,0), new Vector3f(0,0,170), 2, 12, false));
		pose.parts.add(new PoseComponent("finleft",new Vector3f(0,0,0), new Vector3f(-100,0,0), 2, 14, false));
		pose.parts.add(new PoseComponent("finright",new Vector3f(0,0,0), new Vector3f(100,0,0), 2, 14, false));
		pose.parts.add(new PoseComponent("leftwing",new Vector3f(0,0,0), new Vector3f(0,-20,0), 2, 2, false));
		pose.parts.add(new PoseComponent("rightwing",new Vector3f(0,0,0), new Vector3f(0,20,0), 2, 2, false));
		poses.add(pose);
	}
	
	public void addPartToSkeleton(AnimationPart p, int parent)
	{
		parts.add(p);
		if(parent >= 0)
		{
			AnimationPart part = parts.get(parent);
			part.hasChildren = true;
			part.children.add(p);
			p.parent = parent;
		}
	}
	
	public AnimationPart getCorePart()
	{
		AnimationPart part = parts.get(0);

		return part;
	}
	
	public void UpdateAnim(int stat)
	{

		switch(state)
		{
			case 0: 
			{
				pose = poses.get(0); 
				animStage = 1;// Fighter mode
				timeSinceSwitch = 0;
			}
			break;
			case 1:
			{
				if(animStage == 1) pose = poses.get(1);
				else if(animStage==2) pose = poses.get(2);// GERWALK mode
			}
		}
		boolean animHasFinished = true;
		for(AnimationPart p: parts)
		{
			p.prevOff = p.offset;
			p.prevRot = p.rotation;
			if(pose != null){
				PoseComponent q = pose.parts.get(p.type);
				if(!checkIfFinished(p.offset, q.position))
				p.offset = transformPart(p.offset, q.position, new Vector3f(q.speed1,q.speed1,q.speed1));
				if(animHasFinished)
				animHasFinished = checkIfFinished(p.offset, q.position);
				if(!checkIfFinished(p.rotation, q.rotation))
				p.rotation = transformPart(p.rotation, q.rotation, new Vector3f(q.speed2,q.speed2,q.speed2));
				if(animHasFinished)
				animHasFinished = checkIfFinished(p.rotation, q.rotation);
			}
		}
		if(animHasFinished && timeSinceSwitch > 2) animStage ++;
		timeSinceSwitch ++;
	}
	
	public void changeState(int i)
	{
		state = i;
		animStage = 1;
		timeSinceSwitch = 0;
	}
	
	public boolean checkIfFinished(Vector3f a, Vector3f b)
	{
		boolean c = true;
		float d = a.lengthSquared();
		float e = b.lengthSquared();
		
		float f = d-e;
		
		f = (float)Math.sqrt(f*f);
		if(f > 0) c = false;
		
		return c;
	}
	
	public int getNumberOfStages()
	{
		int i = 0;
		switch(state)
		{
			case 0: i = 1; // Fighter mode
			break;
			case 1: i = 2;
		}
		return i;
	}
	
	public Vector3f getPositionOnPart(Vector3f in, AnimationPart p, RotatedAxes rot)
	{
		Vector3f p1 = p.position;
		Vector3f p2 = in;
		//Sub P1 from P2
		p.rotateToPartAxis(rot);
		p1 = rot.findLocalVectorGlobally(p1);
		p2 = rot.findLocalVectorGlobally(p2);
		Vector3f trans = new Vector3f(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);

		return trans;
	}
	
	public Vector3f getFullPosition(Vector3f in, AnimationPart p)
	{
		AnimationPart core = getCorePart();
		Vector3f pos = new Vector3f(core.position.x,core.position.y,core.position.z);
		RotatedAxes rot = new RotatedAxes(0,0,0);
		ArrayList<Integer> chain = new ArrayList<Integer>();
		chain = generateChain(p, chain);
		for(int i = chain.size() - 1; i > 0; i--)
		{
			AnimationPart child = parts.get(chain.get(i-1));
			AnimationPart part = parts.get(chain.get(i));		
			Vector3f tPos = getPositionOnPart(Vector3f.add(child.position,  new Vector3f(child.offset.x, -child.offset.y, child.offset.z), null), part, rot);
			Vector3f.add(tPos, pos, pos);
		}

		Vector3f tPos = getPositionOnPart(Vector3f.add(in,  new Vector3f(p.offset.x, -p.offset.y, p.offset.z), null), p, rot);
		Vector3f.add(tPos, pos, pos);
		return pos;
	}
	
	
	public ArrayList<Integer> generateChain(AnimationPart p, ArrayList<Integer> i)
	{
		i.add(p.type);
		if(p.parent >= 0) generateChain(parts.get(p.parent), i);
		return i;
	}
	
	public Vector3f transformPart(Vector3f current, Vector3f target, Vector3f rate){
		Vector3f newPos = current;

		if(Math.sqrt((current.x - target.x)*(current.x - target.x)) > rate.x/2){
			if(current.x > target.x){
				current.x = current.x - rate.x;
			} else if (current.x < target.x){
				current.x = current.x + rate.x;
			}
		} else {
			current.x = target.x;
		}

		if(Math.sqrt((current.y - target.y)*(current.y - target.y)) > rate.y/2){
			if(current.y > target.y){
				current.y = current.y - rate.y;
			} else if (current.y < target.y){
				current.y = current.y + rate.y;
			}
		} else {
			current.y = target.y;
		}

		if(Math.sqrt((current.z - target.z)*(current.z - target.z)) > rate.z/2){
			if(current.z > target.z){
				current.z = current.z - rate.z;
			} else if (current.z < target.z){
				current.z = current.z + rate.z;
			}
		} else {
			current.z = target.z;
		}

		return newPos;
	}
}
