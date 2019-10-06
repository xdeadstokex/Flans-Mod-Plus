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
      FlansMod.log("Class: " + aClass.getName());
      return false;
    }

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
      boolean s = f.getAnnotation(SyncExclude.class) != null || f.getAnnotation(SideOnly.class) != null;
      if (!s) FlansMod.log("Field: " + f.getName());
      return s;
    }
}
