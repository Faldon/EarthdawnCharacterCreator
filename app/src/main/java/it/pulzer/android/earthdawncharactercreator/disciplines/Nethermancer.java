package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Nethermancer extends BaseDiscipline {

    public Nethermancer() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(3, new KarmaModification(1, "Any one test per round against demons, demon constructs or undead"));
        karmaModifications.put(5, new KarmaModification(1, "Raise penalty for 2 points the target is suffering through a spell"));

        increasedDurability[0] = 3;
        increasedDurability[1] = 4;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ARCANE_MUTTERINGS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.COMMAND_NIGHTFLYER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISPEL_MAGIC), false, false));
                    add(new DiscipleTalent(getTalent(Talent.READ_AND_WRITE_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEALTHY_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SUPPRESS_CURSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_SIGHT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FRIGHTEN), true, false));
                    add(new DiscipleTalent(getTalent(Talent.PATTERNCRAFT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SPELLCASTING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.NETHERMANCY), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SPIRIT_TALK), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SPIRIT_HOLD), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_INTERFERENCE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BANISH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BLOOD_SHARE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LIFESIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESEARCH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPIRIT_MOUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEELY_STARE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TENACIOUS_WEAVE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), true, true));
                    add(new DiscipleTalent(getTalent(Talent.SUMMON_ALLY_SPIRITS), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WILLFORCE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ORBITING_SPY), true, false));
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
    public int getMysticalArmorModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
