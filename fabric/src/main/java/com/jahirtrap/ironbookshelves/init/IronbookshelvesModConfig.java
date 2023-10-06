package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.configlib.TXFConfig;

public class IronbookshelvesModConfig extends TXFConfig {
    @Entry(name = "Enable Tooltips")
    public static boolean enableTooltips = true;
    @Entry(name = "Iron Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double ironEnchantPower = 2.0;
    @Entry(name = "Golden Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double goldenEnchantPower = 3.0;
    @Entry(name = "Diamond Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double diamondEnchantPower = 5.0;
    @Entry(name = "Emerald Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double emeraldEnchantPower = 6.0;
    @Entry(name = "Obsidian Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double obsidianEnchantPower = 7.0;
    @Entry(name = "Netherite Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double netheriteEnchantPower = 10.0;
    @Entry(name = "Copper Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double copperEnchantPower = 1.5;
    @Entry(name = "Amethyst Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double amethystEnchantPower = 2.5;
    @Entry(name = "Crying Obsidian Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double cryingObsidianEnchantPower = 8.0;
    @Entry(name = "Enderite Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double enderiteEnchantPower = 12.0;
    @Entry(name = "Steel Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double steelEnchantPower = 3.0;
    @Entry(name = "Bronze Enchant Power", min = 0.0, max = Double.POSITIVE_INFINITY)
    public static double bronzeEnchantPower = 4.0;
}
