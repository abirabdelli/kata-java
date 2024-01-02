package cases;

import main.YatzyIntializer;

public class Tows implements YatzyDiceCase {

    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int sum = 0;
        if (dice.d1() == 2) sum += 2;
        if (dice.d2() == 2) sum += 2;
        if (dice.d3() == 2) sum += 2;
        if (dice.d4() == 2) sum += 2;
        if (dice.d5() == 2) sum += 2;
        return sum;
    }
}