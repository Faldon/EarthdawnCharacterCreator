package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class AirSailorDiscipline extends BaseDiscipline {

    public AirSailorDiscipline() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.WILL);

        karmaModifications.put(1, new KarmaModification(1, "Action on an air ship per round"));
        karmaModifications.put(3, new KarmaModification(1, "Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "Interaction tests"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;
    }

    @Override
    public int getPhysicalDefenseModification(int circle) {
        int modification = 0;
        if(circle >= 2) {
            modification += 1;
        }
        if(circle >= 6) {
            modification += 2;
        }
        if(circle >= 8) {
            modification += 3;
        }
        return modification;
    }

    @Override
    public int getSocialDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getRecoveryCountModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
