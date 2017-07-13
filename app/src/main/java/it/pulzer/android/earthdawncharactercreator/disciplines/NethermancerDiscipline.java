package it.pulzer.android.earthdawncharactercreator.disciplines;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;

/**
 * Created by thopu on 11.07.17.
 */

public class NethermancerDiscipline extends BaseDiscipline {

    public NethermancerDiscipline() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PERC);
        importantAttributes.add(Attribute.WILL);

        karmaModifications.put(3, new KarmaModification(1, "Any one test per round against demons, demon constructs or undead"));
        karmaModifications.put(5, new KarmaModification(1, "Raise penalty for 2 points the target is suffering through a spell"));

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
    public int getSocialDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getMysticalArmor(int circle) {
        return circle>=7 ? 1 : 0;
    }

    @Override
    public KarmaModification getKarmaModification(int circle) {
        return karmaModifications.get(circle, null);
    }
}
