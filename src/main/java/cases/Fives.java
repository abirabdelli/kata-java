package cases;

import main.YatzyIntializer;

public class Fives implements YatzyCase {

    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int s = 0;
        int i;
        for (i = 0; i < dice.getLength(); i++)
            if (dice.toArray()[i] == 5)
                s = s + 5;
        return s;
    }
}
