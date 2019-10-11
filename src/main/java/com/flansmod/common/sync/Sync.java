package com.flansmod.common.sync;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.ArrayList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
// Flans types
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GrenadeType;
// import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.teams.ArmourType;
// import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.tools.ToolType;

import com.flansmod.common.network.PacketHashSend;

import net.minecraft.entity.player.EntityPlayer;


public class Sync {
	private static Gson gsonWriter = new GsonBuilder().setExclusionStrategies(new SyncExclusionStrategy()).create();

	private static HashMap<String, Boolean> cachedTypes = new HashMap<String, Boolean>();

	public static String getHash(Object type) {
		String str = gsonWriter.toJson(type);
		String hash = "";
		try {
			MessageDigest digester = MessageDigest.getInstance("SHA-512");
			byte[] encodedhash = digester.digest(str.getBytes(StandardCharsets.UTF_8));
			hash =  Hex.encodeHexString(encodedhash);
		} catch (Exception e) {
			FlansMod.log("[Sync] Error has occured.");
			e.printStackTrace(); 
		}
		return hash;
	}

	public static boolean checkType(InfoType type) {
		String clientHash = getHash(type);
		String typeName = "";
		if (GunType.class.isInstance(type)) { typeName = "Gun"; }
		else if (AAGunType.class.isInstance(type)) { typeName = "AAGun"; }
		else if (AttachmentType.class.isInstance(type)) { typeName = "Attachment"; }
		else if (GrenadeType.class.isInstance(type)) { typeName = "Grenade"; }
		else if (MechaItemType.class.isInstance(type)) { typeName = "MechaItem"; }
		else if (MechaType.class.isInstance(type)) { typeName = "Mecha"; }
		else if (VehicleType.class.isInstance(type)) { typeName = "Vehicle"; }
		else if (PlaneType.class.isInstance(type)) { typeName = "Plane"; }
		else if (ArmourType.class.isInstance(type)) { typeName = "Armour"; }
		else if (ToolType.class.isInstance(type)) { typeName = "Tool"; }
		else { return false; }
		FlansMod.getPacketHandler().sendToServer(new PacketHashSend(clientHash, type.shortName, typeName));
		// Somehow.. wait for a packet?
		String serverHash = "";
		return (clientHash == serverHash);
	}

	public static boolean checkPlayerType(InfoType type, EntityPlayer player) {
		if (player.getEntityWorld().isRemote) {
			return true;
		}

		// Player doesn't already exist, create an entry.
		if (!cachedTypes.containsKey(type.shortName)) {
			if (checkType(type)) {
				cachedTypes.put(type.shortName, true);
				return true;
			} else {
				cachedTypes.put(type.shortName, false);
				// Send message to player, ez win
				return false;
			}
		} else {
			if (cachedTypes.get(type.shortName)) {
				// Has been verified by server and cached
				return true;
			} else {
				// Has been checked, did not match. return false, we got a heck on our hands here
				return false;
			}
		}
	}
}
