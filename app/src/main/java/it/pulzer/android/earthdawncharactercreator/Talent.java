package it.pulzer.android.earthdawncharactercreator;

import android.support.annotation.Nullable;

/**
 * Created by thopu on 11.07.17.
 */

public class Talent {
    public static class TalentException extends Exception {
        public TalentException() { super(); }
        public TalentException(String message) { super(message); }
    }

    static final String ACTION_FREE = "Free";
    static final String ACTION_SIMPLE = "Simple";
    static final String ACTION_FOCUS = "Focus";

    public static final String ACROBATIC_DEFENSE = "Acrobatic Defense";
    public static final String DISTRACT = "Distract";
    public static final String FIRST_IMPRESSION = "First Impression";
    public static final String GREAT_LEAP = "Great Leap";
    public static final String HAGGLE = "Haggle";
    public static final String MANEUVER = "Maneuver";
    public static final String NAVIGATION = "Navigation";
    public static final String SPEAK_LANGUAGE = "Speak Language";
    public static final String TAUNT = "Taunt";
    public static final String THROWING_WEAPONS = "Throwing Weapons";
    public static final String AIR_SAILING = "Air Sailing";
    public static final String AVOID_BLOW = "Avoid Blow";
    public static final String CLIMBING = "Climbing";
    public static final String MELEE_WEAPONS = "Melee Weapons";
    public static final String AIR_WEAVING = "Air Weaving";
    public static final String WIND_CATCHER = "Wind Catcher";

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
            default:
                return new Talent(talentname, null, false, null, 0);
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (!(anObject instanceof Talent))return false;
        Talent toCompare = (Talent)anObject;
        if(toCompare.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}