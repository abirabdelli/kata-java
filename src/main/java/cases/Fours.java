package cases;

import main.YatzyIntializer;

public class Fours implements YatzyDiceCase {
    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (dice.valuesArray()[at] == 4) {
                sum += 4;
            }
        }
        return sum;
    }
}
