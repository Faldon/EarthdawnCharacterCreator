package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class SkyRaider extends BaseDiscipline {

    public SkyRaider() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.STR);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests of close combat and throwing weapons with min size of one-handed size restriction"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_SAILING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AIR_SPEAKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SHIELD_BASH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.NAVIGATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THROWING_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.UNARMED_COMBAT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WILDERNESS_SURVIVAL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WIND_CATCHER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SKY_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_SHOUT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FIREBLOOD), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.GREAT_LEAP), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WOUND_BALANCE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FIRE_HEAL), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DISTRACT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IRON_CONSTITUTION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SECOND_WEAPON), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPRINT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SWIFT_KICK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TACTICS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_BELLOW), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.STEELY_STARE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DOWN_STRIKE), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.MOMENTUM_ATTACK), true, false));
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
    public int getRecoveryCountModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
