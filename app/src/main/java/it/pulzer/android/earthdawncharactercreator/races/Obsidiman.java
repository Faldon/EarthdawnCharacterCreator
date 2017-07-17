package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class Obsidiman extends BaseRace {
    public Obsidiman() {
        super();
        dexterity.currentValue=8;
        strength.currentValue=18;
        toughness.currentValue=13;
        perception.currentValue=9;
        willpower.currentValue=10;
        charisma.currentValue=9;

        movementRate.put("Base", 10);
        karmaModification = 3;

        racialAbilities.add("Increased Wound Threshold");
        racialAbilities.add("Natural Physical Armor");
    }

    @Override
    public int getWoundThreshold() {
        return woundThreshold(toughness.currentValue + 3);
    }

    @Override
    public int getPhysicalArmor() {
        return 3;
    }
}
