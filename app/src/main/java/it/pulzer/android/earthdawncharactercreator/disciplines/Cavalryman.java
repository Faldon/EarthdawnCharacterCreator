package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Cavalryman extends BaseDiscipline {

    public Cavalryman() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.PER);

        karmaModifications.put(3, new KarmaModification(1, "Attack tests of storm attacks"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests on mounted attacks"));

        increasedDurability[0] = 7;
        increasedDurability[1] = 8;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_SHOUT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BLOOD_SHARE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CREATURE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DOMINATE_BEAST), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HEARTENING_LAUGH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SURE_MOUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_BOND), true, false));
                    add(new DiscipleTalent(getTalent(Talent.CHARGE), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.RIDER_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.TRICK_RIDING), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_TRAINING), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ENHANCE_ANIMAL_COMPANION), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CALL_ANIMAL_COMPANION), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANIMAL_COMPANION_DURABILITY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.EMPATHIC_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FEARSOME_CHARGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MOUNT_ATTACK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPIRIT_MOUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TACTICS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ARMOR_MOUNT), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WHEELING_ATTACK), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WHEELING_DEFENSE), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DOUBLECHARGE), true, false));
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
