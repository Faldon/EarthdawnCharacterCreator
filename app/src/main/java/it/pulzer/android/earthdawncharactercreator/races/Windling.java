package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class Windling extends BaseRace {
    public Windling() {
        super();
        dexterity.currentValue=11;
        strength.currentValue=4;
        toughness.currentValue=8;
        perception.currentValue=11;
        willpower.currentValue=10;
        charisma.currentValue=12;

        movementRate.put("Base", 6);
        movementRate.put("Flight", 16);
        karmaModification = 6;

        racialAbilities.add("Astral Sight");
        racialAbilities.add("Flight");
        racialAbilities.add("Increased Physical Defense");
    }

    @Override
    public int getPhysicalDefenseRate() {
        return defenseRate(dexterity.currentValue + 2);
    }
}
