package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class AirSailor extends BaseDiscipline {

    public AirSailor() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.DEX);
        importantAttributes.add(Attribute.WIL);

        karmaModifications.put(1, new KarmaModification(1, "once per round on any action taken while on board an airship"));
        karmaModifications.put(3, new KarmaModification(1, "on Initiative tests"));
        karmaModifications.put(5, new KarmaModification(1, "on Interaction tests"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ACROBATIC_DEFENSE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISTRACT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GREAT_LEAP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HAGGLE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MANEUVER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.NAVIGATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THROWING_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.AIR_SAILING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), true, false));
                    add(new DiscipleTalent(getTalent(Talent.CLIMBING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), true, false));
                    add(new DiscipleTalent(getTalent(Talent.AIR_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.WIND_CATCHER), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AWARENESS), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.EMPATHIC_SENSE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.WOUND_BALANCE), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_SPEAKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BATTLE_BELLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CONCEAL_OBJECT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENGAGING_BANTER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GRACEFUL_EXIT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SECOND_WEAPON), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SURPRISE_STRIKE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HEARTENING_LAUGH), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_DANCE), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.INSPIRE_OTHERS), true, false));
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
