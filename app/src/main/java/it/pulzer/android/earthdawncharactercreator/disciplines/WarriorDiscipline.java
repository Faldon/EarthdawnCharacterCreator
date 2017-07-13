package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class WarriorDiscipline extends BaseDiscipline {

    public WarriorDiscipline() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.STR);
        importantAttributes.add(Attribute.TOUGH);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests in close combat"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;
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
    public int getMysticalDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getRecoveryCountModification(int circle) {
        return circle>=7 ? 1 : 0;
    }

    @Override
    public KarmaModification getKarmaModification(int circle) {
        return karmaModifications.get(circle, null);
    }
}
