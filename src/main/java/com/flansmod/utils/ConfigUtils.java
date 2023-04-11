package com.flansmod.utils;

import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

import java.util.ArrayList;

public class ConfigUtils
{
	public static String configString(ConfigMap config, String settingName, String defaultValue) {
		String val = config.get(settingName.toLowerCase());
		if(val != null)
			return val;
		return defaultValue;
	}

	public static String configString(ConfigMap config, String[] settingNames, String defaultValue) {
		for (String name : settingNames) {
			String val = config.get(name.toLowerCase());
			if(val != null) {
				return val;
			}
		}

		return defaultValue;
	}

	public static int configInt(ConfigMap config, String settingName, int defaultValue) {
		String val = config.get(settingName.toLowerCase());
		if (val != null) {
			return Integer.parseInt(val);
		}

		return defaultValue;
	}

	public static int configInt(ConfigMap config, String[] settingNames, int defaultValue) {
		for (String name : settingNames) {
			String val = config.get(name.toLowerCase());
			if(val != null) {
				return Integer.parseInt(val);
			}
		}

		return defaultValue;
	}

	public static float configFloat(ConfigMap config, String settingName, float defaultValue) {
		String val = config.get(settingName.toLowerCase());
		if(val != null)
			return Float.parseFloat(val);
		return defaultValue;
	}

	public static float configFloat(ConfigMap config, String[] settingNames, float defaultValue) {
		for (String name : settingNames) {
			String val = config.get(name.toLowerCase());
			if(val != null) {
				return Float.parseFloat(val);
			}
		}

		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String settingName, boolean defaultValue) {
		String val = config.get(settingName.toLowerCase());
		if(val != null)
			return Boolean.parseBoolean(val);
		return defaultValue;
	}

	public static boolean configBool(ConfigMap config, String[] settingNames, boolean defaultValue) {
		for (String name : settingNames) {
			String val = config.get(name.toLowerCase());
			if(val != null) {
				return Boolean.parseBoolean(val);
			}
		}

		return defaultValue;
	}

	public static String configSound(String contentPack, ConfigMap config, String settingName, String defaultValue, String type) {
		String val = config.get(settingName.toLowerCase());
		if(val != null) {
			FlansMod.proxy.loadSound(contentPack, type, val);
			return val;
		}

		return defaultValue;
	}

	public static String configSound(String contentPack, ConfigMap config, String[] settingNames, String defaultValue, String type) {
		for (String name : settingNames) {
			String val = config.get(name.toLowerCase());
			if(val != null) {
				FlansMod.proxy.loadSound(contentPack, type, val);
				return val;
			}
		}

		return defaultValue;
	}

	public static String configSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		return configSound(contentPack, config, settingName, defaultValue, "sound");
	}

	public static String configGunSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		return configSound(contentPack, config, settingName, defaultValue, "guns");
	}

	public static String configGunSound(String contentPack, ConfigMap config, String[] settingNames, String defaultValue) {
		return configSound(contentPack, config, settingNames, defaultValue, "guns");
	}


	public static String configAASound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		return configSound(contentPack, config, settingName, defaultValue,"aaguns");
	}

	public static String configDriveableSound(String contentPack, ConfigMap config, String settingName, String defaultValue) {
		return configSound(contentPack, config, settingName, defaultValue, "driveables");
	}

	public static String configDriveableSound(String contentPack, ConfigMap config, String[] settingNames, String defaultValue) {
		return configSound(contentPack, config, settingNames, defaultValue, "driveables");
	}

	public static Vector3f configVector(ConfigMap config, String settingName, Vector3f defaultValue) {
		return configVector(config, settingName, defaultValue, 1F);
	}

	public static Vector3f configVector(ConfigMap config, String settingName, Vector3f defaultValue, float scale) {
		String val = config.get(settingName);
		if(val != null) {
			return (Vector3f) new Vector3f(val).scale(scale);
		}

		return defaultValue;
	}

	public static String[] getSplitFromKey (ConfigMap config, String key) {
		return getSplitFromKey(config, new String[] {key});
	}

	public static String[] getSplitFromKey (ConfigMap config, String[] keys) {
		for (String key : keys) {
			if (config.containsKey(key)) {
				return createSplit(key, config.get(key));
			}
		}

		return null;
	}

	public static ArrayList<String[]> getSplitsFromKey (ConfigMap config, String[] keys) {
		ArrayList<String[]> splits = new ArrayList<>();

		for (String key : keys) {
			for (String line : config.getAll(key)) {
				splits.add(createSplit(key, line));
			}
		}

		return splits;
	}

	private static String[] createSplit(String key, String line) {
		String[] dataPieces = line.split(" ");
		String[] split = new String[dataPieces.length + 1];
		split[0] = key;
		System.arraycopy(dataPieces, 0, split, 1, dataPieces.length);
		return split;
	}
}
