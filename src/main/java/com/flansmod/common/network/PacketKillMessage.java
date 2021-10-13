package com.flansmod.common.network;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketKillMessage extends PacketBase {
    public InfoType killedBy;
    public String killerName;
    public String killedName;
    public boolean headshot;
    public float distance;

	@SuppressWarnings("unused")
    public PacketKillMessage() {
    }

    public PacketKillMessage(boolean head, InfoType weapon, String victim, String murderer, Float dist) {
        killedBy = weapon;
        killerName = murderer;
        killedName = victim;
        headshot = head;
        distance = dist;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(headshot);
        writeUTF(data, killedBy.shortName);
        writeUTF(data, killerName);
        writeUTF(data, killedName);
        data.writeFloat(distance);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        headshot = data.readBoolean();
        killedBy = InfoType.getType(readUTF(data));
        killerName = readUTF(data);
        killedName = readUTF(data);
        distance = data.readFloat();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Player kill Killer: " + killerName + " Killed " + killedName + " using: " + killedBy.shortName + " Headshot: " + headshot);
        FlansMod.log("Distance " + distance);
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        TickHandlerClient.addKillMessage(headshot, killedBy, killerName, killedName);
    }
}
