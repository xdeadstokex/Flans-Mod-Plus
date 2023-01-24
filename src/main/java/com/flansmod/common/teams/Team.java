package com.flansmod.common.teams;

import java.util.*;

import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Team extends InfoType
{
	public static List<Team> teams = new ArrayList<Team>();
	public List<String> members = new ArrayList<String>();
	//public List<ITeamBase> bases = new ArrayList<ITeamBase>();
	public List<PlayerClass> classes = new ArrayList<PlayerClass>();
	
	public static Team spectators;

	public int score = 0;
	
	public int teamColour = 0xffffff;
	public char textColour = 'f';
	public boolean allowedForRoundsGenerator = false;
	
	public ItemStack hat;
	public ItemStack chest;
	public ItemStack legs;
	public ItemStack shoes;
	
	public Team(String s, String s1, int teamCol, char textCol) {
		super(new TypeFile(EnumType.team, s, "", false));
		shortName = s;
		name = s1;
		teamColour = teamCol;
		textColour = textCol;
		teams.add(this);
	}
	
	public Team(TypeFile file) {
		super(file);
		teams.add(this);
	}

	@Override
	protected void preRead(TypeFile file) { }
	@Override
	protected void postRead(TypeFile file) { }
	@Override
	protected void read(ConfigMap config, TypeFile file)
	{
		super.read(config, file);
		try
		{
			if (config.containsKey("TeamColour")) {
				String[] split = ConfigUtils.getSplitFromKey(config, "TeamColour");
				teamColour = (Integer.parseInt(split[1]) << 16) + ((Integer.parseInt(split[2])) << 8) + ((Integer.parseInt(split[3])));
			}
			if (config.containsKey("TextColour")) {
				getColourCode(config, config.get("TextColour"));
			}
			if(config.containsKey("Hat") || config.containsKey("Helmet")) {
				String key = "Hat";
				if (config.containsKey("Helmet"))
					key = "Helmet";
				if(config.get(key).equalsIgnoreCase("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(config.get(key)))
						hat = new ItemStack(item);
				}
			}
			if(config.containsKey("Chest")  || config.containsKey("Top")) {
				String key = "Chest";
				if (config.containsKey("Top"))
					key = "Top";
				if(config.get(key).equalsIgnoreCase("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(config.get(key)))
						chest = new ItemStack(item);
				}
			}
			if(config.containsKey("Legs")  || config.containsKey("Bottom")) {
				String key = "Legs";
				if (config.containsKey("Bottom"))
					key = "Bottom";
				if(config.get(key).equalsIgnoreCase("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(config.get(key)))
						legs = new ItemStack(item);
				}
			}
			if(config.containsKey("Shoes")  || config.containsKey("Boots")) {
				String key = "Shoes";
				if (config.containsKey("Boots"))
					key = "Boots";
				if(config.get(key).equalsIgnoreCase("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(config.get(key)))
						shoes = new ItemStack(item);
				}
			}
			if(config.containsKey("AddDefaultClass")  || config.containsKey("AddClass")) {
				String key = "AddDefaultClass";
				if (config.containsKey("AddClass"))
					key = "AddClass";
				classes.add(PlayerClass.getClass(config.get(key)));
			}
			if(config.containsKey("allowedForRoundsGenerator")){
				this.allowedForRoundsGenerator = Boolean.parseBoolean(config.get("allowedForRoundsGenerator"));
			}
		} catch (Exception e)
		{
			FlansMod.log("Reading team file failed.");
			e.printStackTrace();
		}
	}
	
	public static Team getTeam(String s)
	{
		for(Team team : teams)
		{
			if(team.shortName.equals(s))
				return team;
		}
		return null;
	}

	private static char getColourCode(ConfigMap config, String colour) {
		char textCode;
		switch(config.get("TextColour")) {
			case "Black":
				textCode = '0';
				break;
			case "Blue":
				textCode = '1';
				break;
			case "Green":
				textCode = '2';
				break;
			case "Aqua":
				textCode = '3';
				break;
			case "Purple":
				textCode = '5';
				break;
			case "Orange":
				textCode = '6';
				break;
			case "LGrey":
				textCode = '7';
				break;
			case "Grey":
				textCode = '8';
				break;
			case "LBlue":
				textCode = '9';
				break;
			case "LGreen":
				textCode = 'a';
				break;
			case "LAqua":
				textCode = 'b';
				break;
			case "Red":
				textCode = 'c';
				break;
			case "Pink":
				textCode = 'd';
				break;
			case "Yellow":
				textCode = 'e';
				break;
			case "White":
				textCode = 'f';
				break;
			default:
				textCode = '0';
				break;
		}

		return textCode;
	}
	/*
	//Called both by ops and the gametype
	public void addBase(ITeamBase base)
	{
		bases.add(base);
	}
	
	//Called both by ops and the gametype
	public void removeBase(ITeamBase base)
	{
		bases.remove(base);
	}
	*/
	
	public void removePlayer(EntityPlayer player) {
		removePlayer(player.getCommandSenderName());
	}
	
	public String removePlayer(String username) {
		members.remove(username);
		if(PlayerHandler.getPlayerData(username) != null)
			PlayerHandler.getPlayerData(username).team = null;
		return username;
	}
	
	public EntityPlayer addPlayer(EntityPlayer player) {
		addPlayer(player.getCommandSenderName());
		return player;
	}
	
	public String addPlayer(String username) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(username);
		for(Team team : teams)
		{
			team.members.removeAll(list);
		}
		members.add(username);
		PlayerHandler.getPlayerData(username).newTeam = PlayerHandler.getPlayerData(username).team = this;
		return username;
	}
	
	public String removeWorstPlayer() {
		sortPlayers();
		if(members.size() == 0)
			return null;
		else return removePlayer(members.get(members.size() - 1));
	}
	
	public void sortPlayers() {
		Collections.sort(members, new ComparatorScore());
	}
	
	public static class ComparatorScore implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			PlayerData dataA = PlayerHandler.getPlayerData(a);
			PlayerData dataB = PlayerHandler.getPlayerData(b);
			if(dataA == null || dataB == null)
				return 0;			
			return dataB.score - dataA.score;
		}
		
	}

	@Override
	public float GetRecommendedScale() {
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() {
		return null;
	}
}
