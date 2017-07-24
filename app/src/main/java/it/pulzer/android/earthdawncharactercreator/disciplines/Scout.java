package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Scout extends BaseDiscipline {

    public Scout() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.PER);

        karmaModifications.put(1, new KarmaModification(1, "Test for finding something"));
        karmaModifications.put(3, new KarmaModification(1, "Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "Recovery tests"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANTICIPATE_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CREATURE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISARM_TRAP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GREAT_LEAP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LOCK_PICKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.READ_AND_WRITE_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.NAVIGATION), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SCOUT_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.TRACKING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WILDERNESS_SURVIVAL), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DIRECTION_ARROW), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_BOND), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BORROW_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CONCEAL_OBJECT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISGUISE_SELF), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPIRIT_MOUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPRINT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SURPRISE_STRIKE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRUE_SIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.EVIDENCE_ANALYSIS), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_SIGHT), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SAFE_PATH), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ORBITING_SPY), true, false));
                }
            });
        } catch (Talent.TalentException e) {
            Log.e("EarthdawnCC", "Unsanitized input when building talent list for " + getName());
            System.exit(-1);
        }

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
    public int getInitiativeModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
