package it.pulzer.android.earthdawncharactercreator.disciplines;

import android.support.annotation.Nullable;
import android.util.SparseArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.model.KarmaModification;
import it.pulzer.android.earthdawncharactercreator.model.Talent;

/**
 * Created by thopu on 11.07.17.
 */

public abstract class BaseDiscipline {
    public class DiscipleTalent {
        protected Talent talent;
        protected boolean discipline;
        protected boolean free;

        protected DiscipleTalent(Talent talent, boolean discipline, boolean free) {
            this.talent = talent;
            this.discipline = discipline;
            this.free = free;
        };

        public Talent getTalent() {
            return talent;
        }

        public boolean isDiscipline() {
            return discipline;
        }

        public boolean isFree() {
            return free;
        }
    }

    public static final HashSet<Talent> TALENTS = new HashSet<Talent>(){
        {
            add(Talent.create(Talent.DISTRACT));
            add(Talent.create(Talent.ANIMAL_TRAINING));
            add(Talent.create(Talent.WHEELING_DEFENSE));
            add(Talent.create(Talent.ACROBATIC_DEFENSE));
            add(Talent.create(Talent.INSPIRE_OTHERS));
            add(Talent.create(Talent.ARCANE_MUTTERINGS));
            add(Talent.create(Talent.ITEM_HISTORY));
            add(Talent.create(Talent.ASTRAL_INTERFERENCE));
            add(Talent.create(Talent.ASTRAL_SIGHT));
            add(Talent.create(Talent.TEMPER_FLESH));
            add(Talent.create(Talent.AWARENESS));
            add(Talent.create(Talent.STOPPING_AIM));
            add(Talent.create(Talent.IMPRESSIVE_DISPLAY));
            add(Talent.create(Talent.SUMMON_ALLY_SPIRITS));
            add(Talent.create(Talent.SUMMON_ELEMENTAL_SPIRITS));
            add(Talent.create(Talent.EVIDENCE_ANALYSIS));
            add(Talent.create(Talent.TRUE_SHOT));
            add(Talent.create(Talent.LASTING_IMPRESSION));
            add(Talent.create(Talent.CLAW_FRENZY));
            add(Talent.create(Talent.FLAME_ARROW));
            add(Talent.create(Talent.BOOK_MEMORY));
            add(Talent.create(Talent.DIPLOMACY));
            add(Talent.create(Talent.DOUBLECHARGE));
            add(Talent.create(Talent.IRON_CONSTITUTION));
            add(Talent.create(Talent.STEEL_THOUGHT));
            add(Talent.create(Talent.GRACEFUL_EXIT));
            add(Talent.create(Talent.ELEMENTAL_HOLD));
            add(Talent.create(Talent.ELEMENTAL_TONGUES));
            add(Talent.create(Talent.EMPATHIC_SENSE));
            add(Talent.create(Talent.DISARM));
            add(Talent.create(Talent.EARTH_SKIN));
            add(Talent.create(Talent.FIRST_IMPRESSION));
            add(Talent.create(Talent.ENHANCED_MATRIX));
            add(Talent.create(Talent.ETIQUETTE));
            add(Talent.create(Talent.HOLD_THREAD));
            add(Talent.create(Talent.THREAD_WEAVING));
            add(Talent.create(Talent.DISARM_TRAP));
            add(Talent.create(Talent.HAGGLE));
            add(Talent.create(Talent.FIREBLOOD));
            add(Talent.create(Talent.FAST_HAND));
            add(Talent.create(Talent.SUPPRESS_CURSE));
            add(Talent.create(Talent.RESEARCH));
            add(Talent.create(Talent.SPEAK_LANGUAGE));
            add(Talent.create(Talent.LEADERSHIP));
            add(Talent.create(Talent.FEARSOME_CHARGE));
            add(Talent.create(Talent.THOUGHT_LINK));
            add(Talent.create(Talent.DANGER_SENSE));
            add(Talent.create(Talent.EMOTION_SONG));
            add(Talent.create(Talent.CONCEAL_OBJECT));
            add(Talent.create(Talent.SPIRIT_HOLD));
            add(Talent.create(Talent.SPIRIT_MOUNT));
            add(Talent.create(Talent.SPIRIT_TALK));
            add(Talent.create(Talent.WINNING_SMILE));
            add(Talent.create(Talent.BANK_SHOT));
            add(Talent.create(Talent.DOWN_STRIKE));
            add(Talent.create(Talent.TENACIOUS_WEAVE));
            add(Talent.create(Talent.FIRE_HEAL));
            add(Talent.create(Talent.STEALTHY_STRIDE));
            add(Talent.create(Talent.HEARTENING_LAUGH));
            add(Talent.create(Talent.AVOID_BLOW));
            add(Talent.create(Talent.WOOD_SKIN));
            add(Talent.create(Talent.HYPNOTIZE));
            add(Talent.create(Talent.FALSE_SIGHT));
            add(Talent.create(Talent.BATTLE_SHOUT));
            add(Talent.create(Talent.ANTICIPATE_BLOW));
            add(Talent.create(Talent.CLIMBING));
            add(Talent.create(Talent.BLADE_JUGGLE));
            add(Talent.create(Talent.COBRA_STRIKE));
            add(Talent.create(Talent.DIRECTION_ARROW));
            add(Talent.create(Talent.CONVERSATION));
            add(Talent.create(Talent.CLAW_SHAPE));
            add(Talent.create(Talent.ORBITING_SPY));
            add(Talent.create(Talent.TRICK_RIDING));
            add(Talent.create(Talent.LIFESIGHT));
            add(Talent.create(Talent.READ_AND_WRITE_LANGUAGE));
            add(Talent.create(Talent.LIFE_CHECK));
            add(Talent.create(Talent.LION_HEART));
            add(Talent.create(Talent.GLIDING_STRIDE));
            add(Talent.create(Talent.AIR_SAILING));
            add(Talent.create(Talent.AIR_DANCE));
            add(Talent.create(Talent.POWER_MASK));
            add(Talent.create(Talent.DISPEL_MAGIC));
            add(Talent.create(Talent.MYSTIC_AIM));
            add(Talent.create(Talent.DISGUISE_SELF));
            add(Talent.create(Talent.MANEUVER));
            add(Talent.create(Talent.ANIMAL_POSSESSION));
            add(Talent.create(Talent.COMMAND_NIGHTFLYER));
            add(Talent.create(Talent.SWIFT_KICK));
            add(Talent.create(Talent.MELEE_WEAPONS));
            add(Talent.create(Talent.NAVIGATION));
            add(Talent.create(Talent.CALL_MISSILE));
            add(Talent.create(Talent.MISSILE_WEAPONS));
            add(Talent.create(Talent.COLD_PURIFY));
            add(Talent.create(Talent.ARMOR_MOUNT));
            add(Talent.create(Talent.MOUNT_ATTACK));
            add(Talent.create(Talent.RIPOSTE));
            add(Talent.create(Talent.FORGE_ARMOR));
            add(Talent.create(Talent.BLOOD_SHARE));
            add(Talent.create(Talent.SHIELD_BASH));
            add(Talent.create(Talent.BATTLE_BELLOW));
            add(Talent.create(Talent.LOCK_PICKING));
            add(Talent.create(Talent.CRUSHING_BLOW));
            add(Talent.create(Talent.SLOUGH_BLAME));
            add(Talent.create(Talent.SPOT_ARMOR_FLAW));
            add(Talent.create(Talent.WHEELING_ATTACK));
            add(Talent.create(Talent.MOMENTUM_ATTACK));
            add(Talent.create(Talent.SAFE_PATH));
            add(Talent.create(Talent.SURE_MOUNT));
            add(Talent.create(Talent.SPRINT));
            add(Talent.create(Talent.SPELLCASTING));
            add(Talent.create(Talent.TRACKING));
            add(Talent.create(Talent.STEELY_STARE));
            add(Talent.create(Talent.STANDARD_MATRIX));
            add(Talent.create(Talent.WOUND_BALANCE));
            add(Talent.create(Talent.RESIST_TAUNT));
            add(Talent.create(Talent.MIMIC_VOICE));
            add(Talent.create(Talent.PATTERNCRAFT));
            add(Talent.create(Talent.CHARGE));
            add(Talent.create(Talent.TACTICS));
            add(Talent.create(Talent.PICKING_POCKETS));
            add(Talent.create(Talent.CREATURE_ANALYSIS));
            add(Talent.create(Talent.DOMINATE_BEAST));
            add(Talent.create(Talent.ANIMAL_BOND));
            add(Talent.create(Talent.CALL_ANIMAL_COMPANION));
            add(Talent.create(Talent.ENHANCE_ANIMAL_COMPANION));
            add(Talent.create(Talent.BORROW_SENSE));
            add(Talent.create(Talent.ANIMAL_TALK));
            add(Talent.create(Talent.TIGER_SPRING));
            add(Talent.create(Talent.DEAD_FALL));
            add(Talent.create(Talent.SURPRISE_STRIKE));
            add(Talent.create(Talent.ANIMAL_COMPANION_DURABILITY));
            add(Talent.create(Talent.TRUE_SIGHT));
            add(Talent.create(Talent.FRIGHTEN));
            add(Talent.create(Talent.BANISH));
            add(Talent.create(Talent.TAUNT));
            add(Talent.create(Talent.FORGE_WEAPON));
            add(Talent.create(Talent.UNARMED_COMBAT));
            add(Talent.create(Talent.WATERFALL_SLAM));
            add(Talent.create(Talent.LONG_SHOT));
            add(Talent.create(Talent.GREAT_LEAP));
            add(Talent.create(Talent.WILDERNESS_SURVIVAL));
            add(Talent.create(Talent.WILLFORCE));
            add(Talent.create(Talent.WIND_CATCHER));
            add(Talent.create(Talent.AIR_SPEAKING));
            add(Talent.create(Talent.ENGAGING_BANTER));
            add(Talent.create(Talent.THROWING_WEAPONS));
            add(Talent.create(Talent.SECOND_ATTACK));
            add(Talent.create(Talent.SECOND_SHOT));
            add(Talent.create(Talent.SECOND_WEAPON));
            add(Talent.create(Talent.AIR_WEAVING));
            add(Talent.create(Talent.ARROW_WEAVING));
            add(Talent.create(Talent.BEAST_WEAVING));
            add(Talent.create(Talent.RIDER_WEAVING));
            add(Talent.create(Talent.ELEMENTALISM));
            add(Talent.create(Talent.ILLUSIONISM));
            add(Talent.create(Talent.NETHERMANCY));
            add(Talent.create(Talent.SCOUT_WEAVING));
            add(Talent.create(Talent.WEAPON_WEAVING));
            add(Talent.create(Talent.SKY_WEAVING));
            add(Talent.create(Talent.THIEF_WEAVING));
            add(Talent.create(Talent.STORY_WEAVING));
            add(Talent.create(Talent.WAR_WEAVING));
            add(Talent.create(Talent.THREAD_SMITHING));
            add(Talent.create(Talent.WIZARDRY));
        }
    };

