package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Beastmaster extends BaseDiscipline {

    public Beastmaster() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests on unarmed combat"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ACROBATIC_DEFENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_BOND), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_TRAINING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BORROW_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CREATURE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCE_ANIMAL_COMPANION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRACKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), true, false));
                    add(new DiscipleTalent(getTalent(Talent.CLAW_SHAPE), true, false));
                    add(new DiscipleTalent(getTalent(Talent.BEAST_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.UNARMED_COMBAT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WILDERNESS_SURVIVAL), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DOMINATE_BEAST), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.GREAT_LEAP), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_COMPANION_DURABILITY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_POSSESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_BELLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CALL_ANIMAL_COMPANION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.COBRA_STRIKE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IRON_CONSTITUTION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPRINT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SWIFT_KICK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BLOOD_SHARE), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_TALK), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DOWN_STRIKE), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CLAW_FRENZY), true, false));
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
