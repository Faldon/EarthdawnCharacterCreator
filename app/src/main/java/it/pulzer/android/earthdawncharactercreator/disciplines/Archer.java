package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Archer extends BaseDiscipline {

    public Archer() {
        super();
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.PER);

        karmaModifications.put(1, new KarmaModification(1, "Sight-based perception tests"));
        karmaModifications.put(3, new KarmaModification(1, "Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "Damage tests with projectile weapons"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CREATURE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IMPRESSIVE_DISPLAY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.NAVIGATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THROWING_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRACKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WILDERNESS_SURVIVAL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CALL_MISSILE), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MYSTIC_AIM), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ARROW_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.TRUE_SHOT), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DIRECTION_ARROW), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ANTICIPATE_BLOW), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.LONG_SHOT), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISTRACT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.EVIDENCE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STOPPING_AIM), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TIGER_SPRING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.BANK_SHOT), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FLAME_ARROW), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SECOND_SHOT), true, false));
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
