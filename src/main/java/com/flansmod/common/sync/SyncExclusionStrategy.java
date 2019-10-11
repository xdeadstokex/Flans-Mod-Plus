package com.flansmod.common.sync;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldAttributes;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.SideOnly;

// The policy to use that tells GSON to exclude the SyncExclude or SideOnly annotation.
public class SyncExclusionStrategy implements ExclusionStrategy {
    public SyncExclusionStrategy() { }
  
    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
      return false;
    }

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
      return f.getAnnotation(SyncExclude.class) != null || f.getAnnotation(SideOnly.class) != null;
    }
}
