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

	public static String configString(ConfigMap config, String[] settingNames, String defaultValue) {
		for (String name : settingNames) {
			if(config.containsKey(name.toLowerCase())) {
				return config.get(name.toLowerCase());
			}
		}

		return defaultValue;
	}

	public static int configInt(ConfigMap config, String settingName, int defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Integer.parseInt(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static int configInt(ConfigMap config, String[] settingNames, int defaultValue) {
		for (String name : settingNames) {
			if(config.containsKey(name.toLowerCase())) {
				return Integer.parseInt(config.get(name.toLowerCase()));
			}
		}

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

	public static float configFloat(ConfigMap config, String[] settingNames, float defaultValue) {
		for (String name : settingNames) {
			if(config.containsKey(name.toLowerCase())) {
				return Float.parseFloat(config.get(name.toLowerCase()));
			}
		}

		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String settingName, boolean defaultValue) {
		if(config.containsKey(settingName.toLowerCase()))
			return Boolean.parseBoolean(config.get(settingName.toLowerCase()));
		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String[] settingNames, boolean defaultValue) {
		for (String name : settingNames) {
			if(config.containsKey(name.toLowerCase())) {
				return Boolean.parseBoolean(config.get(name.toLowerCase()));
			}
		}

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

	public static String configSound(String contentPack, ConfigMap config, String[] settingNames, String defaultValue) {
		for (String name : settingNames) {
			if(config.containsKey(name.toLowerCase())) {
				FlansMod.proxy.loadSound(contentPack, "guns", config.get(name.toLowerCase()));
				return config.get(name.toLowerCase());
			}
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

	public static String[] getSplitFromKey (ConfigMap config, String[] keys) {
		for (String key : keys) {
			if (config.containsKey(key)) {
				String[] dataPieces = config.get(key).split(" ");
				String[] split = new String[dataPieces.length + 1];
				split[0] = key;
				for (int i = 0; i < dataPieces.length; i++) {
					split[i+1] = dataPieces[i];
				}
				return split;
			}
		}

		return null;
	}

	public static Vector3f configVector3f(ConfigMap config, String key, Vector3f original) {

		if (config.containsKey(key)) {
			String[] inp = getSplitFromKey(config, key);
			return new Vector3f(Float.parseFloat(inp[1]), Float.parseFloat(inp[2]), Float.parseFloat(inp[3]));
		}

		return original;
	}
}
