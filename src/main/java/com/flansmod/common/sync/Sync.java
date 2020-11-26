package com.flansmod.common.sync;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

import com.flansmod.common.FlansMod;



public class Sync {
	public static ArrayList<String> hashes = new ArrayList<String>();

	public static String cachedHash = "";

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

	public static String getUnifiedHash() {
		String str = "";
		Collections.sort(hashes);
		for (String hash : hashes) {
			str += hash;
		}
		cachedHash = getStringHash(str);
		return cachedHash;
	}

	public static void addHash(String str) {
		hashes.add(getStringHash(str));
	}
}
