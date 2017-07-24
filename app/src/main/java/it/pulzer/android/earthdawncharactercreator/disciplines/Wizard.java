package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Wizard extends BaseDiscipline {

    public Wizard() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(3, new KarmaModification(1, "Tests to remember information (including knowledge tests)"));
        karmaModifications.put(5, new KarmaModification(1, "Change range of one spell from self to touch."));

        increasedDurability[0] = 3;
        increasedDurability[1] = 4;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ARCANE_MUTTERINGS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BOOK_MEMORY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CREATURE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ITEM_HISTORY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.READ_AND_WRITE_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.DISPEL_MAGIC), true, false));
                    add(new DiscipleTalent(getTalent(Talent.PATTERNCRAFT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.RESEARCH), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SPELLCASTING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WIZARDRY), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_SIGHT), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.TENACIOUS_WEAVE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DIRECTION_ARROW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DIPLOMACY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), false, true));
                    add(new DiscipleTalent(getTalent(Talent.EVIDENCE_ANALYSIS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HYPNOTIZE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LIFESIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.POWER_MASK), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRUE_SIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_INTERFERENCE), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WILLFORCE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.HOLD_THREAD), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SUPPRESS_CURSE), true, false));
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
    public int getMysticalArmorModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
