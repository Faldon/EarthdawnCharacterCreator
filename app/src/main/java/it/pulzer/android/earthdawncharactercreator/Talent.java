package it.pulzer.android.earthdawncharactercreator;

/**
 * Created by thopu on 11.07.17.
 */

public class Talent {
    public String name;
    public String baseAttribute;
    public boolean discipline;
    public boolean skill;
    public String action;
    public int strain;

    public Talent(String name, String attribute, boolean discipline, boolean skill, String action, int strain) {
        this.name = name;
        this.baseAttribute = attribute;
        this.discipline = discipline;
        this.skill = skill;
        this.action = action;
        this.strain = strain;
    }
}