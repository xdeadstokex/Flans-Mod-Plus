package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;

public class ArmourType extends InfoType {
    public static ArrayList<ArmourType> armours = new ArrayList<ArmourType>();

    /**
     * 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes
     */
    public int type;
    /**
     * The amount of damage to absorb. From 0 to 1. Stacks additively between armour pieces
     */
    public double defence;

    /**
     * The amount of damage to absorb. From 0 to 1. Stacks additively between armour
     * pieces. For bullet damage specifically.
     */
    public double bulletDefence;

    /**
     * How good the armour is at stopping bullets. Same units as bullet penetration. Default 0 to emulate previous behaviour
     */
    public float penetrationResistance = 0;
    /**
     * The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs
     */
    public String armourTextureName;
    /**
     * Modifiers for various player stats
     */
    public float moveSpeedModifier = 1F, knockbackModifier = 0.2F, jumpModifier = 1F;
    /**
     * If true, then the player gets a night vision buff every couple of seconds
     */
    public boolean nightVision = false;
    /**
     * If true, then the player gets a invisiblity buff every couple of seconds
     */
    public boolean invisible = false;
    /**
     * The overlay to display when using this helmet. Textures are pulled from the scopes directory
     */
    public String overlay = null;
    /**
     * If true, then smoke effects from grenades will have no effect on players wearing this
     */
    public boolean smokeProtection = false;
    /**
     * If true, the player will not receive fall damage
     */
    public boolean negateFallDamage = false;
    /**
     * If true, the player will not receive fire damage
     */
    public boolean fireResistance = false;
    /**
     * If true, the player can breath under water
     */
    public boolean waterBreathing = false;
    /**
     * If true, the player can walk on water
     */
    public boolean onWaterWalking = false;
    /**
     * If true, the armor has durability
     */
    public boolean hasDurability = false;
    /**
     * The durability for the piece of armor
     */
    public int durability = 0;

    public ModelCustomArmour model;

    public ArmourType(TypeFile file) {
        super(file);
        armours.add(this);
    }

    @Override
    protected void preRead(TypeFile file) {
    }

    @Override
    protected void postRead(TypeFile file) {
    }

    @Override
    protected void read(ConfigMap config, TypeFile file) {
        super.read(config, file);
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && config.containsKey("Model")) {
                model = FlansMod.proxy.loadModel(config.get("Model"), shortName, ModelCustomArmour.class);
                model.type = this;
            }
            if (config.containsKey("Type")) {
                if (config.get("Type").equals("Hat") || config.get("Type").equals("Helmet"))
                    type = 0;
                if (config.get("Type").equals("Chest") || config.get("Type").equals("Body"))
                    type = 1;
                if (config.get("Type").equals("Legs") || config.get("Type").equals("Pants"))
                    type = 2;
                if (config.get("Type").equals("Shoes") || config.get("Type").equals("Boots"))
                    type = 3;
            }

            if (config.containsKey("DamageReduction") || config.containsKey("Defence")) {
                String key = "DamageReduction";
                if (config.containsKey("Defence"))
                    key = "Defence";
                defence = Double.parseDouble(config.get(key));
                bulletDefence = defence;
            }
            bulletDefence = ConfigUtils.configFloat(config, "BulletDefence", (float)bulletDefence);
            defence = ConfigUtils.configFloat(config, "OtherDefence", (float)defence);
            moveSpeedModifier = ConfigUtils.configFloat(config, new String[]{"MoveSpeedModifier", "Slowness"}, moveSpeedModifier);
            jumpModifier = ConfigUtils.configFloat(config, "JumpModifier", jumpModifier);
            knockbackModifier = ConfigUtils.configFloat(config, new String[]{"KnockbackReduction", "KnockbackModifier"}, knockbackModifier);
            penetrationResistance = ConfigUtils.configFloat(config, "PenetrationResistance", penetrationResistance);
            nightVision = ConfigUtils.configBool(config, "NightVision", nightVision);
            invisible = ConfigUtils.configBool(config, "Invisible", invisible);
            negateFallDamage = ConfigUtils.configBool(config, "NegateFallDamage", negateFallDamage);
            fireResistance = ConfigUtils.configBool(config, "FireResistance", fireResistance);
            waterBreathing = ConfigUtils.configBool(config, "WaterBreathing", waterBreathing);
            overlay = ConfigUtils.configString(config, "Overlay", overlay);
            smokeProtection = ConfigUtils.configBool(config, "SmokeProtection", smokeProtection);
            onWaterWalking = ConfigUtils.configBool(config, "OnWaterWalking", onWaterWalking);
            if (config.containsKey("Durability")) {
                durability = Integer.parseInt(config.get("Durability"));
                hasDurability = durability > 0;
            }
            armourTextureName = ConfigUtils.configString(config, new String[]{"ArmourTexture", "ArmorTexture"}, armourTextureName);
        } catch (Exception e) {
            FlansMod.log("Reading armour file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    public static ArmourType getArmourType(String string) {
        for (ArmourType armour : armours) {
            if (armour.shortName.equals(string))
                return armour;
        }
        return null;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {
        model = FlansMod.proxy.loadModel(modelString, shortName, ModelCustomArmour.class);
        if (model != null)
            model.type = this;
    }

    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBase GetModel() {
        return model;
    }
}
