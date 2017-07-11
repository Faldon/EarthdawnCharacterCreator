package it.pulzer.android.earthdawncharactercreator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by thopu on 28.06.17.
 */

abstract class BaseRace {
    protected class Attribute {
        public final static String DEX = "Dexterity";
        public final static String STR = "Strength";
        public final static String TOUGH = "Toughness";
        public final static String PERC = "Perception";
        public final static String WILL = "Willpower";
        public final static String CHA = "Charisma";

        public String name;
        public int minValue;
        public int maxValue;
        public int currentValue;
        public int raisesLeft;

        public Attribute(String name) {
            this.name = name;
            minValue = 0;
            maxValue = Integer.MAX_VALUE;
            currentValue = 0;
            raisesLeft = 3;
        }

        public Attribute(String name, int minimum) {
            new Attribute(name);
            minValue = minimum;
        }

        public Attribute(String name, int minimum, int maximum) {
            new Attribute(name, minimum);
            maxValue = maximum;
        }
    }

    protected Attribute dexterity = new Attribute(Attribute.DEX);
    protected Attribute strength = new Attribute(Attribute.STR);
    protected Attribute toughness = new Attribute(Attribute.TOUGH);
    protected Attribute perception = new Attribute(Attribute.PERC);
    protected Attribute willpower = new Attribute(Attribute.WILL);
    protected Attribute charisma = new Attribute(Attribute.CHA);

    protected Map<String, Integer> movementRate = new HashMap<>();
    protected int karmaModification = 0;

    protected Set<String> racialAbilities = new HashSet<>();

    public final int getStep(int value) { return (int)Math.ceil((double)value/3) + 1; }

    private int defenseRate(int value) { return (int)Math.ceil((double)value/2) + 1; }

    private int unconsciousThreshold(int value) { return value*2; }

    private int carryingLimit(int value) {
        switch(value) {
            case 1:
                return 10;
            default:
                return carryingLimit(value-1) + ((int)Math.ceil((double)value/5))*5;
        }
    }

    private int deathThreshold(int value) {
        return unconsciousThreshold(value+1) + (int)Math.floor((value-1)/3);
    }

    private int woundThreshold(int value) { return defenseRate(value) +1; }

    private int revoceryCount(int value) { return (int)Math.ceil((double)value/6); }

    private int mysticalArmor(int value) { return value / 5; }


    protected int getPhysicalDefenseRate() { return defenseRate(dexterity.currentValue); }

    protected int getMysticalDefenseRate() { return defenseRate(perception.currentValue); }

    protected int getSocialDefenseRate() { return defenseRate(charisma.currentValue); }

    protected int getCarryingLimit() { return carryingLimit(strength.currentValue); }

    protected int getUnconsciousThreshold() { return unconsciousThreshold(toughness.currentValue); }

    protected int getDeathThreshold() { return deathThreshold(toughness.currentValue); }

    protected int getWoundThreshold() { return woundThreshold(toughness.currentValue); }

    protected int getRecoveryCount() { return revoceryCount(toughness.currentValue); }

    protected int getMysticalArmor() { return mysticalArmor(willpower.currentValue); }


}
