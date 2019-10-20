package com.flansmod.common.network;

import java.util.HashMap;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.sync.Sync;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class PacketHashSend extends PacketBase 
{
    String hash;
	public PacketHashSend() { }
	
	public PacketHashSend(String typeHash)
	{
        hash = typeHash;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        writeUTF(data, hash);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        hash = readUTF(data);
	}

    @Override    
	public void handleServerSide(EntityPlayerMP player) 
	{
        FlansMod.log("Recieved packet %s", hash);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Recieved packet %s", hash);
		if (!hash.equals(Sync.cachedHash)) {
			clientPlayer.addChatComponentMessage(new ChatComponentText("[Sync] Client-Server mismatch detected."));
		}
		FlansMod.getPacketHandler().sendToServer(new PacketHashSend(Sync.getUnifiedHash()));
	}
}
