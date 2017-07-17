package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class SwordmasterDiscipline extends BaseDiscipline {

    public SwordmasterDiscipline() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.CHA);

        karmaModifications.put(3, new KarmaModification(1, "Interaction tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests with close combat weapons"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;
    }

    @Override
    public int getPhysicalDefenseModification(int circle) {
        int modification = 0;
        if(circle >= 4) {
            modification += 1;
        }
        if(circle >= 8) {
            modification += 2;
        }
        return modification;
    }

    @Override
    public int getSocialDefenseModification(int circle) {
        int modification = 0;
        if(circle >= 2) {
            modification += 1;
        }
        if(circle >= 6) {
            modification += 2;
        }
        return modification;
    }

    @Override
    public int getInitiativeModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
