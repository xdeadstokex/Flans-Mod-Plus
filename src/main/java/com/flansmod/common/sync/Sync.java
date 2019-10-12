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

	public static HashMap<String, String> typeHashes = new HashMap<String, String>();

	public static String getStringHash(String str) {
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

	public static String getHash(Object type) {
		String str = gsonWriter.toJson(type);
		return getStringHash(str);
	}

	public static void checkAllOfType(ArrayList<?> types, String typeName) {
		typeHashes.put(typeName, getHash(types));
	}

	public static String getUnifiedHash() {
		String str = "";
		for (String hash : typeHashes.values()) {
			str += hash;
		}

		return getStringHash(str);
	}
}
