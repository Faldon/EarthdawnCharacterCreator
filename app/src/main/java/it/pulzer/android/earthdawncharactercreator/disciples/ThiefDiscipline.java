package it.pulzer.android.earthdawncharactercreator.disciples;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class ThiefDiscipline extends BaseDiscipline {

    public ThiefDiscipline() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.PERC);

        karmaModifications.put(1, new KarmaModification(1, "Any Charisma based test to trick someone"));
        karmaModifications.put(3, new KarmaModification(1, "Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "Attack tests on surprised foes or from dead angle."));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;
    }

    @Override
    protected int getPhysicalDefenseModification(int circle) {
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
    protected int getSocialDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    protected int getInitiativeModification(int circle) {
        return circle>=7 ? 1 : 0;
    }

    @Override
    protected KarmaModification getKarmaModification(int circle) {
        return karmaModifications.get(circle, null);
    }
}
