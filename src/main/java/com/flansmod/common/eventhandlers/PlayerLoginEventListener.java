package com.flansmod.common.network;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

public class PlayerLoginEventListener {

	public PlayerLoginEventListener() {
		FMLCommonHandler.instance().bus().register(this);
	}

	@EventHandler
	@SubscribeEvent
	public void OnPlayerLogin(PlayerLoggedInEvent event) {
		FlansMod.packetHandler.sendTo(new PacketModConfig(), (EntityPlayerMP) event.player);
	}
}