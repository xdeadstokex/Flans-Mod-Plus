package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class PacketModConfig extends PacketBase {
    public boolean hitCrossHairEnable;
    public boolean bulletGuiEnable;
    public boolean crosshairEnable;
    public boolean gunCarryLimitEnable;
    public int gunCarryLimit;
    public boolean realisticRecoil;
    public int armourEnchantability;
    public boolean hashKick;
    public boolean disableSprintHipFireByDefault;
    public boolean useNewPenSystem;
    public boolean gunsWorkInDeadParts;
    public boolean showDistanceInKillMessage;
    public boolean driveableHitboxes;
    public float driveableUpdateRange;

    public PacketModConfig() {
        hitCrossHairEnable = FlansMod.hitCrossHairEnable;
        bulletGuiEnable = FlansMod.bulletGuiEnable;
        crosshairEnable = FlansMod.crosshairEnable;
        gunCarryLimitEnable = FlansMod.gunCarryLimitEnable;
        gunCarryLimit = FlansMod.gunCarryLimit;
        realisticRecoil = FlansMod.realisticRecoil;
        armourEnchantability = FlansMod.armourEnchantability;
        hashKick = FlansMod.kickNonMatchingHashes;
        disableSprintHipFireByDefault= FlansMod.disableSprintHipFireByDefault;
        useNewPenSystem = FlansMod.useNewPenetrationSystem;
        gunsWorkInDeadParts = FlansMod.gunsInDeadPartsWork;
        showDistanceInKillMessage = FlansMod.showDistanceInKillMessage;
        driveableHitboxes = FlansMod.driveableHitboxes;
        driveableUpdateRange = FlansMod.driveableUpdateRange;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(hitCrossHairEnable);
        data.writeBoolean(bulletGuiEnable);
        data.writeBoolean(crosshairEnable);
        data.writeBoolean(gunCarryLimitEnable);
        data.writeInt(gunCarryLimit);
        data.writeBoolean(realisticRecoil);
        data.writeInt(armourEnchantability);
        data.writeBoolean(hashKick);
        data.writeBoolean(disableSprintHipFireByDefault);
        data.writeBoolean(useNewPenSystem);
        data.writeBoolean(gunsWorkInDeadParts);
        data.writeBoolean(showDistanceInKillMessage);
        data.writeBoolean(driveableHitboxes);
        data.writeFloat(driveableUpdateRange);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        hitCrossHairEnable = data.readBoolean();
        bulletGuiEnable = data.readBoolean();
        crosshairEnable = data.readBoolean();
        gunCarryLimitEnable = data.readBoolean();
        gunCarryLimit = data.readInt();
        realisticRecoil = data.readBoolean();
        armourEnchantability = data.readInt();
        hashKick = data.readBoolean();
        disableSprintHipFireByDefault = data.readBoolean();
        useNewPenSystem = data.readBoolean();
        gunsWorkInDeadParts = data.readBoolean();
        showDistanceInKillMessage = data.readBoolean();
        driveableHitboxes = data.readBoolean();
        driveableUpdateRange = data.readFloat();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.hitCrossHairEnable = hitCrossHairEnable;
        FlansMod.bulletGuiEnable = bulletGuiEnable;
        FlansMod.crosshairEnable = crosshairEnable;
        FlansMod.gunCarryLimitEnable = gunCarryLimitEnable;
        FlansMod.gunCarryLimit = gunCarryLimit;
        FlansMod.realisticRecoil = realisticRecoil;
        FlansMod.armourEnchantability = armourEnchantability;
        FlansMod.kickNonMatchingHashes = hashKick;
        FlansMod.disableSprintHipFireByDefault = disableSprintHipFireByDefault;
        FlansMod.useNewPenetrationSystem = useNewPenSystem;
        FlansMod.gunsInDeadPartsWork = gunsWorkInDeadParts;
        FlansMod.showDistanceInKillMessage = showDistanceInKillMessage;
        FlansMod.driveableHitboxes = driveableHitboxes;
        FlansMod.driveableUpdateRange = driveableUpdateRange;
        FlansMod.log("Config synced successfully");
    }
}
