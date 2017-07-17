package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.support.annotation.Nullable;
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
    protected class DiscipleTalent {
        protected Talent talent;
        protected boolean discipline;
        protected boolean free;

        protected DiscipleTalent(Talent talent, boolean discipline, boolean free) {
            this.talent = talent;
            this.discipline = discipline;
            this.free = free;
        };
    }

    public static final HashSet<Talent> TALENTS = new HashSet<Talent>(){
        {
            add(Talent.create(Talent.ACROBATIC_DEFENSE));
            add(Talent.create(Talent.AIR_SAILING));
            add(Talent.create(Talent.AIR_WEAVING));
            add(Talent.create(Talent.AVOID_BLOW));
            add(Talent.create(Talent.CLIMBING));
            add(Talent.create(Talent.DISTRACT));
            add(Talent.create(Talent.FIRST_IMPRESSION));
            add(Talent.create(Talent.GREAT_LEAP));
            add(Talent.create(Talent.HAGGLE));
            add(Talent.create(Talent.MANEUVER));
            add(Talent.create(Talent.MELEE_WEAPONS));
            add(Talent.create(Talent.NAVIGATION));
            add(Talent.create(Talent.SPEAK_LANGUAGE));
            add(Talent.create(Talent.TAUNT));
            add(Talent.create(Talent.THROWING_WEAPONS));
            add(Talent.create(Talent.WIND_CATCHER));
        }
    };

    Set<String> importantAttributes;
    SparseArray<KarmaModification> karmaModifications;
    int[] increasedDurability;
    Map<Integer, Set<DiscipleTalent>> availableTalents;

    BaseDiscipline() {
        importantAttributes = new HashSet<>();
        karmaModifications = new SparseArray<KarmaModification>();
        increasedDurability = new int[2];
        increasedDurability[0] = 0;
        increasedDurability[1] = 0;
    }

    void setTalents(int circle, Set<DiscipleTalent> talents) {
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

    public int getRecoveryCountModification(int circle) { return 0; }

    public KarmaModification getKarmaModification(int circle) {
        return karmaModifications.get(circle, null);
    }

    public int getMysticalArmorModification(int circle) { return 0; }

    public int getPhysicalArmorModification(int circle) { return 0; }

    public String getName() {
        return this.getClass().getName();
    }

    @Nullable
    public DiscipleTalent getDiscipleTalent(String talentName) {
        for(Talent t : TALENTS) {
            if(t.name.equals(talentName)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return dt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Talent getTalent(String name) throws Talent.TalentException {
        for(Talent t : TALENTS) {
            if(t.name.equals(name)) {
                return t;
            }
        }
        throw new Talent.TalentException("Talent not found");
    }

    public boolean hasTalent(String name) {
        for(Talent t : TALENTS) {
            if(t.name.equals(name)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isDisciplineTalent(String talentName) {
        for(Talent t : TALENTS) {
            if(t.name.equals(talentName)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return dt.discipline;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isDisciplineTalent(Talent talent) {
        for(int i : availableTalents.keySet()) {
            for(DiscipleTalent dt : availableTalents.get(i)) {
                if(dt.talent.equals(talent)) {
                    return dt.discipline;
                }
            }
        }
        return false;
    }
}
