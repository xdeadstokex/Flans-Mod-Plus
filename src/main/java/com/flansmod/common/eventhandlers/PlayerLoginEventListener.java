package com.flansmod.common.eventhandlers;

import com.flansmod.common.CustomFoodStats;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketModConfig;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.lang.reflect.Field;

public class PlayerLoginEventListener {
    public PlayerLoginEventListener() {
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void OnPlayerLogin(PlayerLoggedInEvent event) {
        //Sync the players config with the servers config
        FlansMod.getPacketHandler().sendTo(new PacketModConfig(), (EntityPlayerMP) event.player);

        //Set the players max health
        IAttributeInstance attribute = event.player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.maxHealth);
        attribute.setBaseValue(FlansMod.maxHealth);

        try {
            Field foodStatsField = ReflectionHelper.findField(EntityPlayer.class, "foodStats", "field_71100_bB");
            foodStatsField.setAccessible(true);
            foodStatsField.set(event.player, new CustomFoodStats());
        } catch (ReflectionHelper.UnableToFindFieldException | IllegalAccessException e) {
            FlansMod.logException("Couldn't set food stats", e);
        }
    }
}