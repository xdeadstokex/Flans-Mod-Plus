package com.flansmod.common.driveables.mechas;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.PilotGun;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;

public class MechaType extends DriveableType 
{
	/** Movement modifiers */
	public float turnLeftModifier = 1F, turnRightModifier = 1F, moveSpeed = 1F;
	/** If true, this will crush any living entity under the wheels */
	public boolean squashMobs = false;
	/** How many blocks can be stepped up when walking */
	public int stepHeight = 0;
	/** Jump Height (set 0 for no jump) */
	public float jumpHeight = 1F;
	public float jumpVelocity = 1F;
	/** Speed of Rotation */
	public float rotateSpeed = 10F;
	/** Origin of the mecha arms */
	public Vector3f leftArmOrigin, rightArmOrigin;
	/** Length of the mecha arms and legs */
	public float armLength = 1F, legLength = 1F;
	/** The amount to scale the held items / tools by when rendering */
	public float heldItemScale = 1F;
	/** Height and Width of the world collision box */
	public float height = 3F, width = 2F;
	/** The height of chassis above the ground; for use when legs are gone */
	public float chassisHeight = 1F;
	
	/** The default reach of tools. Tools can multiply this base reach as they wish */
	public float reach = 10F;
	
	//Falling
	/** Whether the mecha damages blocks when falling. Can be overriden by upgrades */
	public boolean damageBlocksFromFalling = true;
	/** The size of explosion to cause, per fall damage */
	public float blockDamageFromFalling = 1F;
	
	/** Whether the mecha takes fall damage. Can be overriden by upgrades */
	public boolean takeFallDamage = true;
	/** How much fall damage the mecha takes by default */
	public float fallDamageMultiplier = 1F;
	
	/** Leg Swing Limit */
	public float legSwingLimit = 2F;	

	// Limiting head turning
	public boolean limitHeadTurn = false;
	public float limitHeadTurnValue = 90F;

	// Speed of Leg movement
	public float legSwingTime = 5;

	// Upper/Lower Arm Limit
	public float upperArmLimit = 90;
	public float lowerArmLimit = 90;

	// Modifier for Weapons in Hand
	public float leftHandModifierX = 0;
	public float leftHandModifierY = 0;
	public float leftHandModifierZ = 0;
	public float rightHandModifierX = 0;
	public float rightHandModifierY = 0;
	public float rightHandModifierZ = 0;

	public ArrayList<LegNode> legNodes = new ArrayList<LegNode>();
		
	public float legAnimSpeed = 0;

	public String stompSound = "";	
	public int stompSoundLength = 0;
	public float stompRangeLower = 0F;
	public float stompRangeUpper = 0F;

	public boolean restrictInventoryInput = false;
	public boolean allowMechaToolsInRestrictedInv = true;

	public static ArrayList<MechaType> types = new ArrayList<MechaType>();

	public MechaType(TypeFile file)
	{
		super(file);
		types.add(this);
	}
	
    @Override
	protected void read(ConfigMap config, TypeFile file) {
		super.read(config, file);
		try {
			//Movement modifiers
			turnLeftModifier = ConfigUtils.configFloat(config, "TurnLeftSpeed", turnLeftModifier);
			turnRightModifier = ConfigUtils.configFloat(config, "TurnRightSpeed", turnRightModifier);
			moveSpeed = ConfigUtils.configFloat(config, "MoveSpeed", moveSpeed);
			squashMobs = ConfigUtils.configBool(config, "SquashMobs", squashMobs);
			stepHeight = ConfigUtils.configInt(config, "StepHeight", stepHeight);
			if(config.containsKey("JumpHeight")) {
				jumpHeight = Float.parseFloat(config.get("JumpHeight"));
				jumpVelocity = (float) Math.sqrt(Math.abs(9.81F * (jumpHeight + 0.2F) / 200F));
			}
			rotateSpeed = ConfigUtils.configFloat(config, "RotateSpeed", rotateSpeed);
			stompSound = ConfigUtils.configDriveableSound(contentPack, config, "StompSound", stompSound);
			stompSoundLength = ConfigUtils.configInt(config, "StompSoundLength", stompSoundLength);
			stompRangeLower = ConfigUtils.configFloat(config, "StompRangeLower", stompRangeLower);
			stompRangeUpper = ConfigUtils.configFloat(config, "StompRangeUpper", stompRangeUpper);

			if(config.containsKey("LeftArmOrigin")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "LeftArmOrigin");
				leftArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			}

			if(config.containsKey("RightArmOrigin")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "RightArmOrigin");
				rightArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			}

