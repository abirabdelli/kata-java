package cases;


import model.Dice;

public class Ones implements YatzyCase {

    @Override
    public int applyYatzy(Dice dice) {
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