    Set<String> importantAttributes;
    SparseArray<KarmaModification> karmaModifications;
    int[] increasedDurability;
    Map<Integer, Set<DiscipleTalent>> availableTalents;

    BaseDiscipline() {
        importantAttributes = new HashSet<>();
        availableTalents = new HashMap<>();
        karmaModifications = new SparseArray<KarmaModification>();
        increasedDurability = new int[2];
        increasedDurability[0] = 0;
        increasedDurability[1] = 0;
    }

    void setTalents(int circle, Set<DiscipleTalent> talents) {
        availableTalents.put(circle, talents);
    }

    public int getUnconsciousModification(int circle) {
        return circle*increasedDurability[0];
    }

    public int getDeathModification(int circle) {
        return circle*increasedDurability[0];
    }

    public int getPhysicalDefenseModification(int circle) {
        return 0;
    }

    public int getMysticalDefenseModification(int circle) {
        return 0;
    }

    public int getSocialDefenseModification(int circle) {
        return 0;
    }

    public int getInitiativeModification(int circle) {
        return 0;
    }

    public int getRecoveryCountModification(int circle) { return 0; }

    public KarmaModification getKarmaModification(int circle) {
        return karmaModifications.get(circle, null);
    }

    public int getMysticalArmorModification(int circle) { return 0; }

    public int getPhysicalArmorModification(int circle) { return 0; }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Nullable
    public DiscipleTalent getDiscipleTalent(String talentName) {
        for(Talent t : TALENTS) {
            if(t.name.equals(talentName)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return dt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Talent getTalent(String name) throws Talent.TalentException {
        for(Talent t : TALENTS) {
            if(t.name.equals(name)) {
                return t;
            }
        }
        throw new Talent.TalentException("Talent not found");
    }

    public Set<DiscipleTalent> getAvailableTalents(int circle) {
        return availableTalents.get(circle);
    }

    public boolean hasTalent(String name) {
        for(Talent t : TALENTS) {
            if(t.name.equals(name)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isDisciplineTalent(String talentName) {
        for(Talent t : TALENTS) {
            if(t.name.equals(talentName)) {
                for(int i : availableTalents.keySet()) {
                    for(DiscipleTalent dt : availableTalents.get(i)) {
                        if(dt.talent.equals(t)) {
                            return dt.discipline;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isDisciplineTalent(Talent talent) {
        for(int i : availableTalents.keySet()) {
            for(DiscipleTalent dt : availableTalents.get(i)) {
                if(dt.talent.equals(talent)) {
                    return dt.discipline;
                }
            }
        }
        return false;
    }
}
