package com.flansmod.common.sync;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.ArrayList;

import com.flansmod.common.FlansMod;

import net.minecraft.entity.player.EntityPlayer;


public class Sync {
	private static Gson gsonWriter = new GsonBuilder().setExclusionStrategies(new SyncExclusionStrategy()).create();

	private static HashMap<String, boolean> cachedTypes = new HashMap<String, boolean>();

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

	public static boolean checkType(Object type) {
		String clientHash = getHash(type);
		// Somehow.. wait for a packet?
		String serverHash = "";
		return (clientHash == serverHash);
	}

	public static boolean checkPlayerType(Object type, EntityPlayer player) {
		if (player.getEntityWorld().isRemote) {
			return true;
		}

		// Player doesn't already exist, create an entry.
		if (!cachedTypes.containsKey(type.shortname)) {
			if (checkType(type.shortname)) {
				cachedTypes.put(type.shortname, true);
				return true;
			} else {
				cachedTypes.put(type.shortname, false);
				// Send message to player, ez win
				return false;
			}
		} else {
			if (cachedTypes.get(type.shortname)) {
				// Has been verified by server and cached
				return true;
			} else {
				// Has been checked, did not match. return false, we got a heck on our hands here
				return false;
			}
		}

		return true;
	}
}
