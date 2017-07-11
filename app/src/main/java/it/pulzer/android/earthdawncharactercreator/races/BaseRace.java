package it.pulzer.android.earthdawncharactercreator.races;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.Attribute;

/**
 * Created by thopu on 28.06.17.
 */

abstract class BaseRace {
    Attribute dexterity = new Attribute(Attribute.DEX);
    Attribute strength = new Attribute(Attribute.STR);
    Attribute toughness = new Attribute(Attribute.TOUGH);
    Attribute perception = new Attribute(Attribute.PERC);
    Attribute willpower = new Attribute(Attribute.WILL);
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


    protected int getPhysicalDefenseRate() { return defenseRate(dexterity.currentValue); }

    protected int getMysticalDefenseRate() { return defenseRate(perception.currentValue); }

    protected int getSocialDefenseRate() { return defenseRate(charisma.currentValue); }

    protected int getCarryCapacity() { return carryingLimit(strength.currentValue); }

    protected int getLiftingLimit() { return 2* getCarryCapacity(); }

    protected int getUnconsciousThreshold() { return unconsciousThreshold(toughness.currentValue); }

    protected int getDeathThreshold() { return deathThreshold(toughness.currentValue); }

    protected int getWoundThreshold() { return woundThreshold(toughness.currentValue); }

    protected int getRecoveryCount() { return revoceryCount(toughness.currentValue); }

    protected int getMysticalArmor() { return mysticalArmor(willpower.currentValue); }

    protected int getPhysicalArmor() { return 0; }

    protected int getInitiative() { return dexterity.currentValue; }
}
