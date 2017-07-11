package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class TrollRace extends BaseRace {
    public TrollRace() {
        super();
        dexterity.currentValue=10;
        strength.currentValue=14;
        toughness.currentValue=12;
        perception.currentValue=9;
        willpower.currentValue=11;
        charisma.currentValue=10;

        movementRate.put("Base", 14);
        karmaModification = 3;

        racialAbilities.add("Heat Sight");
    }
}
