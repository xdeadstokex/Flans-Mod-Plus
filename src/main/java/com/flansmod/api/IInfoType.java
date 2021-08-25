package com.flansmod.api;

import net.minecraft.item.Item;

public interface IInfoType {
    // Content pack that this originated from
    String contentPack = "";
    // The item that it is bound to
    Item item = null;
    // Name - not really used due to localisation done elsewhere. (Get this from the item)?
    String name = "";
    // The important one - shortname.
    String shortName = "";
    // Text description of the item.
    String description = "";
}
