package it.pulzer.android.earthdawncharactercreator;

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
    public static final String ASTRAL_INTERFERENCE = "Astral Interference";
    public static final String ASTRAL_SIGHT = "Astral Sight";
    public static final String AVOID_BLOW = "Avoid Blow";
    public static final String AWARENESS = "Awareness";
    public static final String BANISH = "Banish";
    public static final String BANK_SHOT = "Bank Shot";
    public static final String BATTLE_BELLOW = "Battle Bellow";
    public static final String BATTLE_SHOUT = "Battle Shout";
    public static final String BLADE_JUGGLE = "Blade Juggle";
    public static final String BLOOD_SHARE = "Blood Share";
    public static final String BOOK_MEMORY = "Book Memory";
    public static final String BORROW_SENSE = "Borrow Sense";
    public static final String CALL_ANIMAL_COMPANION = "Call Animal Companion";
    public static final String CALL_MISSILE = "Call Missile";
    public static final String CALL_MISSLE = "Call Missle";
    public static final String CHARGE = "Charge";
    public static final String CLAW_FRENCY = "Claw Frency";
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
    public static final String DOUBLECHARGE = "Double-Charge";
    public static final String DOWN_STRIDE = "Down Stride";
    public static final String DOWN_STRIKE = "Down Strike";
    public static final String EARTH_SKIN = "Earth Skin";
    public static final String ELEMENTAL_HOLD = "Elemental Hold";
    public static final String ELEMENTAL_TONGUES = "Elemental Tongues";
    public static final String EMOTION_SONG = "Emotion Song";
    public static final String EMPATHIC_SENSE = "Empathic Sense";
    public static final String ENGAGING_BANTER = "Engaging Banter";
    public static final String ENHANCED_MATRIX = "Enhanced Matrix";
    public static final String ENHANCE_ANIMAL_COMPANION = "Enhance Animal Companion";
    public static final String ETIQUETTE = "Etiquette";
    public static final String ETTIQUETTE = "Ettiquette";
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
    public static final String MISSLE_WEAPONS = "Missle Weapons";
    public static final String MOMENTUM_ATTACK = "Momentum Attack";
    public static final String MOUNT_ATTACK = "Mount Attack";
    public static final String MYSTIC_AIM = "Mystic Aim";
    public static final String NAVIGATION = "Navigation";
    public static final String ORBITING_SPY = "Orbiting Spy";
    public static final String PATTERNCRAFT = "Patterncraft";
    public static final String PICKING_POCKETS = "Picking Pockets";
    public static final String POWER_MASK = "Power Mask";
    public static final String READ_AND_WRITE_LANGUAGE = "Read and Write Language";
    public static final String READ_AND_WRITE_LANGUAGES = "Read and Write Languages";
    public static final String RESEARCH = "Research";
    public static final String RESIST_TAUNT = "Resist Taunt";
    public static final String RIPOSTE = "Riposte";
    public static final String SAFE_PATH = "Safe Path";
    public static final String SECOND_ATTACK = "Second Attack";
    public static final String SECOND_SHOT = "Second Shot";
    public static final String SECOND_WEAPON = "Second Weapon";
    public static final String SHIELD_BASH = "Shield Bash";
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
    public static final String SUMMON = "Summon";
    public static final String SUPPRESS_CURSE = "Suppress Curse";
    public static final String SURE_MOUNT = "Sure Mount";
    public static final String SURPRISE_STRIKE = "Surprise Strike";
    public static final String SWIFT_KICK = "Swift Kick";
    public static final String TACTICS = "Tactics";
    public static final String TAUNT = "Taunt";
    public static final String TEMPER_FLESH = "Temper Flesh";
    public static final String TENACIOUS_WEAVE = "Tenacious Weave";
    public static final String THREAD_WEAVING = "Thread Weaving";
    public static final String THROWING_WEAPONS = "Throwing Weapons";
    public static final String TIGERSPRING = "Tigerspring";
    public static final String TIGER_SPRING = "Tiger Spring";
    public static final String TRACKING = "Tracking";
    public static final String TRICK_RIDING = "Trick Riding";
    public static final String TRUE_SHOT = "True Shot";
    public static final String TRUE_SIGHT = "True Sight";
    public static final String UNARMED_COMBAT = "Unarmed Combat";
    public static final String WATERFALL_SLAM = "Waterfall Slam";
    public static final String WHEELING_ATTACK = "Wheeling Attack";
    public static final String WHEELING_DEFENSE = "Wheeling Defense";
    public static final String WILDERNESS_SURVIVAL = "Wilderness Survival";
    public static final String WILLFORCE = "Willforce";
    public static final String WIND_CATCHER = "Wind Catcher";
    public static final String WINNING_SMILE = "Winning Smile";
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
    
    public String name;
    public String baseAttribute;
    public boolean skill;
    public String action;
    public int strain;

    public Talent(String name, String attribute, boolean skill, String action, int strain) {
        this.name = name;
        this.baseAttribute = attribute;
        this.skill = skill;
        this.action = action;
        this.strain = strain;
    }

    public static Talent create(String talentname) {
        switch(talentname) {
            case ACROBATIC_DEFENSE:
                return new Talent(ACROBATIC_DEFENSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AIR_DANCE:
            	return new Talent(AIR_DANCE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AIR_SAILING:
				return new Talent(AIR_SAILING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AIR_SPEAKING:
				return new Talent(AIR_SPEAKING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AIR_WEAVING:
				return new Talent(AIR_WEAVING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANIMAL_BOND:
				return new Talent(ANIMAL_BOND, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANIMAL_COMPANION_DURABILITY:
				return new Talent(ANIMAL_COMPANION_DURABILITY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANIMAL_POSSESSION:
				return new Talent(ANIMAL_POSSESSION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANIMAL_TALK:
				return new Talent(ANIMAL_TALK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANIMAL_TRAINING:
				return new Talent(ANIMAL_TRAINING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ANTICIPATE_BLOW:
				return new Talent(ANTICIPATE_BLOW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ARCANE_MUTTERINGS:
				return new Talent(ARCANE_MUTTERINGS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ARMOR_MOUNT:
				return new Talent(ARMOR_MOUNT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ASTRAL_INTERFERENCE:
				return new Talent(ASTRAL_INTERFERENCE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ASTRAL_SIGHT:
				return new Talent(ASTRAL_SIGHT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AVOID_BLOW:
				return new Talent(AVOID_BLOW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case AWARENESS:
				return new Talent(AWARENESS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BANISH:
				return new Talent(BANISH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BANK_SHOT:
				return new Talent(BANK_SHOT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BATTLE_BELLOW:
				return new Talent(BATTLE_BELLOW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BATTLE_SHOUT:
				return new Talent(BATTLE_SHOUT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BLADE_JUGGLE:
				return new Talent(BLADE_JUGGLE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BLOOD_SHARE:
				return new Talent(BLOOD_SHARE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BOOK_MEMORY:
				return new Talent(BOOK_MEMORY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case BORROW_SENSE:
				return new Talent(BORROW_SENSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CALL_ANIMAL_COMPANION:
				return new Talent(CALL_ANIMAL_COMPANION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CALL_MISSILE:
				return new Talent(CALL_MISSILE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CALL_MISSLE:
				return new Talent(CALL_MISSLE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CHARGE:
				return new Talent(CHARGE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CLAW_FRENCY:
				return new Talent(CLAW_FRENCY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CLAW_SHAPE:
				return new Talent(CLAW_SHAPE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CLIMBING:
				return new Talent(CLIMBING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case COBRA_STRIKE:
				return new Talent(COBRA_STRIKE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case COLD_PURIFY:
				return new Talent(COLD_PURIFY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case COMMAND_NIGHTFLYER:
				return new Talent(COMMAND_NIGHTFLYER, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CONCEAL_OBJECT:
				return new Talent(CONCEAL_OBJECT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CONVERSATION:
				return new Talent(CONVERSATION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CREATURE_ANALYSIS:
				return new Talent(CREATURE_ANALYSIS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case CRUSHING_BLOW:
				return new Talent(CRUSHING_BLOW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DANGER_SENSE:
				return new Talent(DANGER_SENSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DEAD_FALL:
				return new Talent(DEAD_FALL, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DIPLOMACY:
				return new Talent(DIPLOMACY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DIRECTION_ARROW:
				return new Talent(DIRECTION_ARROW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DISARM:
				return new Talent(DISARM, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DISARM_TRAP:
				return new Talent(DISARM_TRAP, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DISGUISE_SELF:
				return new Talent(DISGUISE_SELF, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DISPEL_MAGIC:
				return new Talent(DISPEL_MAGIC, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DISTRACT:
				return new Talent(DISTRACT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DOMINATE_BEAST:
				return new Talent(DOMINATE_BEAST, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DOUBLECHARGE:
				return new Talent(DOUBLECHARGE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DOWN_STRIDE:
				return new Talent(DOWN_STRIDE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case DOWN_STRIKE:
				return new Talent(DOWN_STRIKE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case EARTH_SKIN:
				return new Talent(EARTH_SKIN, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ELEMENTAL_HOLD:
				return new Talent(ELEMENTAL_HOLD, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ELEMENTAL_TONGUES:
				return new Talent(ELEMENTAL_TONGUES, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case EMOTION_SONG:
				return new Talent(EMOTION_SONG, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case EMPATHIC_SENSE:
				return new Talent(EMPATHIC_SENSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ENGAGING_BANTER:
				return new Talent(ENGAGING_BANTER, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ENHANCED_MATRIX:
				return new Talent(ENHANCED_MATRIX, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ENHANCE_ANIMAL_COMPANION:
				return new Talent(ENHANCE_ANIMAL_COMPANION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ETIQUETTE:
				return new Talent(ETIQUETTE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ETTIQUETTE:
				return new Talent(ETTIQUETTE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case EVIDENCE_ANALYSIS:
				return new Talent(EVIDENCE_ANALYSIS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FALSE_SIGHT:
				return new Talent(FALSE_SIGHT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FAST_HAND:
				return new Talent(FAST_HAND, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FEARSOME_CHARGE:
				return new Talent(FEARSOME_CHARGE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FIREBLOOD:
				return new Talent(FIREBLOOD, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FIRE_HEAL:
				return new Talent(FIRE_HEAL, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FIRST_IMPRESSION:
				return new Talent(FIRST_IMPRESSION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FLAME_ARROW:
				return new Talent(FLAME_ARROW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FORGE_ARMOR:
				return new Talent(FORGE_ARMOR, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FORGE_WEAPON:
				return new Talent(FORGE_WEAPON, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case FRIGHTEN:
				return new Talent(FRIGHTEN, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case GLIDING_STRIDE:
				return new Talent(GLIDING_STRIDE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case GRACEFUL_EXIT:
				return new Talent(GRACEFUL_EXIT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case GREAT_LEAP:
				return new Talent(GREAT_LEAP, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case HAGGLE:
				return new Talent(HAGGLE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case HEARTENING_LAUGH:
				return new Talent(HEARTENING_LAUGH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case HOLD_THREAD:
				return new Talent(HOLD_THREAD, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case HYPNOTIZE:
				return new Talent(HYPNOTIZE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case IMPRESSIVE_DISPLAY:
				return new Talent(IMPRESSIVE_DISPLAY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case INSPIRE_OTHERS:
				return new Talent(INSPIRE_OTHERS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case IRON_CONSTITUTION:
				return new Talent(IRON_CONSTITUTION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ITEM_HISTORY:
				return new Talent(ITEM_HISTORY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LASTING_IMPRESSION:
				return new Talent(LASTING_IMPRESSION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LEADERSHIP:
				return new Talent(LEADERSHIP, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LIFESIGHT:
				return new Talent(LIFESIGHT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LIFE_CHECK:
				return new Talent(LIFE_CHECK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LION_HEART:
				return new Talent(LION_HEART, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LOCK_PICKING:
				return new Talent(LOCK_PICKING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case LONG_SHOT:
				return new Talent(LONG_SHOT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MANEUVER:
				return new Talent(MANEUVER, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MELEE_WEAPONS:
				return new Talent(MELEE_WEAPONS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MIMIC_VOICE:
				return new Talent(MIMIC_VOICE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MISSILE_WEAPONS:
				return new Talent(MISSILE_WEAPONS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MISSLE_WEAPONS:
				return new Talent(MISSLE_WEAPONS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MOMENTUM_ATTACK:
				return new Talent(MOMENTUM_ATTACK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MOUNT_ATTACK:
				return new Talent(MOUNT_ATTACK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case MYSTIC_AIM:
				return new Talent(MYSTIC_AIM, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case NAVIGATION:
				return new Talent(NAVIGATION, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case ORBITING_SPY:
				return new Talent(ORBITING_SPY, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case PATTERNCRAFT:
				return new Talent(PATTERNCRAFT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case PICKING_POCKETS:
				return new Talent(PICKING_POCKETS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case POWER_MASK:
				return new Talent(POWER_MASK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case READ_AND_WRITE_LANGUAGE:
				return new Talent(READ_AND_WRITE_LANGUAGE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case READ_AND_WRITE_LANGUAGES:
				return new Talent(READ_AND_WRITE_LANGUAGES, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case RESEARCH:
				return new Talent(RESEARCH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case RESIST_TAUNT:
				return new Talent(RESIST_TAUNT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case RIPOSTE:
				return new Talent(RIPOSTE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SAFE_PATH:
				return new Talent(SAFE_PATH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SECOND_ATTACK:
				return new Talent(SECOND_ATTACK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SECOND_SHOT:
				return new Talent(SECOND_SHOT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SECOND_WEAPON:
				return new Talent(SECOND_WEAPON, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SHIELD_BASH:
				return new Talent(SHIELD_BASH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SLOUGH_BLAME:
				return new Talent(SLOUGH_BLAME, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPEAK_LANGUAGE:
				return new Talent(SPEAK_LANGUAGE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPELLCASTING:
				return new Talent(SPELLCASTING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPIRIT_HOLD:
				return new Talent(SPIRIT_HOLD, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPIRIT_MOUNT:
				return new Talent(SPIRIT_MOUNT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPIRIT_TALK:
				return new Talent(SPIRIT_TALK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPOT_ARMOR_FLAW:
				return new Talent(SPOT_ARMOR_FLAW, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SPRINT:
				return new Talent(SPRINT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case STANDARD_MATRIX:
				return new Talent(STANDARD_MATRIX, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case STEALTHY_STRIDE:
				return new Talent(STEALTHY_STRIDE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case STEELY_STARE:
				return new Talent(STEELY_STARE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case STEEL_THOUGHT:
				return new Talent(STEEL_THOUGHT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case STOPPING_AIM:
				return new Talent(STOPPING_AIM, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SUMMON:
				return new Talent(SUMMON, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SUPPRESS_CURSE:
				return new Talent(SUPPRESS_CURSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SURE_MOUNT:
				return new Talent(SURE_MOUNT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SURPRISE_STRIKE:
				return new Talent(SURPRISE_STRIKE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case SWIFT_KICK:
				return new Talent(SWIFT_KICK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TACTICS:
				return new Talent(TACTICS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TAUNT:
				return new Talent(TAUNT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TEMPER_FLESH:
				return new Talent(TEMPER_FLESH, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TENACIOUS_WEAVE:
				return new Talent(TENACIOUS_WEAVE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case THREAD_WEAVING:
				return new Talent(THREAD_WEAVING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case THROWING_WEAPONS:
				return new Talent(THROWING_WEAPONS, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TIGERSPRING:
				return new Talent(TIGERSPRING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TIGER_SPRING:
				return new Talent(TIGER_SPRING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TRACKING:
				return new Talent(TRACKING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TRICK_RIDING:
				return new Talent(TRICK_RIDING, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TRUE_SHOT:
				return new Talent(TRUE_SHOT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case TRUE_SIGHT:
				return new Talent(TRUE_SIGHT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case UNARMED_COMBAT:
				return new Talent(UNARMED_COMBAT, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WATERFALL_SLAM:
				return new Talent(WATERFALL_SLAM, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WHEELING_ATTACK:
				return new Talent(WHEELING_ATTACK, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WHEELING_DEFENSE:
				return new Talent(WHEELING_DEFENSE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WILDERNESS_SURVIVAL:
				return new Talent(WILDERNESS_SURVIVAL, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WILLFORCE:
				return new Talent(WILLFORCE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WIND_CATCHER:
				return new Talent(WIND_CATCHER, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WINNING_SMILE:
				return new Talent(WINNING_SMILE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WOOD_SKIN:
				return new Talent(WOOD_SKIN, Attribute.DEX, true, ACTION_SIMPLE, 1);
            case WOUND_BALANCE:
				return new Talent(WOUND_BALANCE, Attribute.DEX, true, ACTION_SIMPLE, 1);
            default:
                return new Talent(talentname, null, false, null, 0);
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

