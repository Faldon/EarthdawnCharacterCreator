package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class OrkishRace extends BaseRace {
    public OrkishRace() {
        super();
        dexterity.currentValue=10;
        strength.currentValue=13;
        toughness.currentValue=11;
        perception.currentValue=10;
        willpower.currentValue=8;
        charisma.currentValue=9;

        movementRate.put("Base", 12);
        karmaModification = 5;

        racialAbilities.add("Heat Sight");
        racialAbilities.add("Gahad");
    }
}
