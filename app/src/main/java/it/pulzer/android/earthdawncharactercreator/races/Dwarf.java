package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class Dwarf extends BaseRace {
    public Dwarf() {
        super();
        dexterity.currentValue=9;
        strength.currentValue=10;
        toughness.currentValue=12;
        perception.currentValue=11;
        willpower.currentValue=11;
        charisma.currentValue=10;

        movementRate.put("Base", 10);
        karmaModification = 4;

        racialAbilities.add("Heat Sight");
        racialAbilities.add("Strong Back");
    }

    @Override
    public int getCarryCapacity() {
        return carryingLimit(strength.currentValue + 2);
    }
}
