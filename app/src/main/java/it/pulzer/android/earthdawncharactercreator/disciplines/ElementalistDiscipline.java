package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class ElementalistDiscipline extends BaseDiscipline {

    public ElementalistDiscipline() {
        super();
        importantAttributes.add(Attribute.PERC);
        importantAttributes.add(Attribute.WILL);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Add one extra ally to target of spell"));

        increasedDurability[0] = 3;
        increasedDurability[1] = 4;
    }

    @Override
    public int getMysticalDefenseModification(int circle) {
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
    public int getPhysicalDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getRecoveryCountModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
