package cases;

import main.YatzyInitializer;

public class Threes implements YatzyCase {

    @Override
    public int applyYatzy(YatzyInitializer.Dice dice) {
        int s;
        s = 0;
        if (dice.d1() == 3) s += 3;
        if (dice.d2() == 3) s += 3;
        if (dice.d3() == 3) s += 3;
        if (dice.d4() == 3) s += 3;
        if (dice.d5() == 3) s += 3;
        return s;
    }
}
