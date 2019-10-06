package com.flansmod.common.paintjob;

import net.minecraft.item.ItemStack;

import com.flansmod.common.sync.SyncExclude;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Paintjob 
{
	public int ID;
	public String displayName;
	@SyncExclude
	public String iconName;
	@SideOnly(Side.CLIENT)
	public String textureName;
	@SyncExclude
	public ItemStack[] dyesNeeded;
	
	public Paintjob(int id, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this(id, "", iconName, textureName, dyesNeeded);
	}

	public Paintjob(int id, String displayName, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this.ID = id;
		this.displayName = displayName;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
	}
}
