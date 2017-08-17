package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Warrior extends BaseDiscipline {

    public Warrior() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.STR);
        importantAttributes.add(Attribute.TOU);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests in close combat"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ACROBATIC_DEFENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANTICIPATE_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISTRACT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIREBLOOD), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MANEUVER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SHIELD_BASH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TACTICS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.UNARMED_COMBAT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WAR_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WOOD_SKIN), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WOUND_BALANCE), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_DANCE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WATERFALL_SLAM), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DISARM), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LIFE_CHECK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MOMENTUM_ATTACK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SECOND_WEAPON), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEELY_STARE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SWIFT_KICK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.EARTH_SKIN), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.TEMPER_FLESH), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CRUSHING_BLOW), true, false));
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
}
