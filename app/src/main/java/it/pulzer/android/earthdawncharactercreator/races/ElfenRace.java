package it.pulzer.android.earthdawncharactercreator.races;

/**
 * Created by thopu on 04.07.17.
 */

public class ElfenRace extends BaseRace {
    public ElfenRace() {
        super();
        dexterity.currentValue=12;
        strength.currentValue=10;
        toughness.currentValue=8;
        perception.currentValue=11;
        willpower.currentValue=11;
        charisma.currentValue=11;

        movementRate.put("Base", 14);
        karmaModification = 4;

        racialAbilities.add("Low-Light Vision");
    }
}
