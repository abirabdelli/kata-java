package cases;

import model.Dice;

public class Threes implements YatzyCase {

    @Override
    public int applyYatzy(Dice dice) {
        int sum;
        sum = 0;
        if (dice.d1() == 3) sum += 3;
        if (dice.d2() == 3) sum += 3;
        if (dice.d3() == 3) sum += 3;
        if (dice.d4() == 3) sum += 3;
        if (dice.d5() == 3) sum += 3;
        return sum;
    }
}
