package it.pulzer.android.earthdawncharactercreator;

/**
 * Created by thopu on 11.07.17.
 */

public class Attribute {

    //region Attribute name delaration
    public final static String DEX = "Dexterity";
    public final static String STR = "Strength";
    public final static String TOU = "Toughness";
    public final static String PER = "Perception";
    public final static String WIL = "Willpower";
    public final static String CHA = "Charisma";
    //endregion

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
