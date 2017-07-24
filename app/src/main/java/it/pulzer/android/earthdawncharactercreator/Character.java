package it.pulzer.android.earthdawncharactercreator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.races.*;

/**
 * Created by faldon on 11.07.17.
 */

public class Character {
    private BaseRace race;
    private BaseDiscipline discipline;
    private int circle;
    private int currentLP;
    private int totalLP;
    private Set<Map<Talent, Integer>> trainedTalents;

    public Character(BaseRace race, BaseDiscipline discipline) {
        this.race = race;
        this.discipline = discipline;
        trainedTalents = new HashSet<>();
    }

    public BaseRace getRace() {
        return race;
    }

    public BaseDiscipline getDiscipline() {
        return discipline;
    }

    public String getCurrentProperties() {
        String output = "DEX\tSTR\tTOU\tPER\tWIL\tCHA\n";
        try {
            output += String.valueOf(race.getAttribute(Attribute.DEX).currentValue) + "\t";
            output += String.valueOf(race.getAttribute(Attribute.STR).currentValue) + "\t";
            output += String.valueOf(race.getAttribute(Attribute.TOU).currentValue) + "\t";
            output += String.valueOf(race.getAttribute(Attribute.PER).currentValue) + "\t";
            output += String.valueOf(race.getAttribute(Attribute.WIL).currentValue) + "\t";
            output += String.valueOf(race.getAttribute(Attribute.CHA).currentValue);
        } catch (Exception e) {
            output += "\n" + e.getMessage();
        }
        return output;
    }
}
