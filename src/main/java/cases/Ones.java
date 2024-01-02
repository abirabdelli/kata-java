package cases;

import main.YatzyIntializer;

public class Ones implements YatzyDiceCase {

    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int sum = 0;
        if (dice.d1() == 1) sum++;
        if (dice.d2() == 1) sum++;
        if (dice.d3() == 1) sum++;
        if (dice.d4() == 1) sum++;
        if (dice.d5() == 1)
            sum++;

        return sum;
    }
}
