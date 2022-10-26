package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketDecreaseZoom  extends PacketBase {

    @SuppressWarnings("unused")
    public PacketDecreaseZoom() {
    }


    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        ItemStack currentItem = playerEntity.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
            ItemGun itemGun = (ItemGun) currentItem.getItem();
            itemGun.decreaseZoom(currentItem);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received decrease zoom packet on client. Skipping.");
    }
}
