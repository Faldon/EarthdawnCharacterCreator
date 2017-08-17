package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Swordmaster extends BaseDiscipline {

    public Swordmaster() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.CHA);

        karmaModifications.put(3, new KarmaModification(1, "Interaction tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests with close combat weapons"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ACROBATIC_DEFENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANTICIPATE_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISTRACT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IMPRESSIVE_DISPLAY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.UNARMED_COMBAT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WINNING_SMILE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WOUND_BALANCE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WEAPON_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MANEUVER), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.TAUNT), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.RIPOSTE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.HEARTENING_LAUGH), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.COBRA_STRIKE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENGAGING_BANTER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GLIDING_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GRACEFUL_EXIT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LASTING_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPRINT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SWIFT_KICK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SECOND_WEAPON), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DISARM), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SECOND_ATTACK), true, false));
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
        if(circle >= 4) {
            modification += 1;
        }
        if(circle >= 8) {
            modification += 2;
        }
        return modification;
    }

    @Override
    public int getSocialDefenseModification(int circle) {
        int modification = 0;
        if(circle >= 2) {
            modification += 1;
        }
        if(circle >= 6) {
            modification += 2;
        }
        return modification;
    }

    @Override
    public int getInitiativeModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
