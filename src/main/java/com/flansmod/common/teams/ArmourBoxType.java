package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArmourBoxType extends InfoType 
{
	//Textures
	public String topTexturePath;
	public String sideTexturePath;
	public String bottomTexturePath;
	public IIcon top;
	public IIcon side;
	public IIcon bottom;
	
	public BlockArmourBox block;

	public ArrayList<ArmourBoxEntry> pages = new ArrayList<ArmourBoxEntry>();
	
	/** The static box map. Indexed by shortName for server ~ client syncing */
	public static HashMap<String, ArmourBoxType> boxes = new HashMap<String, ArmourBoxType>();
	
	public ArmourBoxType(TypeFile file) 
	{
		super(file);
	}
	
	@Override
	public void preRead(TypeFile file) { }
	
	@Override
	public void postRead(TypeFile file)
	{
		boxes.put(shortName, this);
	}
	
	@Override
	protected void read(ConfigMap config, TypeFile file)
	{
		super.read(config, file);
		try {
			topTexturePath = ConfigUtils.configString(config, "TopTexture", topTexturePath);
			bottomTexturePath = ConfigUtils.configString(config, "BottomTexture", bottomTexturePath);
			sideTexturePath = ConfigUtils.configString(config, "SideTexture", sideTexturePath);

			if (config.containsKey("addarmour") || config.containsKey("addarmor")) {
				String[] split = ConfigUtils.getSplitFromKey(config, new String[] { "AddArmour", "AddArmor"});

				StringBuilder name = new StringBuilder(split[2]);

				for(int i = 3; i < split.length; i++)
					name.append(" ").append(split[i]);
				ArmourBoxEntry entry = new ArmourBoxEntry(split[1], name.toString());
				//Read the next 4 lines for each armour piece
				for (int i = 0; i < 4; i++)
				{
					String line = null;
					line = file.readLine();
					if(line == null)
						continue;
					if(line.startsWith("//"))
					{
						i--;
						continue;
					}
					String[] lineSplit = line.split(" ");
					entry.armours[i] = ArmourType.getArmourType(lineSplit[0]);
					for(int j = 0; j < (lineSplit.length - 1) / 2; j++)
					{
						ItemStack stack = null;
						if(lineSplit[j * 2 + 1].contains("."))
							stack = getRecipeElement(lineSplit[j * 2 + 1].split("\\.")[0], Integer.valueOf(lineSplit[j * 2 + 2]), Integer.valueOf(lineSplit[j * 2 + 1].split("\\.")[1]), shortName);
						else
							stack = getRecipeElement(lineSplit[j * 2 + 1], Integer.valueOf(lineSplit[j * 2 + 2]), 0, shortName);

						if(stack != null) {
							entry.requiredStacks[i].add(stack);
						} else {
							if (FlansMod.printDebugLog) { FlansMod.log("Could not add part %s to %s in armourbox %s", lineSplit[j * 2 + 1], name.toString(), shortName); }
						}
					}
				}

				pages.add(entry);
			}

		} catch (Exception e) {
			FlansMod.log("Reading armour box file failed : " + shortName);
			if (FlansMod.printStackTrace)
				e.printStackTrace();
		}
	}

	/** Each instance of this class refers to one page full of recipes, that is, one full set of armour */
	public class ArmourBoxEntry
	{
		public String shortName;
		public String name = "";
		public ArmourType[] armours;
		public ArrayList<ItemStack>[] requiredStacks;
		
		public ArmourBoxEntry(String s, String s1)
		{
			shortName = s;
			name = s1;
			
			//Prep arrays and lists
			armours = new ArmourType[4];
			requiredStacks = new ArrayList[4];
			for(int i = 0; i < 4; i++)
				requiredStacks[i] = new ArrayList<ItemStack>();
		}
	}

	public static ArmourBoxType getBox(String boxShortName) 
	{
		return boxes.get(boxShortName);
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return null;
	}
}
