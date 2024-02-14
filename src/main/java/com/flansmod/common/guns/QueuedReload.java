package com.flansmod.common.guns;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class QueuedReload {

	private World world;
	private Entity entity;
	private IInventory inventory;
	private boolean creative, combineAmmoOnReload, ammoToUpperInventory;
	
	public final ItemStack gunStack;
	public final int numberAmmo;
	
	private boolean didReload = false;
	private float reloadTime = 0;
	
	
	public QueuedReload(ItemStack gunStack, int numberAmmo, float reloadTime, World world,
			Entity entity, IInventory inventory, boolean creative, boolean combineAmmoOnReload, boolean ammoToUpperInventory) {
		this.gunStack = gunStack;
		this.numberAmmo = numberAmmo;
		
		this.reloadTime = reloadTime;
		
		this.world = world;
		this.entity = entity;
		this.inventory = inventory;
		this.creative = creative;
		this.combineAmmoOnReload = combineAmmoOnReload;
		this.ammoToUpperInventory = ammoToUpperInventory;
	}
	
	public void decrementReloadTime() {
		if(reloadTime > 0) reloadTime--;
	}
	
	public float getReloadTime() {
		return reloadTime;
	}
	
	public void doReload() {
		if(didReload || gunStack == null) return;	
		didReload = true;
		ItemGun gun = ((ItemGun)gunStack.getItem());
		
		
		ItemStack bulletInGun = gun.getBulletItemStack(gunStack, numberAmmo);
		if(bulletInGun != null) {
			//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
            if (bulletInGun != null && bulletInGun.getItem() instanceof ItemShootable && ((ItemShootable) bulletInGun.getItem()).type.dropItemOnReload != null && !creative && bulletInGun.getItemDamage() == bulletInGun.getMaxDamage())
                gun.dropItem(world, entity, ((ItemShootable) bulletInGun.getItem()).type.dropItemOnReload);
            //The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
            if (bulletInGun != null && bulletInGun.getItemDamage() < bulletInGun.getMaxDamage() && !creative) {
                if(!InventoryHelper.addItemStackToInventory(inventory, bulletInGun, creative, combineAmmoOnReload, ammoToUpperInventory))
                    entity.entityDropItem(bulletInGun, 0.5F);
            }
		}
		
		
		ItemStack stackToLoad = gun.getBulletItemStack(gunStack, numberAmmo, true);
		if(stackToLoad == null) return;
				
		ItemStack dummy = stackToLoad.copy();
    	dummy.setItemDamage(dummy.getMaxDamage());
    	gun.setBulletItemStack(gunStack, dummy, numberAmmo, true);
    			
		gun.setBulletItemStack(gunStack, stackToLoad, numberAmmo);
	}
	
}
