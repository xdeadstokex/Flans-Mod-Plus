package com.flansmod.utils;

import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

public class ConfigUtils
{
	public static String configString(ConfigMap config, String settingName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return config.get(settingName.toLowerCase());
		return defaultValue;
	}

	public static String configString(ConfigMap config, String settingName, String optionalName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return config.get(settingName.toLowerCase());
		if(config.containsKey(optionalName.toLowerCase()))
			return config.get(optionalName.toLowerCase());
		return defaultValue;
	}

	public static int configInt(ConfigMap config, String settingName, int defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Integer.parseInt(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static int configInt(ConfigMap config, String settingName, String optionalName, int defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Integer.parseInt(config.get(settingName.toLowerCase()));
		if(config.containsKey(optionalName.toLowerCase()))
			return Integer.parseInt(config.get(optionalName.toLowerCase()));
		return defaultValue;
	}

	public static int configInt(ConfigMap config, String settingName, String optionalName, String secondOptional, int defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Integer.parseInt(config.get(settingName.toLowerCase()));
		if(config.containsKey(optionalName.toLowerCase()))
			return Integer.parseInt(config.get(optionalName.toLowerCase()));
		if(config.containsKey(secondOptional.toLowerCase()))
			return Integer.parseInt(config.get(secondOptional.toLowerCase()));
		return defaultValue;
	}

	public static float configFloat(ConfigMap config, String settingName, float defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Float.parseFloat(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static double configDouble(ConfigMap config, String settingName, double defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Float.parseFloat(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static float configFloat(ConfigMap config, String settingName, String optionalName, float defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Float.parseFloat(config.get(settingName.toLowerCase()));
		if(config.containsKey(optionalName.toLowerCase()))
			return Float.parseFloat(config.get(optionalName.toLowerCase()));
		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String settingName, boolean defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Boolean.parseBoolean(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String settingName, String optionalName, boolean defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Boolean.parseBoolean(config.get(settingName.toLowerCase()));
		else if (config.containsKey(optionalName.toLowerCase()))
			return Boolean.parseBoolean(config.get(optionalName.toLowerCase()));
		return defaultValue;
	}

	public static String configSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "sound", config.get(settingName.toLowerCase()));
			return config.get(settingName.toLowerCase());
		}

		return defaultValue;
	}

	public static String configGunSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "guns", config.get(settingName.toLowerCase()));
			return config.get(settingName.toLowerCase());
		}

		return defaultValue;
	}

	public static String configAASound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "aaguns", config.get(settingName.toLowerCase()));
			return config.get(settingName.toLowerCase());
		}

		return defaultValue;
	}

	public static String configDriveableSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "driveables", config.get(settingName.toLowerCase()));
			return config.get(settingName.toLowerCase());
		}

		return defaultValue;
	}

	public static String configSound(String contentPack, ConfigMap config, String settingName, String optionalName, String defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "guns", config.get(settingName.toLowerCase()));
			return config.get(settingName.toLowerCase());
		}
		if(config.containsKey(optionalName.toLowerCase())) {
			FlansMod.proxy.loadSound(contentPack, "guns", config.get(optionalName.toLowerCase()));
			return config.get(optionalName.toLowerCase());
		}

		return defaultValue;
	}

	public static Vector3f configVector(ConfigMap config, String settingName, Vector3f defaultValue) {
		if(config.containsKey(settingName.toLowerCase())) {
			return new Vector3f(config.get(settingName.toLowerCase()), null);
		}

		return defaultValue;
	}

	public static Vector3f configVector(ConfigMap config, String settingName, Vector3f defaultValue, String shortName) {
		if(config.containsKey(settingName.toLowerCase())) {
			return new Vector3f(config.get(settingName.toLowerCase()), shortName);
		}

		return defaultValue;
	}

	public static String[] getSplitFromKey (ConfigMap config, String key) {
		String[] dataPieces = config.get(key).split(" ");
		String[] split = new String[dataPieces.length + 1];
		split[0] = key;
		for (int i = 0; i < dataPieces.length; i++) {
			split[i+1] = dataPieces[i];
		}
		return split;
	}
}
