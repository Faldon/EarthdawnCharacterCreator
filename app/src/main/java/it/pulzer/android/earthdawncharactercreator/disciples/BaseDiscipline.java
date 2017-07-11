package it.pulzer.android.earthdawncharactercreator.disciples;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;
import it.pulzer.android.earthdawncharactercreator.Attribute;

/**
 * Created by thopu on 11.07.17.
 */

abstract class BaseDiscipline {
    Set<String> importantAttributes;
    SparseArray<KarmaModification> karmaModifications;
    int[] increasedDurability;
    Map<Integer, Set<Talent>> talentList;

    BaseDiscipline() {
        importantAttributes = new HashSet<>();
        karmaModifications = new SparseArray<KarmaModification>();
        increasedDurability[0] = 0;
        increasedDurability[1] = 0;
    }

    protected void setTalents(int circle, Set<Talent> talents) {
        talentList.put(circle, talents);
    }

    protected int getUnconsciousModification(int circle) {
        return circle*increasedDurability[0];
    }

    protected int getDeathModification(int circle) {
        return circle*increasedDurability[0];
    }

    protected int getPhysicalDefenseModification(int circle) {
        return 0;
    }

    protected int getMysticalDefenseModification(int circle) {
        return 0;
    }

    protected int getSocialDefenseModification(int circle) {
        return 0;
    }

    protected int getInitiativeModification(int circle) {
        return 0;
    }

    protected KarmaModification getKarmaModification(int circle) {
        return null;
    }
}
