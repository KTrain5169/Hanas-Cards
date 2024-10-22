package net.hanas_cards.util;

import net.minecraft.util.Formatting;
import net.minecraft.util.StringIdentifiable;

public enum CustomCardRarity implements StringIdentifiable {
    GLITCHED(
            new String[] { "§3", "§c" },
            new Formatting[] { Formatting.DARK_AQUA, Formatting.RED },
            "Glitched"
    ),
    MYTHIC(
            new String[] { "§4", "§c", "§6", "§e", "§a", "§b", "§9", "§d", "§5" },
            new Formatting[] { Formatting.DARK_RED, Formatting.RED, Formatting.GOLD, Formatting.YELLOW,
                    Formatting.GREEN, Formatting.AQUA, Formatting.BLUE, Formatting.LIGHT_PURPLE,
                    Formatting.DARK_PURPLE },
            "Mythic"
    ),
    LEGENDARY("§6", Formatting.GOLD, "Legendary"),
    ULTRA_RARE(
            new String[] { "§3", "§9" },
            new Formatting[] { Formatting.DARK_AQUA, Formatting.BLUE },
            "Ultra Rare"
    );

    private final String[] colorCodes;
    private final Formatting[] formatStyles;
    private final String displayName;
    private final boolean isCycling;

    CustomCardRarity(String colorCode, Formatting formatStyle, String displayName) {
        this.colorCodes = new String[] { colorCode };
        this.formatStyles = new Formatting[] { formatStyle };
        this.displayName = displayName;
        this.isCycling = false;
    }

    CustomCardRarity(String[] colorCodes, Formatting[] formatStyles, String displayName) {
        this.colorCodes = colorCodes;
        this.formatStyles = formatStyles;
        this.displayName = displayName;
        this.isCycling = true;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Returns the current color code, cycling if necessary.
     */
    public String getColorCode() {
        return isCycling ? getCyclingColor() : colorCodes[0];
    }

    /**
     * Returns the current formatting style, cycling if necessary.
     */
    public Formatting getFormatting() {
        return isCycling ? getCyclingFormatting() : formatStyles[0];
    }

    /**
     * Cycles through available colors based on system time.
     */
    private String getCyclingColor() {
        long time = System.currentTimeMillis();
        int index = (int) ((time / 500) % colorCodes.length);
        return colorCodes[index];
    }

    /**
     * Cycles through available formatting styles based on system time.
     */
    private Formatting getCyclingFormatting() {
        long time = System.currentTimeMillis();
        int index = (int) ((time / 500) % formatStyles.length);
        return formatStyles[index];
    }

    @Override
    public String asString() {
        return displayName;
    }
}

