package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Illusionist extends BaseDiscipline {

    public Illusionist() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(3, new KarmaModification(1, "Interaction tests"));
        karmaModifications.put(5, new KarmaModification(1, "Add bonus of 2 to effect step of spell"));

        increasedDurability[0] = 3;
        increasedDurability[1] = 4;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ARCANE_MUTTERINGS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_SIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DEAD_FALL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MIMIC_VOICE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WINNING_SMILE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FALSE_SIGHT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), true, false));
                    add(new DiscipleTalent(getTalent(Talent.PATTERNCRAFT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SPELLCASTING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ILLUSIONISM), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.TRUE_SIGHT), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.DISGUISE_SELF), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CONCEAL_OBJECT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISPEL_MAGIC), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENGAGING_BANTER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), false, true));
                    add(new DiscipleTalent(getTalent(Talent.FAST_HAND), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FRIGHTEN), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SLOUGH_BLAME), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TENACIOUS_WEAVE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.POWER_MASK), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WILLFORCE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.HYPNOTIZE), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.HOLD_THREAD), true, false));
                }
            });
        } catch (Talent.TalentException e) {
            Log.e("EarthdawnCC", "Unsanitized input when building talent list for " + getName());
            System.exit(-1);
        }

    }

    @Override
    public int getMysticalDefenseModification(int circle) {
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
