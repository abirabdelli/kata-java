package cases;

import main.YatzyIntializer;

public class Fives implements YatzyDiceCase {

    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int s = 0;
        int i;
        for (i = 0; i < dice.length(); i++)
            if (dice.valuesArray()[i] == 5)
                s = s + 5;
        return s;
    }
}
