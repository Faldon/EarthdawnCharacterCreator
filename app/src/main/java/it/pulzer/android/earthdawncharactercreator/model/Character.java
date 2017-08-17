package it.pulzer.android.earthdawncharactercreator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline.DiscipleTalent;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;

/**
 * Created by faldon on 11.07.17.
 */

public class Character {
    private BaseRace race;
    private BaseDiscipline discipline;
    private int circle;
    private int currentLP;
    private int totalLP;
    private HashMap<DiscipleTalent, Integer> trainedTalents;

    private String name;

    public Character(BaseRace race, BaseDiscipline discipline) {
        this.race = race;
        this.discipline = discipline;
        trainedTalents = new HashMap<>();
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

    public void advanceCircle() {
        this.circle = this.circle + 1;
        Iterator<DiscipleTalent> iter = discipline.getAvailableTalents(circle).iterator();
        while(iter.hasNext()) {
            DiscipleTalent t = iter.next();
            if(t.isDiscipline()) {
                trainedTalents.put(t, 1);
            }
        }
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

    public int getTalentRank(DiscipleTalent t) {
        if(trainedTalents.containsKey(t)) {
            return trainedTalents.get(t);
        }
        return 0;
    }

    public void improveTalentRank(DiscipleTalent t) {
        int currentRank = 1;
        if(trainedTalents.containsKey(t)) {
            currentRank += trainedTalents.get(t);
        }
        trainedTalents.put(t, currentRank);
    }

    public void reduceTalentRank(DiscipleTalent t) {
        if(trainedTalents.containsKey(t)) {
            trainedTalents.put(t, trainedTalents.get(t)-1);
        }
    }

    public boolean hasTalentTrained(DiscipleTalent t) {
        return trainedTalents.containsKey(t);
    }

    public ArrayList<DiscipleTalent> getTrainedTalents() {
        return new ArrayList<>(trainedTalents.keySet());
    }

    public boolean canAdvanceCircle() {
        for(DiscipleTalent dt : discipline.getAvailableTalents(circle)) {
            if(dt.isDiscipline() && (!hasTalentTrained(dt) || getTalentRank(dt) <= circle)) {
                return false;
            }
        }
        return true;
    }
}
