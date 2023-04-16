package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AAGunType extends InfoType
{
	/** The ammo types used by this gun */
	public List<BulletType> ammo = new ArrayList<BulletType>();
	public int reloadTime;
	public int recoil = 5;
	public int accuracy;
	public int damage;
	public int shootDelay;
	public int numBarrels;
	public boolean fireAlternately;
	public int health;
	public int gunnerX, gunnerY, gunnerZ;
	public String shootSound;
	public String reloadSound;
	public ModelAAGun model;
	public float topViewLimit = 75F;
	public float bottomViewLimit = 0F;
	public int[] barrelX, barrelY, barrelZ;
	/** Sentry mode. If target players is true then it either targets everyone on the other team, or everyone other than the owner when not playing with teams */
	public boolean targetMobs = false, targetPlayers = false, targetVehicles = false, targetPlanes = false, targetMechas = false;
	/** Targeting radius */
	public float targetRange = 10F;
	/** If true, then all barrels share the same ammo slot */
	public boolean shareAmmo = false;
	
	public boolean canShootHomingMissile = false;
	public int countExplodeAfterShoot = -1;
	public boolean isDropThis = true;

	public static List<AAGunType> infoTypes = new ArrayList<AAGunType>();

	public AAGunType(TypeFile file) {
		super(file);
		infoTypes.add(this);
	}

	@Override
	protected void preRead(TypeFile file) { }

	@Override
	protected void postRead(TypeFile file) { }
	
	@Override
	protected void read(ConfigMap config, TypeFile file) {
		super.read(config, file);
		try {
			if (FMLCommonHandler.instance().getSide().isClient() && config.containsKey("Model"))
				model = FlansMod.proxy.loadModel(config.get("Model"), shortName, ModelAAGun.class);
			texture = ConfigUtils.configString(config, "Texture", texture);
			damage = ConfigUtils.configInt(config, "Damage", damage);
			reloadTime = ConfigUtils.configInt(config, "ReloadTime", reloadTime);
			recoil = ConfigUtils.configInt(config, "Recoil", recoil);
			accuracy = ConfigUtils.configInt(config, "Accuracy", accuracy);
			shootDelay = ConfigUtils.configInt(config, "ShootDelay", shootDelay);
			shootSound = ConfigUtils.configAASound(packName, config, "ShootSound", shootSound);
			reloadSound = ConfigUtils.configAASound(packName, config, "ReloadSound", reloadSound);
			fireAlternately = ConfigUtils.configBool(config, "FireAlternately", fireAlternately);
			if (config.containsKey("NumBarrels")) {
				String[] split = config.get("NumBarrels").split(" ");
				numBarrels = Integer.parseInt(split[1]);
				barrelX = new int[numBarrels];
				barrelY = new int[numBarrels];
				barrelZ = new int[numBarrels];
			}
			if(config.containsKey("Barrel")) {
				String[] split = config.get("Barrel").split(" ");
				int id = Integer.parseInt(split[1]);
				barrelX[id] = Integer.parseInt(split[2]);
				barrelY[id] = Integer.parseInt(split[3]);
				barrelZ[id] = Integer.parseInt(split[4]);
			}
			health = ConfigUtils.configInt(config, "Health", health);
			topViewLimit = ConfigUtils.configFloat(config, "TopViewLimit", topViewLimit);
			bottomViewLimit = ConfigUtils.configFloat(config, "BottomViewLimit", bottomViewLimit);
			if (config.containsKey("Ammo")) {
				BulletType type = BulletType.getBullet(config.get("Ammo"));
				if (type != null) {
					ammo.add(type);
				}
			}
			if (config.containsKey("GunnerPos")) {
				String[] split = config.get("GunnerPos").split(" ");
				gunnerX = Integer.parseInt(split[1]);
				gunnerY = Integer.parseInt(split[2]);
				gunnerZ = Integer.parseInt(split[3]);
			}
			targetMobs = ConfigUtils.configBool(config, "TargetMobs", targetMobs);
			targetPlayers = ConfigUtils.configBool(config, "TargetPlayers", targetPlayers);
			targetVehicles = ConfigUtils.configBool(config, "TargetVehicles", targetVehicles);
			targetPlanes = ConfigUtils.configBool(config, "TargetPlanes", targetPlanes);
			targetMechas = ConfigUtils.configBool(config, "TargetMechas", targetMechas);
			if(config.containsKey("TargetDriveables"))
				targetMechas = targetPlanes = targetVehicles = Boolean.parseBoolean(config.get("TargetDriveables"));
			shareAmmo = ConfigUtils.configBool(config, "ShareAmmo", shareAmmo);
			targetRange = ConfigUtils.configFloat(config, "TargetRange", targetRange);
			canShootHomingMissile = ConfigUtils.configBool(config, "CanShootHomingMissile", canShootHomingMissile);
			countExplodeAfterShoot = ConfigUtils.configInt(config, "CountExplodeAfterShoot", countExplodeAfterShoot);
			isDropThis = ConfigUtils.configBool(config, "IsDropThis", isDropThis);

		} catch (Exception e) {
			FlansMod.log("Failed to read AA Gun file " + e);
		}
	}

	public boolean isAmmo(BulletType type)
	{
		return ammo.contains(type);
	}

	public boolean isAmmo(ItemStack stack) {
		if (stack == null)
			return false;
		return stack.getItem() instanceof ItemBullet && isAmmo(((ItemBullet) stack.getItem()).type);
	}

	public static AAGunType getAAGun(String s) {
		for (AAGunType gun : infoTypes) {
			if (gun.shortName.equals(s))
				return gun;
		}
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelAAGun.class);
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
}
