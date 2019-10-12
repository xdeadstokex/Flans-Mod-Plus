package com.flansmod.common.network;

import java.util.HashMap;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.sync.Sync;

// Flans types
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GrenadeType;
// import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.teams.ArmourType;
// import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.tools.ToolType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketHashSend extends PacketBase 
{
    String hash;
	String shortname;
	String type;
	public PacketHashSend() { }
	
	public PacketHashSend(String typeHash, String typeShortname, String typeName)
	{
        hash = typeHash;
        shortname = typeShortname;
		type = typeName;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        writeUTF(data, hash);
		writeUTF(data, shortname);
		writeUTF(data, type);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
        hash = readUTF(data);
		shortname = readUTF(data);
		type = readUTF(data);
	}

    @Override    
	public void handleServerSide(EntityPlayerMP player) 
	{
        FlansMod.log("Recieved packet %s %s %s", hash, shortname, type);

		String newHash = "noneFound";
        if (type.equals("Gun")) {
			if (GunType.guns.containsKey(shortname)) { newHash = Sync.getHash(GunType.guns.get(shortname)); }
		} else if (type.equals("AAGun")) {
			for (AAGunType item : AAGunType.infoTypes) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Attachment")) {
			for (AttachmentType item : AttachmentType.attachments) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Grenade")) {
			for (GrenadeType item : GrenadeType.grenades) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("MechaItem")) {
			for (MechaItemType item : MechaItemType.types) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Mecha")) {
			for (MechaType item : MechaType.types) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Vehicle")) {
			FlansMod.log("Vehicle");
			for (VehicleType item : VehicleType.types) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Plane")) {
			for (PlaneType item : PlaneType.types) {
				if (item.shortName.equals(shortname)) { newHash = Sync.getHash(item); }
			}
		} else if (type.equals("Armour")) {
			for (ArmourType item : ArmourType.armours) { newHash = Sync.getHash(item); }
		} else if (type.equals("Tool")) {
			if (ToolType.tools.containsKey(shortname)) { newHash = Sync.getHash(ToolType.tools.get(shortname)); }
		}
		
		FlansMod.getPacketHandler().sendTo(new PacketHashSend(newHash, shortname, type), player);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Recieved packet %s %s %s", hash, shortname, type);
		Sync.packetMap.put(shortname, hash);
	}
}
