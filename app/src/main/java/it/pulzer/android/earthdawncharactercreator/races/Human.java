package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class Human extends BaseRace {
    public Human() {
        super();
        dexterity.currentValue=10;
        strength.currentValue=10;
        toughness.currentValue=10;
        perception.currentValue=10;
        willpower.currentValue=10;
        charisma.currentValue=10;

        movementRate.put("Base", 10);
        karmaModification = 5;

        racialAbilities.add("Versatility");
    }
}
