package it.pulzer.android.earthdawncharactercreator.races;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.Attribute;

/**
 * Created by thopu on 28.06.17.
 */

public abstract class BaseRace {
    Attribute dexterity = new Attribute(Attribute.DEX);
    Attribute strength = new Attribute(Attribute.STR);
    Attribute toughness = new Attribute(Attribute.TOU);
    Attribute perception = new Attribute(Attribute.PER);
    Attribute willpower = new Attribute(Attribute.WIL);
    Attribute charisma = new Attribute(Attribute.CHA);

    Map<String, Integer> movementRate;
    Set<String> racialAbilities;
    int karmaModification;

    BaseRace() {
        movementRate = new HashMap<>();
        karmaModification = 0;
        racialAbilities = new HashSet<>();
    }

    public final int getStep(int value) { return (int)Math.ceil((double)value/3) + 1; }

    int defenseRate(int value) { return (int)Math.ceil((double)value/2) + 1; }

    int unconsciousThreshold(int value) { return value*2; }

    int carryingLimit(int value) {
        switch(value) {
            case 1:
                return 10;
            default:
                return carryingLimit(value-1) + ((int)Math.ceil((double)value/5))*5;
        }
    }

    int deathThreshold(int value) {
        return unconsciousThreshold(value+1) + (int)Math.floor((value-1)/3);
    }

    int woundThreshold(int value) { return defenseRate(value) +1; }

    int revoceryCount(int value) { return (int)Math.ceil((double)value/6); }

    int mysticalArmor(int value) { return value / 5; }


    public int getPhysicalDefenseRate() { return defenseRate(dexterity.currentValue); }

    public int getMysticalDefenseRate() { return defenseRate(perception.currentValue); }

    public int getSocialDefenseRate() { return defenseRate(charisma.currentValue); }

    public int getCarryCapacity() { return carryingLimit(strength.currentValue); }

    public int getLiftingLimit() { return 2* getCarryCapacity(); }

    public int getUnconsciousThreshold() { return unconsciousThreshold(toughness.currentValue); }

    public int getDeathThreshold() { return deathThreshold(toughness.currentValue); }

    public int getWoundThreshold() { return woundThreshold(toughness.currentValue); }

    public int getRecoveryCount() { return revoceryCount(toughness.currentValue); }

    public int getMysticalArmor() { return mysticalArmor(willpower.currentValue); }

    public int getPhysicalArmor() { return 0; }

    public int getInitiative() { return dexterity.currentValue; }

    public Attribute getAttribute(String AttributeName) throws Exception {
        switch(AttributeName) {
            case Attribute.DEX:
                return dexterity;
            case Attribute.STR:
                return  strength;
            case Attribute.TOU:
                return  toughness;
            case Attribute.PER:
                return  perception;
            case Attribute.WIL:
                return willpower;
            case Attribute.CHA:
                return charisma;
            default:
                throw new Exception("No matching attribute found.");
        }
    }

    public String getName() {
        return this.getClass().getName();
    }
}
