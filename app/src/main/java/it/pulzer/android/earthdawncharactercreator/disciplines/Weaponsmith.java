package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class Weaponsmith extends BaseDiscipline {

    public Weaponsmith() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(1, new KarmaModification(1, "Tests for creating or repairing an item"));
        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Attack tests with self-made weapons"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;
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
    public int getMysticalArmorModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
