package cases;

import main.YatzyIntializer;

public class Fours implements YatzyCase {
    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (dice.toArray()[at] == 4) {
                sum += 4;
            }
        }
        return sum;
    }
}
