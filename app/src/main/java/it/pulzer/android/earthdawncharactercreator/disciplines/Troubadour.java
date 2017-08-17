package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.util.Log;

import java.util.HashSet;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public class Troubadour extends BaseDiscipline {

    public Troubadour() {
        super();
        importantAttributes.add(Attribute.CHA);
        importantAttributes.add(Attribute.PER);

        karmaModifications.put(3, new KarmaModification(1, "Tests for gathering or remembering information"));
        karmaModifications.put(5, new KarmaModification(1, "Once per round for actions of another character by encouraging. Requires sight/hearing"));

        increasedDurability[0] = 5;
        increasedDurability[1] = 6;

        try {
            setTalents(1, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AVOID_BLOW), false, false));
                    add(new DiscipleTalent(getTalent(Talent.CONVERSATION), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HAGGLE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.IMPRESSIVE_DISPLAY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MELEE_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.READ_AND_WRITE_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.SPEAK_LANGUAGE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.TAUNT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.THROWING_WEAPONS), false, false));
                    add(new DiscipleTalent(getTalent(Talent.WINNING_SMILE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.STORY_WEAVING), true, false));
                    add(new DiscipleTalent(getTalent(Talent.EMOTION_SONG), true, false));
                    add(new DiscipleTalent(getTalent(Talent.FIRST_IMPRESSION), true, false));
                    add(new DiscipleTalent(getTalent(Talent.HEARTENING_LAUGH), true, false));
                    add(new DiscipleTalent(getTalent(Talent.ITEM_HISTORY), true, false));
                }
            });
            setTalents(2, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.ETIQUETTE), true, false));
                }
            });
            setTalents(3, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.EMPATHIC_SENSE), true, false));
                }
            });
            setTalents(4, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.RESEARCH), true, false));
                }
            });
            setTalents(5, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.AIR_SPEAKING), false, false));
                    add(new DiscipleTalent(getTalent(Talent.BLADE_JUGGLE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DIPLOMACY), false, false));
                    add(new DiscipleTalent(getTalent(Talent.DISGUISE_SELF), false, false));
                    add(new DiscipleTalent(getTalent(Talent.ENGAGING_BANTER), false, false));
                    add(new DiscipleTalent(getTalent(Talent.GRACEFUL_EXIT), false, false));
                    add(new DiscipleTalent(getTalent(Talent.HYPNOTIZE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LEADERSHIP), false, false));
                    add(new DiscipleTalent(getTalent(Talent.LION_HEART), false, false));
                    add(new DiscipleTalent(getTalent(Talent.MIMIC_VOICE), false, false));
                    add(new DiscipleTalent(getTalent(Talent.INSPIRE_OTHERS), true, false));
                }
            });
            setTalents(6, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.LASTING_IMPRESSION), true, false));
                }
            });
            setTalents(7, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.RESIST_TAUNT), true, false));
                }
            });
            setTalents(8, new HashSet<DiscipleTalent>() {
                {
                    add(new DiscipleTalent(getTalent(Talent.SLOUGH_BLAME), true, false));
                }
            });
        } catch (Talent.TalentException e) {
            Log.e("EarthdawnCC", "Unsanitized input when building talent list for " + getName());
            System.exit(-1);
        }

    }

    @Override
    public int getSocialDefenseModification(int circle) {
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
