package it.pulzer.android.earthdawncharactercreator.model;

/**
 * Created by thopu on 11.07.17.
 */

public class Talent {

    //region Talent name declaration
    public static final String ACROBATIC_DEFENSE = "Acrobatic Defense";
    public static final String AIR_DANCE = "Air Dance";
    public static final String AIR_SAILING = "Air Sailing";
    public static final String AIR_SPEAKING = "Air Speaking";
    public static final String AIR_WEAVING = "Air Weaving";
    public static final String ANIMAL_BOND = "Animal Bond";
    public static final String ANIMAL_COMPANION_DURABILITY = "Animal Companion Durability";
    public static final String ANIMAL_POSSESSION = "Animal Possession";
    public static final String ANIMAL_TALK = "Animal Talk";
    public static final String ANIMAL_TRAINING = "Animal Training";
    public static final String ANTICIPATE_BLOW = "Anticipate Blow";
    public static final String ARCANE_MUTTERINGS = "Arcane Mutterings";
    public static final String ARMOR_MOUNT = "Armor Mount";
    public static final String ARROW_WEAVING = "Arrow Weaving";
    public static final String ASTRAL_INTERFERENCE = "Astral Interference";
    public static final String ASTRAL_SIGHT = "Astral Sight";
    public static final String AVOID_BLOW = "Avoid Blow";
    public static final String AWARENESS = "Awareness";
    public static final String BANISH = "Banish";
    public static final String BANK_SHOT = "Bank Shot";
    public static final String BATTLE_BELLOW = "Battle Bellow";
    public static final String BATTLE_SHOUT = "Battle Shout";
    public static final String BEAST_WEAVING = "Beast Weaving";
    public static final String BLADE_JUGGLE = "Blade Juggle";
    public static final String BLOOD_SHARE = "Blood Share";
    public static final String BOOK_MEMORY = "Book Memory";
    public static final String BORROW_SENSE = "Borrow Sense";
    public static final String CALL_ANIMAL_COMPANION = "Call Animal Companion";
    public static final String CALL_MISSILE = "Call Missile";
    public static final String CHARGE = "Charge";
    public static final String CLAW_FRENZY = "Claw Frency";
    public static final String CLAW_SHAPE = "Claw Shape";
    public static final String CLIMBING = "Climbing";
    public static final String COBRA_STRIKE = "Cobra Strike";
    public static final String COLD_PURIFY = "Cold Purify";
    public static final String COMMAND_NIGHTFLYER = "Command Nightflyer";
    public static final String CONCEAL_OBJECT = "Conceal Object";
    public static final String CONVERSATION = "Conversation";
    public static final String CREATURE_ANALYSIS = "Creature Analysis";
    public static final String CRUSHING_BLOW = "Crushing Blow";
    public static final String DANGER_SENSE = "Danger Sense";
    public static final String DEAD_FALL = "Dead Fall";
    public static final String DIPLOMACY = "Diplomacy";
    public static final String DIRECTION_ARROW = "Direction Arrow";
    public static final String DISARM = "Disarm";
    public static final String DISARM_TRAP = "Disarm Trap";
    public static final String DISGUISE_SELF = "Disguise Self";
    public static final String DISPEL_MAGIC = "Dispel Magic";
    public static final String DISTRACT = "Distract";
    public static final String DOMINATE_BEAST = "Dominate Beast";
    public static final String DOUBLECHARGE = "Double Charge";
    public static final String DOWN_STRIKE = "Down Strike";
    public static final String EARTH_SKIN = "Earth Skin";
    public static final String ELEMENTALISM = "Elementalism";
    public static final String ELEMENTAL_HOLD = "Elemental Hold";
    public static final String ELEMENTAL_TONGUES = "Elemental Tongues";
    public static final String EMOTION_SONG = "Emotion Song";
    public static final String EMPATHIC_SENSE = "Empathic Sense";
    public static final String ENGAGING_BANTER = "Engaging Banter";
    public static final String ENHANCED_MATRIX = "Enhanced Matrix";
    public static final String ENHANCE_ANIMAL_COMPANION = "Enhance Animal Companion";
    public static final String ETIQUETTE = "Etiquette";
    public static final String EVIDENCE_ANALYSIS = "Evidence Analysis";
    public static final String FALSE_SIGHT = "False Sight";
    public static final String FAST_HAND = "Fast Hand";
    public static final String FEARSOME_CHARGE = "Fearsome Charge";
    public static final String FIREBLOOD = "Fireblood";
    public static final String FIRE_HEAL = "Fire Heal";
    public static final String FIRST_IMPRESSION = "First Impression";
    public static final String FLAME_ARROW = "Flame Arrow";
    public static final String FORGE_ARMOR = "Forge Armor";
    public static final String FORGE_WEAPON = "Forge Weapon";
    public static final String FRIGHTEN = "Frighten";
    public static final String GLIDING_STRIDE = "Gliding Stride";
    public static final String GRACEFUL_EXIT = "Graceful Exit";
    public static final String GREAT_LEAP = "Great Leap";
    public static final String HAGGLE = "Haggle";
    public static final String HEARTENING_LAUGH = "Heartening Laugh";
    public static final String HOLD_THREAD = "Hold Thread";
    public static final String HYPNOTIZE = "Hypnotize";
    public static final String ILLUSIONISM = "Illusionism";
    public static final String IMPRESSIVE_DISPLAY = "Impressive Display";
    public static final String INSPIRE_OTHERS = "Inspire Others";
    public static final String IRON_CONSTITUTION = "Iron Constitution";
    public static final String ITEM_HISTORY = "Item History";
    public static final String LASTING_IMPRESSION = "Lasting Impression";
    public static final String LEADERSHIP = "Leadership";
    public static final String LIFESIGHT = "Lifesight";
    public static final String LIFE_CHECK = "Life Check";
    public static final String LION_HEART = "Lion Heart";
    public static final String LOCK_PICKING = "Lock Picking";
    public static final String LONG_SHOT = "Long Shot";
    public static final String MANEUVER = "Maneuver";
    public static final String MELEE_WEAPONS = "Melee Weapons";
    public static final String MIMIC_VOICE = "Mimic Voice";
    public static final String MISSILE_WEAPONS = "Missile Weapons";
    public static final String MOMENTUM_ATTACK = "Momentum Attack";
    public static final String MOUNT_ATTACK = "Mount Attack";
    public static final String MYSTIC_AIM = "Mystic Aim";
    public static final String NAVIGATION = "Navigation";
    public static final String NETHERMANCY = "Nethermancy";
    public static final String ORBITING_SPY = "Orbiting Spy";
    public static final String PATTERNCRAFT = "Patterncraft";
    public static final String PICKING_POCKETS = "Picking Pockets";
    public static final String POWER_MASK = "Power Mask";
    public static final String READ_AND_WRITE_LANGUAGE = "Read and Write Language";
    public static final String RESEARCH = "Research";
    public static final String RESIST_TAUNT = "Resist Taunt";
    public static final String RIDER_WEAVING = "Rider Weaving";
    public static final String RIPOSTE = "Riposte";
    public static final String SAFE_PATH = "Safe Path";
    public static final String SCOUT_WEAVING = "Scout Weaving";
    public static final String SECOND_ATTACK = "Second Attack";
    public static final String SECOND_SHOT = "Second Shot";
    public static final String SECOND_WEAPON = "Second Weapon";
    public static final String SHIELD_BASH = "Shield Bash";
    public static final String SKY_WEAVING = "Sky Weaving";
    public static final String SLOUGH_BLAME = "Slough Blame";
    public static final String SPEAK_LANGUAGE = "Speak Language";
    public static final String SPELLCASTING = "Spellcasting";
    public static final String SPIRIT_HOLD = "Spirit Hold";
    public static final String SPIRIT_MOUNT = "Spirit Mount";
    public static final String SPIRIT_TALK = "Spirit Talk";
    public static final String SPOT_ARMOR_FLAW = "Spot Armor Flaw";
    public static final String SPRINT = "Sprint";
    public static final String STANDARD_MATRIX = "Standard Matrix";
    public static final String STEALTHY_STRIDE = "Stealthy Stride";
    public static final String STEELY_STARE = "Steely Stare";
    public static final String STEEL_THOUGHT = "Steel Thought";
    public static final String STOPPING_AIM = "Stopping Aim";
    public static final String STORY_WEAVING = "Story Weaving";
    public static final String SUMMON_ALLY_SPIRITS = "Summon Ally Spirits";
    public static final String SUMMON_ELEMENTAL_SPIRITS = "Summon Elemental Spirit";
    public static final String SUPPRESS_CURSE = "Suppress Curse";
    public static final String SURE_MOUNT = "Sure Mount";
    public static final String SURPRISE_STRIKE = "Surprise Strike";
    public static final String SWIFT_KICK = "Swift Kick";
    public static final String TACTICS = "Tactics";
    public static final String TAUNT = "Taunt";
    public static final String TEMPER_FLESH = "Temper Flesh";
    public static final String TENACIOUS_WEAVE = "Tenacious Weave";
    public static final String THIEF_WEAVING = "Thief Weaving";
    public static final String THOUGHT_LINK = "Thought Link";
    public static final String THREAD_SMITHING = "Thread Smithing";
    public static final String THREAD_WEAVING = "Thread Weaving";
    public static final String THROWING_WEAPONS = "Throwing Weapons";
    public static final String TIGER_SPRING = "Tiger Spring";
    public static final String TRACKING = "Tracking";
    public static final String TRICK_RIDING = "Trick Riding";
    public static final String TRUE_SHOT = "True Shot";
    public static final String TRUE_SIGHT = "True Sight";
    public static final String UNARMED_COMBAT = "Unarmed Combat";
    public static final String WAR_WEAVING = "War Weaving";
    public static final String WATERFALL_SLAM = "Waterfall Slam";
    public static final String WEAPON_WEAVING = "Weapon Weaving";
    public static final String WHEELING_ATTACK = "Wheeling Attack";
    public static final String WHEELING_DEFENSE = "Wheeling Defense";
    public static final String WILDERNESS_SURVIVAL = "Wilderness Survival";
    public static final String WILLFORCE = "Willforce";
    public static final String WIND_CATCHER = "Wind Catcher";
    public static final String WINNING_SMILE = "Winning Smile";
    public static final String WIZARDRY = "Wizardry";
    public static final String WOOD_SKIN = "Wood Skin";
    public static final String WOUND_BALANCE = "Wound Balance";
    //endregion

