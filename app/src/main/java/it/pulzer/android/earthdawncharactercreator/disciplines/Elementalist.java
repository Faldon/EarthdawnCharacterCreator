package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Elementalist extends BaseDiscipline {

    public Elementalist() {
        super();
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Add one extra ally to target of spell"));

        increasedDurability[0] = 3;
        increasedDurability[1] = 4;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_SPEAKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ARCANE_MUTTERINGS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ASTRAL_SIGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ITEM_HISTORY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TRACKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WILDERNESS_SURVIVAL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WIND_CATCHER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STANDARD_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.PATTERNCRAFT), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SPELLCASTING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ELEMENTALISM), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WOOD_SKIN), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.FIRE_HEAL), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ELEMENTAL_TONGUES), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ELEMENTAL_HOLD), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.BANISH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.COLD_PURIFY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISPEL_MAGIC), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIREBLOOD), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GLIDING_STRIDE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.NAVIGATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SAFE_PATH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TENACIOUS_WEAVE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENHANCED_MATRIX), true, false));
                    add(new DiscipleTalent(getTalent(Talent.SUMMON_ELEMENTAL_SPIRITS), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WILLFORCE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.EARTH_SKIN), true, false));
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
    public int getPhysicalDefenseModification(int circle) {
        return circle>=4 ? 1 : 0;
    }

    @Override
    public int getRecoveryCountModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
