package com.flansmod.common.sync;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONHolder {
 	public static Gson gsonWriter = new GsonBuilder().setExclusionStrategies(new SyncExclusionStrategy()).create();
}
