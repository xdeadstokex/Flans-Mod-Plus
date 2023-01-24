package com.flansmod.common.parts;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartType extends InfoType {
    /**
     * Category (TODO : Replace with Enum)
     */
    public int category;
    /**
     * Max stack size of item
     */
    public int stackSize;
    /**
     * (Engine) Multiplier applied to the thrust of the driveable
     */
    public float engineSpeed = 1.0F;
    /**
     * (Engine) Rate at which this engine consumes fuel
     */
    public float fuelConsumption = 1.0F;
    /**
     * (Engine) Power output of the engine - if using realistic acceleration.
     */
    public float enginePower = 10F;
    /**
     * (Fuel) The amount of fuel this fuel tank gives
     */
    public int fuel = 0;
    /**
     * The types of driveables that this engine works with. Used to designate some engines as mecha CPUs and whatnot
     */
    public List<EnumType> worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);

    public ArrayList<ItemStack> partBoxRecipe = new ArrayList<>();

    //------- RedstoneFlux -------
    /**
     * If true, then this engine will draw from RedstoneFlux power source items such as power cubes. Otherwise it will draw from Flan's Mod fuel items
     */
    public boolean useRFPower = false;
    /**
     * The power draw rate for RF (per tick)
     */
    public int RFDrawRate = 1;
    //-----------------------------

    /**
     * The default engine (normally the first one read by the type loader) for driveables with corrupt nbt or those spawned in creative
     */
    public static HashMap<EnumType, PartType> defaultEngines = new HashMap<>();
    /**
     * The list of all PartTypes
     */
    public static List<PartType> parts = new ArrayList<>();

    public PartType(TypeFile file) {
        super(file);
        parts.add(this);
    }

    @Override
    protected void preRead(TypeFile file) {

    }


    @Override
    public void postRead(TypeFile file) {
        if (category == 2 && !useRFPower) {
            for (EnumType type : worksWith) {
                //If there is already a default engine for this type, compare and see if this one is better
                if (defaultEngines.containsKey(type)) {
                    PartType possiblyInferiorEngine = defaultEngines.get(type);
                    if (isInferiorEngine(possiblyInferiorEngine))
                        defaultEngines.put(type, this);
                } else defaultEngines.put(type, this);
            }
        }
    }

    @Override
    protected void read(ConfigMap config, TypeFile file) {
        super.read(config, file);
        try {
            if (config.containsKey("Category"))
                category = getCategory(config.get("Category"));
            if (config.containsKey("StackSize"))
                stackSize = Integer.parseInt(config.get("StackSize"));
            if (config.containsKey("EngineSpeed"))
                engineSpeed = Float.parseFloat(config.get("EngineSpeed"));
            if (config.containsKey("FuelConsumption"))
                fuelConsumption = Float.parseFloat(config.get("FuelConsumption"));
            if (config.containsKey("EnginePower"))
                enginePower = Float.parseFloat(config.get("EnginePowewr"));
            if (config.containsKey("Fuel"))
                fuel = Integer.parseInt(config.get("Fuel"));

            //Recipe
            if (config.containsKey("PartBoxRecipe")) {
                String[] split = config.get("PartBoxRecipe").split(" ");
                ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
                for (int i = 0; i < (split.length - 2) / 2; i++) {
                    int amount = Integer.parseInt(split[2 * i + 2]);
                    boolean damaged = split[2 * i + 3].contains(".");
                    String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
                    int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
                    stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
                }
                partBoxRecipe.addAll(Arrays.asList(stacks));
            } else if (config.containsKey("WorksWith")) {
                String[] split = config.get("WorksWith").split(" ");
                worksWith = new ArrayList<EnumType>();
                for (int i = 0; i < split.length - 1; i++) {
                    worksWith.add(EnumType.get(split[i + 1]));
                }
            }

            //RedstoneFlux
            useRFPower = ConfigUtils.configBool(config, new String[]{"UseRF", "UseRFPower"}, useRFPower);
            RFDrawRate = ConfigUtils.configInt(config, "RFDrawRate", RFDrawRate);
        } catch (Exception e) {
            FlansMod.log("Reading part file failed.");
            e.printStackTrace();
        }
    }

    public boolean isInferiorEngine(PartType quitePossiblyAnInferiorEngine) {
        return engineSpeed > quitePossiblyAnInferiorEngine.engineSpeed;
    }

    public static PartType getPart(String s) {
        for (PartType part : parts) {
            if (part.shortName.equals(s))
                return part;
        }
        return null;
    }

    private int getCategory(String s) {
        if (s.equals("Cockpit"))
            return 0;
        if (s.equals("Wing"))
            return 1;
        if (s.equals("Engine"))
            return 2;
        if (s.equals("Propeller"))
            return 3;
        if (s.equals("Bay"))
            return 4;
        if (s.equals("Tail"))
            return 5;
        if (s.equals("Wheel"))
            return 6;
        if (s.equals("Chassis"))
            return 7;
        if (s.equals("Turret"))
            return 8;
        if (s.equals("Fuel"))
            return 9;
        if (s.equals("Misc"))
            return 10;
        return 10;
    }

    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBase GetModel() {
        return null;
    }
}