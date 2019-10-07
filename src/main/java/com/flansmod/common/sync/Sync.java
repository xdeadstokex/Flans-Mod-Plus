package com.flansmod.common.sync;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.UUID;

import com.flansmod.common.FlansMod;

import net.minecraft.entity.player.EntityPlayer;


public class Sync {
	private static Gson gsonWriter = new GsonBuilder().setExclusionStrategies(new SyncExclusionStrategy()).create();

	private static HashMap<UUID, ArrayList<String>> playerTypes = new HashMap<UUID, ArrayList<String>>();

	public static boolean checkType(Object type) {
		String str = gsonWriter.toJson(type);
		try {
			MessageDigest digester = MessageDigest.getInstance("SHA-512");
			byte[] encodedhash = digester.digest(str.getBytes(StandardCharsets.UTF_8));
			FlansMod.log("Hash: " + Hex.encodeHexString(encodedhash));
		} catch (Exception e) {
			FlansMod.log("[Sync] Error has occured.");
			e.printStackTrace(); 
		}

		// Send server packet
		return true;
	}

	public static boolean checkPlayerType(Object type, EntityPlayer player) {
		if (player.getEntityWorld().isRemote) {
			return true;
		}

		UUID playerID = player.func_145748_c_();

		// Player doesn't already exist, create an entry.
		if (!playerTypes.containsKey(playerID)) 
			playerTypes.put(playerID, new ArrayList<String>());

		if (playerTypes.get(playerID).contains(type.shortname)) {
			return true;
		} else {
			if (checkType(type)) {
				playerTypes.get(playerID).add(type.shortname);
			} else {
				// Log to file, send player a message?
			}
		}

		return true;
	}
}
