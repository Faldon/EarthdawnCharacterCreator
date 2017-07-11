package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.SparseArray;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public abstract class BaseDiscipline {
    Set<String> importantAttributes;
    SparseArray<KarmaModification> karmaModifications;
    int[] increasedDurability;
    Map<Integer, Set<Talent>> availableTalents;

    BaseDiscipline() {
        importantAttributes = new HashSet<>();
        karmaModifications = new SparseArray<KarmaModification>();
        increasedDurability[0] = 0;
        increasedDurability[1] = 0;
    }

    void setTalents(int circle, Set<Talent> talents) {
        availableTalents.put(circle, talents);
    }

    public int getUnconsciousModification(int circle) {
        return circle*increasedDurability[0];
    }

    public int getDeathModification(int circle) {
        return circle*increasedDurability[0];
    }

    public int getPhysicalDefenseModification(int circle) {
        return 0;
    }

    public int getMysticalDefenseModification(int circle) {
        return 0;
    }

    public int getSocialDefenseModification(int circle) {
        return 0;
    }

    public int getInitiativeModification(int circle) {
        return 0;
    }

    public KarmaModification getKarmaModification(int circle) {
        return null;
    }
}
