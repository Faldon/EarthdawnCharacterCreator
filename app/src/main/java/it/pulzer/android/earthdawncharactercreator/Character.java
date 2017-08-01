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

    private String name;

    public Character(BaseRace race, BaseDiscipline discipline) {
        this.race = race;
        this.discipline = discipline;
        trainedTalents = new HashSet<>();
    }

    public Character(String name, BaseRace race, BaseDiscipline discipline) {
        this(race, discipline);
        this.name = name;
    }

    public BaseRace getRace() {
        return race;
    }

    public BaseDiscipline getDiscipline() {
        return discipline;
    }

    public int getCircle() {
        return this.circle;
    }

    public boolean advanceCircle() {
        this.circle = this.circle + 1;
        return true;
    }

    public int getInitiative() {
        return race.getInitiative() + discipline.getInitiativeModification(circle);
    }

    public int getMovementRate() {
        return race.getMovementRate("Base");
    }

    public int getWoundThreshold() {
        return race.getWoundThreshold();
    }

    public int getUnconsciousThreshold() {
        return race.getUnconsciousThreshold() + discipline.getUnconsciousModification(circle);
    }

    public int getDeathThreshold() {
        return race.getDeathThreshold() + discipline.getDeathModification(circle);
    }

    public int getRecoveryCount() {
        return race.getRecoveryCount() + discipline.getRecoveryCountModification(circle);
    }

    public int getPhysicalDefense() {
        return race.getPhysicalDefenseRate() + discipline.getPhysicalDefenseModification(circle);
    }

    public int getMysticalDefense() {
        return race.getMysticalDefenseRate() + discipline.getMysticalDefenseModification(circle);
    }

    public int getSocialDefense() {
        return race.getSocialDefenseRate() + discipline.getSocialDefenseModification(circle);
    }

    public int getPhysicalArmor() {
        return race.getPhysicalArmor() + discipline.getPhysicalArmorModification(circle);
    }

    public int getMysticalArmor() {
        return race.getMysticalArmor() + discipline.getMysticalArmorModification(circle);
    }

    public int getCarryCapacity() {
        return race.getCarryCapacity();
    }

    public int getLiftingLimit() {
        return race.getLiftingLimit();
    }

    public String getName() {
        return  name;
    }
}
