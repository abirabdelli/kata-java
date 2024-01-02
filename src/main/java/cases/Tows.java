package cases;

import main.YatzyInitializer;

public class Tows implements YatzyCase {

    @Override
    public int applyYatzy(YatzyInitializer.Dice dice) {
        int sum = 0;
        if (dice.d1() == 2) sum += 2;
        if (dice.d2() == 2) sum += 2;
        if (dice.d3() == 2) sum += 2;
        if (dice.d4() == 2) sum += 2;
        if (dice.d5() == 2) sum += 2;
        return sum;
    }
}