    //region Action name declaration
    static final String ACTION_FREE = "Free";
    static final String ACTION_NA = "Not available";
    static final String ACTION_SIMPLE = "Simple";
    static final String ACTION_STANDARD = "Standard";
    static final String ACTION_SUSTAINED = "Sustained";
    //endregion

    //region Properties
    public String name;
    public String baseAttribute;
    public String action;
    public int strain;
    public int skill;
    public boolean improvised;
    //endregion

    public Talent(String name, String attribute, String action, int strain, int skill, boolean improvised) {
        this.name = name;
        this.baseAttribute = attribute;
        this.skill = skill;
        this.action = action;
        this.strain = strain;
        this.improvised = improvised;
    }

    public static Talent create(String name) {
        switch(name) {
            case DISTRACT:
                return new Talent(DISTRACT, Attribute.CHA, ACTION_SIMPLE, 1, 1, true);
            case ANIMAL_TRAINING:
                return new Talent(ANIMAL_TRAINING, Attribute.CHA, ACTION_SUSTAINED, 0, 1, false);
            case WHEELING_DEFENSE:
                return new Talent(WHEELING_DEFENSE, Attribute.DEX, ACTION_SIMPLE, 1, 5, false);
            case ACROBATIC_DEFENSE:
                return new Talent(ACROBATIC_DEFENSE, Attribute.DEX, ACTION_SIMPLE, 1, 1, false);
            case INSPIRE_OTHERS:
                return new Talent(INSPIRE_OTHERS, Attribute.CHA, ACTION_STANDARD, 0, 0, false);
            case ARCANE_MUTTERINGS:
                return new Talent(ARCANE_MUTTERINGS, Attribute.CHA, ACTION_STANDARD, 0, 1, false);
            case ITEM_HISTORY:
                return new Talent(ITEM_HISTORY, Attribute.PER, ACTION_SUSTAINED, 0, 0, false);
            case ASTRAL_INTERFERENCE:
                return new Talent(ASTRAL_INTERFERENCE, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case ASTRAL_SIGHT:
                return new Talent(ASTRAL_SIGHT, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case TEMPER_FLESH:
                return new Talent(TEMPER_FLESH, Attribute.WIL, ACTION_SUSTAINED, 0, 0, false);
            case AWARENESS:
                return new Talent(AWARENESS, Attribute.PER, ACTION_SIMPLE, 0, 1, true);
            case STOPPING_AIM:
                return new Talent(STOPPING_AIM, Attribute.CHA, ACTION_STANDARD, 1, 0, false);
            case IMPRESSIVE_DISPLAY:
                return new Talent(IMPRESSIVE_DISPLAY, null, ACTION_SIMPLE, 1, 5, false);
            case SUMMON_ALLY_SPIRITS:
                return new Talent(SUMMON_ALLY_SPIRITS, Attribute.PER, ACTION_SUSTAINED, 0, 0, false);
            case SUMMON_ELEMENTAL_SPIRITS:
                return new Talent(SUMMON_ELEMENTAL_SPIRITS, Attribute.PER, ACTION_SUSTAINED, 0, 0, false);
            case EVIDENCE_ANALYSIS:
                return new Talent(EVIDENCE_ANALYSIS, Attribute.PER, ACTION_SUSTAINED, 1, 5, false);
            case TRUE_SHOT:
                return new Talent(TRUE_SHOT, Attribute.DEX, ACTION_STANDARD, 2, 0, false);
            case LASTING_IMPRESSION:
                return new Talent(LASTING_IMPRESSION, Attribute.CHA, ACTION_STANDARD, 0, 0, false);
            case CLAW_FRENZY:
                return new Talent(CLAW_FRENZY, Attribute.DEX, ACTION_STANDARD, 1, 0, false);
            case FLAME_ARROW:
                return new Talent(FLAME_ARROW, Attribute.WIL, ACTION_FREE, 1, 0, false);
            case BOOK_MEMORY:
                return new Talent(BOOK_MEMORY, Attribute.WIL, ACTION_STANDARD, 0, 0, false);
            case DIPLOMACY:
                return new Talent(DIPLOMACY, Attribute.CHA, ACTION_SUSTAINED, 0, 1, false);
            case DOUBLECHARGE:
                return new Talent(DOUBLECHARGE, Attribute.DEX, ACTION_SIMPLE, 1, 0, false);
            case IRON_CONSTITUTION:
                return new Talent(IRON_CONSTITUTION, Attribute.TOU, ACTION_FREE, 0, 0, false);
            case STEEL_THOUGHT:
                return new Talent(STEEL_THOUGHT, Attribute.WIL, ACTION_FREE, 4, 0, false);
            case GRACEFUL_EXIT:
                return new Talent(GRACEFUL_EXIT, Attribute.CHA, ACTION_STANDARD, 0, 1, false);
            case ELEMENTAL_HOLD:
                return new Talent(ELEMENTAL_HOLD, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case ELEMENTAL_TONGUES:
                return new Talent(ELEMENTAL_TONGUES, Attribute.PER, ACTION_STANDARD, 1, 0, false);
            case EMPATHIC_SENSE:
                return new Talent(EMPATHIC_SENSE, Attribute.CHA, ACTION_STANDARD, 1, 0, false);
            case DISARM:
                return new Talent(DISARM, Attribute.DEX, ACTION_STANDARD, 1, 5, false);
            case EARTH_SKIN:
                return new Talent(EARTH_SKIN, Attribute.TOU, ACTION_STANDARD, 0, 0, false);
            case FIRST_IMPRESSION:
                return new Talent(FIRST_IMPRESSION, Attribute.CHA, ACTION_STANDARD, 0, 1, false);
            case ENHANCED_MATRIX:
                return new Talent(ENHANCED_MATRIX, null, ACTION_NA, 0, 0, false);
            case ETIQUETTE:
                return new Talent(ETIQUETTE, Attribute.CHA, ACTION_SUSTAINED, 0, 1, true);
            case HOLD_THREAD:
                return new Talent(HOLD_THREAD, Attribute.WIL, ACTION_SIMPLE, 1, 0, false);
            case THREAD_WEAVING:
                return new Talent(THREAD_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case DISARM_TRAP:
                return new Talent(DISARM_TRAP, Attribute.DEX, ACTION_STANDARD, 1, 1, false);
            case HAGGLE:
                return new Talent(HAGGLE, Attribute.CHA, ACTION_SUSTAINED, 0, 1, true);
            case FIREBLOOD:
                return new Talent(FIREBLOOD, Attribute.TOU, ACTION_STANDARD, 0, 0, false);
            case FAST_HAND:
                return new Talent(FAST_HAND, Attribute.DEX, ACTION_STANDARD, 1, 5, false);
            case SUPPRESS_CURSE:
                return new Talent(SUPPRESS_CURSE, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case RESEARCH:
                return new Talent(RESEARCH, Attribute.PER, ACTION_SUSTAINED, 0, 1, true);
            case SPEAK_LANGUAGE:
                return new Talent(SPEAK_LANGUAGE, Attribute.PER, ACTION_STANDARD, 1, 0, false);
            case LEADERSHIP:
                return new Talent(LEADERSHIP, Attribute.CHA, ACTION_SUSTAINED, 0, 5, false);
            case FEARSOME_CHARGE:
                return new Talent(FEARSOME_CHARGE, Attribute.CHA, ACTION_SIMPLE, 2, 0, false);
            case THOUGHT_LINK:
                return new Talent(THOUGHT_LINK, Attribute.PER, ACTION_STANDARD, 1, 0, false);
            case DANGER_SENSE:
                return new Talent(DANGER_SENSE, Attribute.DEX, ACTION_FREE, 1, 1, false);
            case EMOTION_SONG:
                return new Talent(EMOTION_SONG, Attribute.CHA, ACTION_SUSTAINED, 0, 1, false);
            case CONCEAL_OBJECT:
                return new Talent(CONCEAL_OBJECT, Attribute.DEX, ACTION_STANDARD, 1, 5, false);
            case SPIRIT_HOLD:
                return new Talent(SPIRIT_HOLD, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case SPIRIT_MOUNT:
                return new Talent(SPIRIT_MOUNT, Attribute.PER, ACTION_STANDARD, 1, 0, false);
            case SPIRIT_TALK:
                return new Talent(SPIRIT_TALK, Attribute.PER, ACTION_STANDARD, 1, 0, false);
            case WINNING_SMILE:
                return new Talent(WINNING_SMILE, Attribute.CHA, ACTION_STANDARD, 0, 0, false);
            case BANK_SHOT:
                return new Talent(BANK_SHOT, Attribute.DEX, ACTION_SIMPLE, 1, 0, false);
            case DOWN_STRIKE:
                return new Talent(DOWN_STRIKE, Attribute.STR, ACTION_FREE, 1, 0, false);
            case TENACIOUS_WEAVE:
                return new Talent(TENACIOUS_WEAVE, Attribute.WIL, ACTION_FREE, 1, 0, false);
            case FIRE_HEAL:
                return new Talent(FIRE_HEAL, Attribute.WIL, ACTION_SUSTAINED, 0, 0, false);
            case STEALTHY_STRIDE:
                return new Talent(STEALTHY_STRIDE, Attribute.DEX, ACTION_SIMPLE, 0, 1, false);
            case HEARTENING_LAUGH:
                return new Talent(HEARTENING_LAUGH, Attribute.CHA, ACTION_SIMPLE, 1, 1, false);
            case AVOID_BLOW:
                return new Talent(AVOID_BLOW, Attribute.DEX, ACTION_FREE, 1, 1, false);
            case WOOD_SKIN:
                return new Talent(WOOD_SKIN, Attribute.TOU, ACTION_STANDARD, 0, 0, false);
            case HYPNOTIZE:
                return new Talent(HYPNOTIZE, Attribute.CHA, ACTION_SUSTAINED, 1, 5, false);
            case FALSE_SIGHT:
                return new Talent(FALSE_SIGHT, Attribute.WIL, ACTION_FREE, 1, 0, false);
            case BATTLE_SHOUT:
                return new Talent(BATTLE_SHOUT, Attribute.CHA, ACTION_SIMPLE, 1, 1, false);
            case ANTICIPATE_BLOW:
                return new Talent(ANTICIPATE_BLOW, Attribute.PER, ACTION_SIMPLE, 1, 1, false);
            case CLIMBING:
                return new Talent(CLIMBING, Attribute.DEX, ACTION_STANDARD, 0, 1, true);
            case BLADE_JUGGLE:
                return new Talent(BLADE_JUGGLE, Attribute.DEX, ACTION_STANDARD, 1, 5, false);
            case COBRA_STRIKE:
                return new Talent(COBRA_STRIKE, Attribute.DEX, ACTION_FREE, 2, 0, false);
            case DIRECTION_ARROW:
                return new Talent(DIRECTION_ARROW, Attribute.PER, ACTION_STANDARD, 2, 0, false);
            case CONVERSATION:
                return new Talent(CONVERSATION, Attribute.CHA, ACTION_SUSTAINED, 0, 1, true);
            case CLAW_SHAPE:
                return new Talent(CLAW_SHAPE, Attribute.STR, ACTION_SIMPLE, 0, 0, false);
            case ORBITING_SPY:
                return new Talent(ORBITING_SPY, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case TRICK_RIDING:
                return new Talent(TRICK_RIDING, Attribute.DEX, ACTION_SIMPLE, 1, 1, false);
            case LIFESIGHT:
                return new Talent(LIFESIGHT, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case READ_AND_WRITE_LANGUAGE:
                return new Talent(READ_AND_WRITE_LANGUAGE, Attribute.PER, ACTION_SUSTAINED, 1, 0, false);
            case LIFE_CHECK:
                return new Talent(LIFE_CHECK, Attribute.TOU, ACTION_FREE, 0, 0, false);
            case LION_HEART:
                return new Talent(LION_HEART, Attribute.WIL, ACTION_FREE, 1, 0, false);
            case GLIDING_STRIDE:
                return new Talent(GLIDING_STRIDE, Attribute.DEX, ACTION_FREE, 1, 0, false);
            case AIR_SAILING:
                return new Talent(AIR_SAILING, Attribute.WIL, ACTION_SUSTAINED, 0, 1, false);
            case AIR_DANCE:
                return new Talent(AIR_DANCE, Attribute.DEX, ACTION_FREE, 2, 0, false);
            case POWER_MASK:
                return new Talent(POWER_MASK, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case DISPEL_MAGIC:
                return new Talent(DISPEL_MAGIC, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case MYSTIC_AIM:
                return new Talent(MYSTIC_AIM, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case DISGUISE_SELF:
                return new Talent(DISGUISE_SELF, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case MANEUVER:
                return new Talent(MANEUVER, Attribute.DEX, ACTION_SIMPLE, 1, 1, false);
            case ANIMAL_POSSESSION:
                return new Talent(ANIMAL_POSSESSION, Attribute.WIL, ACTION_STANDARD, 2, 0, false);
            case COMMAND_NIGHTFLYER:
                return new Talent(COMMAND_NIGHTFLYER, Attribute.WIL, ACTION_SUSTAINED, 1, 0, false);
            case SWIFT_KICK:
                return new Talent(SWIFT_KICK, Attribute.DEX, ACTION_SIMPLE, 1, 1, false);
            case MELEE_WEAPONS:
                return new Talent(MELEE_WEAPONS, Attribute.DEX, ACTION_STANDARD, 0, 1, true);
            case NAVIGATION:
                return new Talent(NAVIGATION, Attribute.PER, ACTION_SUSTAINED, 0, 1, false);
            case CALL_MISSILE:
                return new Talent(CALL_MISSILE, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case MISSILE_WEAPONS:
                return new Talent(MISSILE_WEAPONS, Attribute.DEX, ACTION_STANDARD, 0, 1, true);
            case COLD_PURIFY:
                return new Talent(COLD_PURIFY, Attribute.WIL, ACTION_SUSTAINED, 0, 0, false);
            case ARMOR_MOUNT:
                return new Talent(ARMOR_MOUNT, Attribute.WIL, ACTION_SIMPLE, 1, 0, false);
            case MOUNT_ATTACK:
                return new Talent(MOUNT_ATTACK, Attribute.DEX, ACTION_SIMPLE, 1, 5, false);
            case RIPOSTE:
                return new Talent(RIPOSTE, Attribute.DEX, ACTION_FREE, 2, 5, false);
            case FORGE_ARMOR:
                return new Talent(FORGE_ARMOR, Attribute.PER, ACTION_SUSTAINED, 0, 0, false);
            case BLOOD_SHARE:
                return new Talent(BLOOD_SHARE, Attribute.TOU, ACTION_STANDARD, 0, 0, false);
            case SHIELD_BASH:
                return new Talent(SHIELD_BASH, Attribute.STR, ACTION_SIMPLE, 1, 1, false);
            case BATTLE_BELLOW:
                return new Talent(BATTLE_BELLOW, Attribute.CHA, ACTION_SIMPLE, 1, 5, false);
            case LOCK_PICKING:
                return new Talent(LOCK_PICKING, Attribute.DEX, ACTION_STANDARD, 0, 1, false);
            case CRUSHING_BLOW:
                return new Talent(CRUSHING_BLOW, Attribute.STR, ACTION_FREE, 1, 5, false);
            case SLOUGH_BLAME:
                return new Talent(SLOUGH_BLAME, Attribute.CHA, ACTION_STANDARD, 1, 5, true);
            case SPOT_ARMOR_FLAW:
                return new Talent(SPOT_ARMOR_FLAW, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case WHEELING_ATTACK:
                return new Talent(WHEELING_ATTACK, Attribute.DEX, ACTION_STANDARD, 1, 5, false);
            case MOMENTUM_ATTACK:
                return new Talent(MOMENTUM_ATTACK, Attribute.DEX, ACTION_SIMPLE, 1, 0, false);
            case SAFE_PATH:
                return new Talent(SAFE_PATH, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case SURE_MOUNT:
                return new Talent(SURE_MOUNT, Attribute.STR, ACTION_FREE, 0, 1, false);
            case SPRINT:
                return new Talent(SPRINT, null, ACTION_SIMPLE, 1, 0, false);
            case SPELLCASTING:
                return new Talent(SPELLCASTING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case TRACKING:
                return new Talent(TRACKING, Attribute.PER, ACTION_STANDARD, 0, 1, true);
            case STEELY_STARE:
                return new Talent(STEELY_STARE, Attribute.CHA, ACTION_STANDARD, 1, 0, false);
            case STANDARD_MATRIX:
                return new Talent(STANDARD_MATRIX, null, ACTION_NA, 0, 0, false);
            case WOUND_BALANCE:
                return new Talent(WOUND_BALANCE, Attribute.STR, ACTION_FREE, 0, 1, false);
            case RESIST_TAUNT:
                return new Talent(RESIST_TAUNT, Attribute.WIL, ACTION_FREE, 1, 5, true);
            case MIMIC_VOICE:
                return new Talent(MIMIC_VOICE, Attribute.CHA, ACTION_SIMPLE, 0, 1, false);
            case PATTERNCRAFT:
                return new Talent(PATTERNCRAFT, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case CHARGE:
                return new Talent(CHARGE, Attribute.STR, ACTION_FREE, 0, 1, false);
            case TACTICS:
                return new Talent(TACTICS, Attribute.PER, ACTION_STANDARD, 0, 5, false);
            case PICKING_POCKETS:
                return new Talent(PICKING_POCKETS, Attribute.DEX, ACTION_STANDARD, 0, 1, false);
            case CREATURE_ANALYSIS:
                return new Talent(CREATURE_ANALYSIS, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case DOMINATE_BEAST:
                return new Talent(DOMINATE_BEAST, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case ANIMAL_BOND:
                return new Talent(ANIMAL_BOND, Attribute.CHA, ACTION_STANDARD, 0, 1, false);
            case CALL_ANIMAL_COMPANION:
                return new Talent(CALL_ANIMAL_COMPANION, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case ENHANCE_ANIMAL_COMPANION:
                return new Talent(ENHANCE_ANIMAL_COMPANION, Attribute.WIL, ACTION_SUSTAINED, 0, 0, false);
            case BORROW_SENSE:
                return new Talent(BORROW_SENSE, Attribute.WIL, ACTION_STANDARD, 0, 0, false);
            case ANIMAL_TALK:
                return new Talent(ANIMAL_TALK, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case TIGER_SPRING:
                return new Talent(TIGER_SPRING, null, ACTION_FREE, 1, 0, false);
            case DEAD_FALL:
                return new Talent(DEAD_FALL, Attribute.WIL, ACTION_SIMPLE, 1, 0, false);
            case SURPRISE_STRIKE:
                return new Talent(SURPRISE_STRIKE, Attribute.STR, ACTION_FREE, 1, 1, false);
            case ANIMAL_COMPANION_DURABILITY:
                return new Talent(ANIMAL_COMPANION_DURABILITY, null, ACTION_NA, 0, 0, false);
            case TRUE_SIGHT:
                return new Talent(TRUE_SIGHT, null, ACTION_NA, 0, 0, false);
            case FRIGHTEN:
                return new Talent(FRIGHTEN, Attribute.WIL, ACTION_STANDARD, 0, 0, false);
            case BANISH:
                return new Talent(BANISH, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case TAUNT:
                return new Talent(TAUNT, Attribute.CHA, ACTION_SIMPLE, 1, 1, false);
            case FORGE_WEAPON:
                return new Talent(FORGE_WEAPON, Attribute.PER, ACTION_SUSTAINED, 0, 0, false);
            case UNARMED_COMBAT:
                return new Talent(UNARMED_COMBAT, Attribute.DEX, ACTION_STANDARD, 0, 1, true);
            case WATERFALL_SLAM:
                return new Talent(WATERFALL_SLAM, null, ACTION_FREE, 1, 0, false);
            case LONG_SHOT:
                return new Talent(LONG_SHOT, null, ACTION_SIMPLE, 1, 0, false);
            case GREAT_LEAP:
                return new Talent(GREAT_LEAP, Attribute.DEX, ACTION_FREE, 1, 1, false);
            case WILDERNESS_SURVIVAL:
                return new Talent(WILDERNESS_SURVIVAL, Attribute.PER, ACTION_SUSTAINED, 0, 1, true);
            case WILLFORCE:
                return new Talent(WILLFORCE, Attribute.WIL, ACTION_FREE, 1, 0, false);
            case WIND_CATCHER:
                return new Talent(WIND_CATCHER, Attribute.WIL, ACTION_STANDARD, 1, 0, false);
            case AIR_SPEAKING:
                return new Talent(AIR_SPEAKING, Attribute.PER, ACTION_SIMPLE, 1, 0, false);
            case ENGAGING_BANTER:
                return new Talent(ENGAGING_BANTER, Attribute.CHA, ACTION_STANDARD, 0, 1, false);
            case THROWING_WEAPONS:
                return new Talent(THROWING_WEAPONS, Attribute.DEX, ACTION_STANDARD, 0, 1, true);
            case SECOND_ATTACK:
                return new Talent(SECOND_ATTACK, Attribute.DEX, ACTION_SIMPLE, 2, 5, false);
            case SECOND_SHOT:
                return new Talent(SECOND_SHOT, Attribute.DEX, ACTION_SIMPLE, 2, 5, false);
            case SECOND_WEAPON:
                return new Talent(SECOND_WEAPON, Attribute.DEX, ACTION_SIMPLE, 1, 5, false);
            case AIR_WEAVING:
                return new Talent(AIR_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case ARROW_WEAVING:
                return new Talent(ARROW_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case BEAST_WEAVING:
                return new Talent(BEAST_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case RIDER_WEAVING:
                return new Talent(RIDER_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case ELEMENTALISM:
                return new Talent(ELEMENTALISM, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case ILLUSIONISM:
                return new Talent(ILLUSIONISM, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case NETHERMANCY:
                return new Talent(NETHERMANCY, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case SCOUT_WEAVING:
                return new Talent(SCOUT_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case WEAPON_WEAVING:
                return new Talent(WEAPON_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case SKY_WEAVING:
                return new Talent(SKY_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case THIEF_WEAVING:
                return new Talent(THIEF_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case STORY_WEAVING:
                return new Talent(STORY_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case WAR_WEAVING:
                return new Talent(WAR_WEAVING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case THREAD_SMITHING:
                return new Talent(THREAD_SMITHING, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            case WIZARDRY:
                return new Talent(WIZARDRY, Attribute.PER, ACTION_STANDARD, 0, 0, false);
            default:
                return new Talent(name, null, null, 0, 0, false);
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject == this) {
            return true;
        }
        if (!(anObject instanceof Talent)) {
            return false;
        }
        Talent toCompare = (Talent)anObject;
        return toCompare.name.equals(this.name);
    }

    public static class TalentException extends Exception {

        public TalentException() {
            super();
        }

        public TalentException(String message) {
            super(message);
        }
    }
}