			armLength = ConfigUtils.configFloat(config, "ArmLength", armLength) / 16F;
			legLength = ConfigUtils.configFloat(config, "LegLength", legLength) / 16F;
			heldItemScale = ConfigUtils.configFloat(config, "HeldItemScale", heldItemScale);
			height = ConfigUtils.configFloat(config, "Height", height);
			width = ConfigUtils.configFloat(config, "Width", width);
			if(config.containsKey("ChassisHeight"))
				chassisHeight = (Integer.parseInt(config.get("ChassisHeight")))/16F;

			fallDamageMultiplier = ConfigUtils.configFloat(config, "FallDamageMultiplier", fallDamageMultiplier);
			blockDamageFromFalling = ConfigUtils.configFloat(config, "BlockDamageFromFalling", blockDamageFromFalling);
			reach = ConfigUtils.configFloat(config, "Reach", reach);
			takeFallDamage = ConfigUtils.configBool(config, "TakeFallDamage", takeFallDamage);
			damageBlocksFromFalling = ConfigUtils.configBool(config, "DamageBlocksFromFalling", damageBlocksFromFalling);
			legSwingLimit = ConfigUtils.configFloat(config, "LegSwingLimit", legSwingLimit);

			if(config.containsKey("LimitHeadTurn")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "LeftHandModifier");
				limitHeadTurn = Boolean.parseBoolean(split[1].toLowerCase());
				limitHeadTurnValue = Float.parseFloat(split[2]);
			}
			legSwingTime = ConfigUtils.configFloat(config, "LegSwingTime", legSwingTime);
			upperArmLimit = ConfigUtils.configFloat(config, "UpperArmLimit", upperArmLimit);
			lowerArmLimit = ConfigUtils.configFloat(config, "LowerArmLimit", lowerArmLimit);
			if(config.containsKey("LeftHandModifier")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "LeftHandModifier");
				leftHandModifierX = Float.parseFloat(split[1])/16F;
				leftHandModifierY = Float.parseFloat(split[2])/16F;
				leftHandModifierZ = Float.parseFloat(split[3])/16F;
			}
			if(config.containsKey("RightHandModifier")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "RightHandModifier");
				rightHandModifierX = Float.parseFloat(split[1])/16F;
				rightHandModifierY = Float.parseFloat(split[2])/16F;
				rightHandModifierZ = Float.parseFloat(split[3])/16F;
			}

			if(config.containsKey("LegNode")){
				String[] split = ConfigUtils.getSplitFromKey(config, "LegNode");
				LegNode node = new LegNode();
				node.rotation = Integer.parseInt(split[1]);
				node.lowerBound = Float.parseFloat(split[2]);
				node.upperBound = Float.parseFloat(split[3]);
				node.speed = Integer.parseInt(split[4]);
				node.legPart = Integer.parseInt(split[5]);
				legNodes.add(node);
			}
			legAnimSpeed = ConfigUtils.configFloat(config, "LegAnimSpeed", legAnimSpeed);
			restrictInventoryInput = ConfigUtils.configBool(config, "RestrictInventoryInput", restrictInventoryInput);
			allowMechaToolsInRestrictedInv = ConfigUtils.configBool(config, "AllowMechaToolsInRestrictedInv", allowMechaToolsInRestrictedInv);

		} catch (Exception ignored) {

		}
    }
    
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelMecha.class);
	}
    
    private DriveablePosition getShootPoint(String[] split) {
    	//No need to look for a specific gun.
    	if(split.length == 5) {
    		return new DriveablePosition(split);
    	}
		return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
	}
	
	public static MechaType getMecha(String find) {
		for(MechaType type : types) {
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	
	public class LegNode {
		public int rotation;
		public float lowerBound;
		public float upperBound;
		public int speed;
		public int legPart;
	}
}
