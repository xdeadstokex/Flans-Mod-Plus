package com.flansmod.common.eventhandlers;

import java.util.ArrayList;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ServerTickEvent 
{
	
	public static ArrayList<EntityPlayerMP> nightVisionPlayers = new ArrayList<EntityPlayerMP>();
	
	public ServerTickEvent() 
	{
		FMLCommonHandler.instance().bus().register(this);
	}
	
	
    int tickCount = 0;
    
    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event)
    {
        switch(event.phase)
        {
        case START :
        {
            break;
        }
        case END :
        {
            if(tickCount >= 20)
            {
                // INPUT CHECK FOR NIGHT VISION SCOPE ITEM
                // IF NO NIGHT VISION ITEM IN HAND GET RID NIGHT VISION
            	ArrayList<EntityPlayerMP> playersToRemove = new ArrayList<EntityPlayerMP>();
            	
            	for(EntityPlayerMP player : nightVisionPlayers)
            	{
            		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
            		{
            			ItemGun itemGun;
            			itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
            			//Apply night vision while scoped if AllowNightVision = True
            			
            			ItemStack itemstack = player.getCurrentEquippedItem();
            			AttachmentType scope = itemGun.type.getScope(itemstack);
            			//Apply night vision while scoped if attachment.hasNightVision = True
            			System.out.println("est");
   
            			if(scope == null || (scope != null && !scope.hasNightVision))
            			  {
            			           player.removePotionEffect(Potion.nightVision.id);
            			           playersToRemove.add(player);
            			  }
            			
            		}
            		else
            		{
            			player.removePotionEffect(Potion.nightVision.id);
            			playersToRemove.add(player);
            		}
            	}
                tickCount = 0;
                for(EntityPlayerMP player : playersToRemove)
                {
                	nightVisionPlayers.remove(player);
                }
            }
            tickCount++;
            break;
        }        
        }
    }
}
