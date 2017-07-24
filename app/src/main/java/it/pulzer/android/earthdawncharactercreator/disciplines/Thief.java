package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Thief extends BaseDiscipline {

    public Thief() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.PER);

        karmaModifications.put(1, new KarmaModification(1, "Any Charisma based test to trick someone"));
        karmaModifications.put(3, new KarmaModification(1, "Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "Attack tests on surprised foes or from dead angle."));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GREAT_LEAP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPRINT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SURPRISE_STRIKE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THROWING_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.THIEF_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.LOCK_PICKING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.PICKING_POCKETS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DISARM_TRAP), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.HAGGLE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CONCEAL_OBJECT), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.BLADE_JUGGLE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CALL_MISSILE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DEAD_FALL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DIRECTION_ARROW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISGUISE_SELF), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GRACEFUL_EXIT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MIMIC_VOICE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SECOND_WEAPON), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRUE_SIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENGAGING_BANTER), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SLOUGH_BLAME), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FAST_HAND), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FALSE_SIGHT), true, false));
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
    public int getSocialDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getInitiativeModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
