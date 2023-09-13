package com.jahirtrap.ironbookshelves.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class IronbookshelvesModConfig {
    public static final ForgeConfigSpec.BooleanValue ENABLE_TOOLTIPS;
    public static final ForgeConfigSpec.DoubleValue IRON_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue GOLDEN_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue DIAMOND_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue EMERALD_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue OBSIDIAN_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue NETHERITE_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue COPPER_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue AMETHYST_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue CRYING_OBSIDIAN_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue ENDERITE_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue STEEL_ENCHANT_POWER;
    public static final ForgeConfigSpec.DoubleValue BRONZE_ENCHANT_POWER;
    public static ForgeConfigSpec COMMON_CONFIG;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        ENABLE_TOOLTIPS = COMMON_BUILDER.define("enableTooltips", true);
        IRON_ENCHANT_POWER = COMMON_BUILDER.defineInRange("ironEnchantPower", 2.0, 0.0, Double.POSITIVE_INFINITY);
        GOLDEN_ENCHANT_POWER = COMMON_BUILDER.defineInRange("goldenEnchantPower", 3.0, 0.0, Double.POSITIVE_INFINITY);
        DIAMOND_ENCHANT_POWER = COMMON_BUILDER.defineInRange("diamondEnchantPower", 5.0, 0.0, Double.POSITIVE_INFINITY);
        EMERALD_ENCHANT_POWER = COMMON_BUILDER.defineInRange("emeraldEnchantPower", 6.0, 0.0, Double.POSITIVE_INFINITY);
        OBSIDIAN_ENCHANT_POWER = COMMON_BUILDER.defineInRange("obsidianEnchantPower", 7.0, 0.0, Double.POSITIVE_INFINITY);
        NETHERITE_ENCHANT_POWER = COMMON_BUILDER.defineInRange("netheriteEnchantPower", 10.0, 0.0, Double.POSITIVE_INFINITY);
        COPPER_ENCHANT_POWER = COMMON_BUILDER.defineInRange("copperEnchantPower", 1.5, 0.0, Double.POSITIVE_INFINITY);
        AMETHYST_ENCHANT_POWER = COMMON_BUILDER.defineInRange("amethystEnchantPower", 2.5, 0.0, Double.POSITIVE_INFINITY);
        CRYING_OBSIDIAN_ENCHANT_POWER = COMMON_BUILDER.defineInRange("cryingObsidianEnchantPower", 8.0, 0.0, Double.POSITIVE_INFINITY);
        ENDERITE_ENCHANT_POWER = COMMON_BUILDER.defineInRange("enderiteEnchantPower", 12.0, 0.0, Double.POSITIVE_INFINITY);
        STEEL_ENCHANT_POWER = COMMON_BUILDER.defineInRange("steelEnchantPower", 3.0, 0.0, Double.POSITIVE_INFINITY);
        BRONZE_ENCHANT_POWER = COMMON_BUILDER.defineInRange("bronzeEnchantPower", 4.0, 0.0, Double.POSITIVE_INFINITY);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
