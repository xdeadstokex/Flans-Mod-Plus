package com.flansmod.common.sync;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

import com.flansmod.common.FlansMod;

public class Sync {
	private static Gson gsonWriter = new GsonBuilder().setExclusionStrategies(new SyncExclusionStrategy()).create();

	public static boolean checkType(Object type) {
		String str = gsonWriter.toJson(type);
		FlansMod.log(str);
		try {
			MessageDigest digester = MessageDigest.getInstance("SHA-512");
			byte[] encodedhash = digester.digest(str.getBytes(StandardCharsets.UTF_8));
			FlansMod.log("Hash: " + Hex.encodeHexString(encodedhash));
		} catch (Exception e) {
			FlansMod.log("[Sync] Error has occured.");
			e.printStackTrace(); 
		}

		
		return true;
	}
}
