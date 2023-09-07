package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.UUID;

public class PacketPlayerDamage extends PacketBase {
    private int playerToDamageEntityID;
    private int ownerEntityID;
    private float damage;
    private String shootableType;
    private String firingType;
    private boolean isHeadshot;
    private boolean isMelee;

    public PacketPlayerDamage(EntityPlayer playerToDamage, EntityPlayer owner, float damageToInflict, String bullet, String shooterType, boolean headshot, boolean melee) {
        playerToDamageEntityID = playerToDamage == null ? -1 : playerToDamage.getEntityId();
        ownerEntityID = owner == null ? -1 : owner.getEntityId();
        damage = damageToInflict;
        shootableType = bullet;
        firingType = shooterType;
        isHeadshot = headshot;
        isMelee = melee;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {

    }
}
