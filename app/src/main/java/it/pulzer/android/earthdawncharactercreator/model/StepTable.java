package it.pulzer.android.earthdawncharactercreator.model;

import org.jetbrains.annotations.Contract;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by thopu on 28.06.17.
 */

public final class StepTable {

    private StepTable() {};

    /**
     * Get the action dice to roll for a difficulty step
     * @param step The difficulty step to role a dice for
     * @return The needed action dice(s)
     */
    @Contract(pure = true)
    public static String GetActionDice(int step) {
        String dice = "";
        switch(step) {
            case 1:
                dice = "W4-2";
                break;
            case 2:
                dice = "W4-1";
                break;
            case 3:
                dice = "W4";
                break;
            case 4:
                dice = "W6";
                break;
            case 5:
                dice = "W8";
                break;
            case 6:
                dice = "W10";
                break;
            case 7:
                dice = "W12";
                break;
            case 8:
                dice = "2W6";
                break;
            case 9:
                dice = "W8+W6";
                break;
            case 10:
                dice = "2W8";
                break;
            case 11:
                dice = "W10+W8";
                break;
            case 12:
                dice = "2W10";
                break;
            case 13:
                dice = "W12+W10";
                break;
            case 14:
                dice = "2W12";
                break;
            case 15:
                dice = "W12+W6";
                break;
            case 16:
                dice = "W12+W8+W6";
                break;
            case 17:
                dice = "W12+2W8";
                break;
            case 18:
                dice = "W12+W10+W8";
                break;
            case 19:
                dice = "W20+2W6";
                break;
            case 20:
                dice = "W20+W8+W6";
                break;
            case 21:
                dice = "W20+2W8";
                break;
            case 22:
                dice = "W20+W10+W8";
                break;
            case 23:
                dice = "W20+2W10";
                break;
            case 24:
                dice = "W20+W12+W10";
                break;
            case 25:
                dice = "W20+2W12";
                break;
            case 26:
                dice = "W20+W12+2W6";
                break;
            case 27:
                dice = "W20+W12+W8+W6";
                break;
            case 28:
                dice = "W20+W12+2W8";
                break;
            case 29:
                dice = "W20+W12+W10+W8";
                break;
            case 30:
                dice = "2W20+2W6";
                break;
            case 31:
                dice = "2W20+W8+W6";
                break;
            case 32:
                dice = "2W20+2W8";
                break;
            case 33:
                dice = "2W20+W10+W8";
                break;
            case 34:
                dice = "2W20+2W10";
                break;
            case 35:
                dice = "2W20+W12+W10";
                break;
            case 36:
                dice = "2W20+2W12";
                break;
            case 37:
                dice = "2W20+W12+2W6";
                break;
            case 38:
                dice = "2W20+W12+W8+W6";
                break;
            case 39:
                dice = "2W20+W12+2W8";
                break;
            case 40:
                dice = "2W20+W12+W10+W8";
                break;
            default :
        }
        return dice;
    }

    /**
     * Get the action dice data for rolling the result of an action test
     * @param step The difficulty step to role the test for
     * @return A map of dices to roll. Maps dice side to dice count, except side 0 which maps to result modification
     */
    public static Map<Integer, Integer> GetRequiredDiceData(int step) {
        HashMap<Integer, Integer> dices = new HashMap<Integer, Integer>() {
            {
                put(0, 0);
                put(4, 0);
                put(6, 0);
                put(8, 0);
                put(10, 0);
                put(12, 0);
                put(20, 0);
            }
        };
        switch(step) {
            case 1:
                dices.put(4, 1);
                dices.put(0, -2);
                break;
            case 2:
                dices.put(4, 1);
                dices.put(0, -1);
                break;
            case 3:
                dices.put(4, 1);
                break;
            case 4:
                dices.put(6, 1);
                break;
            case 5:
                dices.put(8, 1);
                break;
            case 6:
                dices.put(10, 1);
                break;
            case 7:
                dices.put(12, 1);
                break;
            case 8:
                dices.put(6, 2);
                break;
            case 9:
                dices.put(6, 1);
                dices.put(8, 1);
                break;
            case 10:
                dices.put(8, 2);
                break;
            case 11:
                dices.put(8, 1);
                dices.put(10, 1);
                break;
            case 12:
                dices.put(10, 2);
                break;
            case 13:
                dices.put(10, 1);
                dices.put(12, 1);
                break;
            case 14:
                dices.put(12, 2);
                break;
            case 15:
                dices.put(6, 1);
                dices.put(12, 1);
                break;
            case 16:
                dices.put(6, 1);
                dices.put(8, 1);
                dices.put(12, 1);
                break;
            case 17:
                dices.put(8, 2);
                dices.put(12, 1);
                break;
            case 18:
                dices.put(8, 1);
                dices.put(10, 1);
                dices.put(12, 1);
                break;
            case 19:
                dices.put(6, 2);
                dices.put(20, 1);
                break;
            case 20:
                dices.put(6, 1);
                dices.put(8, 1);
                dices.put(20, 1);
                break;
            case 21:
                dices.put(8, 2);
                dices.put(20, 1);
                break;
            case 22:
                dices.put(8, 1);
                dices.put(10, 1);
                dices.put(20, 1);
                break;
            case 23:
                dices.put(10, 2);
                dices.put(20, 1);
                break;
            case 24:
                dices.put(10, 1);
                dices.put(12, 1);
                dices.put(20, 1);
                break;
            case 25:
                dices.put(12, 2);
                dices.put(20, 1);
                break;
            case 26:
                dices.put(6, 2);
                dices.put(12, 1);
                dices.put(20, 1);
                break;
            case 27:
                dices.put(6, 1);
                dices.put(8, 1);
                dices.put(12, 1);
                dices.put(20, 1);
                break;
            case 28:
                dices.put(8, 2);
                dices.put(12, 1);
                dices.put(20, 1);
                break;
            case 29:
                dices.put(8, 1);
                dices.put(10, 1);
                dices.put(12, 1);
                dices.put(20, 1);
                break;
            case 30:
                dices.put(6, 2);
                dices.put(20, 2);
                break;
            case 31:
                dices.put(6, 1);
                dices.put(8, 1);
                dices.put(20, 2);
                break;
            case 32:
                dices.put(8, 2);
                dices.put(20, 2);
                break;
            case 33:
                dices.put(8, 1);
                dices.put(10, 1);
                dices.put(20, 2);
                break;
            case 34:
                dices.put(10, 2);
                dices.put(20, 2);
                break;
            case 35:
                dices.put(10, 1);
                dices.put(12, 1);
                dices.put(20, 2);
                break;
            case 36:
                dices.put(12, 2);
                dices.put(20, 2);
                break;
            case 37:
                dices.put(6, 2);
                dices.put(12, 1);
                dices.put(20, 2);
                break;
            case 38:
                dices.put(6, 1);
                dices.put(8, 1);
                dices.put(12, 1);
                dices.put(20, 2);
                break;
            case 39:
                dices.put(8, 2);
                dices.put(12, 1);
                dices.put(20, 2);
                break;
            case 40:
                dices.put(8, 1);
                dices.put(10, 1);
                dices.put(12, 1);
                dices.put(20, 2);
                break;
            default :
        }
        return dices;
    }

    /**
     * Roll a dice
     * @param sides The total count of sides or eyes of rhe dice to roll
     * @return The random result
     */
    public static int RollDice(int sides) {
        return (int)(Math.random() * sides + 1);
    }

}