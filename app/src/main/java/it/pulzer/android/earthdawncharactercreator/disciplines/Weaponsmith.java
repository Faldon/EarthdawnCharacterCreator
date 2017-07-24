package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Weaponsmith extends BaseDiscipline {

    public Weaponsmith() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(1, new KarmaModification(1, "Tests for creating or repairing an item"));
        karmaModifications.put(3, new KarmaModification(1, "Recovery tests"));
        karmaModifications.put(5, new KarmaModification(1, "Attack tests with self-made weapons"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DANGER_SENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISARM_TRAP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIREBLOOD), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HAGGLE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SHIELD_BASH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.READ_AND_WRITE_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THREAD_SMITHING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FORGE_WEAPON), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ITEM_HISTORY), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.STEEL_THOUGHT), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SUPPRESS_CURSE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WOUND_BALANCE), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_SHOUT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DIPLOMACY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.EARTH_SKIN), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRE_HEAL), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HEARTENING_LAUGH), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IRON_CONSTITUTION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MISSILE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FORGE_ARMOR), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.TEMPER_FLESH), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SPOT_ARMOR_FLAW), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), true, false));
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
    public int getMysticalArmorModification(int circle) {
        return circle>=7 ? 1 : 0;
    }
}
