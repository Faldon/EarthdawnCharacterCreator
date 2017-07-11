package it.pulzer.android.earthdawncharactercreator;

/**
 * Created by thopu on 11.07.17.
 */

public class Attribute {
    public final static String DEX = "Dexterity";
    public final static String STR = "Strength";
    public final static String TOUGH = "Toughness";
    public final static String PERC = "Perception";
    public final static String WILL = "Willpower";
    public final static String CHA = "Charisma";
    public final int MAX_VALUE = 3;

    public String name;
    public int currentValue;
    private int raises;

    public Attribute(String name) {
        this.name = name;
        currentValue = 0;
        raises = 0;
    }

    public int getRaises() {
        return raises;
    }

    public int raiseAttribute() {
        if(raises < MAX_VALUE) {
            currentValue = currentValue + 1;
            raises = raises + 1;
            return raises;
        } else {
            return -1;
        }
    }
}
