package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class Tskrang extends BaseRace {
    public Tskrang() {
        super();
        dexterity.currentValue=11;
        strength.currentValue=10;
        toughness.currentValue=11;
        perception.currentValue=10;
        willpower.currentValue=10;
        charisma.currentValue=11;

        movementRate.put("Base", 12);
        movementRate.put("Swim", 12);
        karmaModification = 4;

        racialAbilities.add("Gills");
        racialAbilities.add("Tail Combat");
    }
}
