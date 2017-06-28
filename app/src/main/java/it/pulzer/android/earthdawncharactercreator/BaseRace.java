package it.pulzer.android.earthdawncharactercreator;

/**
 * Created by thopu on 28.06.17.
 */

abstract class BaseRace {
    protected class Attribute {
        public final static String DEXTERITY = "Dexterity";
        public final static String STRENGTH = "Strength";
        public String name;
        public int minValue;
        public int maxValue;
        public int currentValue;
        public int raisesLeft;

        public Attribute(String name) {
            this.name = name;
            minValue = 0;
            maxValue = Integer.MAX_VALUE;
            currentValue = 0;
            raisesLeft = 3;
        }

        public Attribute(String name, int minimum) {
            new Attribute(name);
            minValue = minimum;
        }

        public Attribute(String name, int minimum, int maximum) {
            new Attribute(name, minimum);
            maxValue = maximum;
        }
    }
    protected Attribute dexterity = new Attribute(Attribute.DEXTERITY);
    protected int strength;
    protected int toughness;
    protected int perception;
    protected int willpower;
    protected int charisma;
}
