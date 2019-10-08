package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.ServerTickEvent;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;


//Packets must be registered in .network.PacketHandler!
public class PacketHashSend extends PacketBase 
{
	
    String hash;
    String shortname;
	public PacketHashSend() { }
	
	public PacketGunState(String typeHash, String typeShortname)
	{
        hash = typeHash;
        shortname = typeShortname;

	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        writeUTF(hash);
        writeUTF(shortname);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        hash = readUTF(hash);
        shortname = readUTF(shortname);
	}

    @Override
    @SideOnly(Side.SERVER)
	public void handleServerSide(EntityPlayerMP player) 
	{
        // Respond with own hash
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
        // Something
	}
}
