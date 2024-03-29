package cases;

import model.Dice;

public class Fives implements YatzyCase {

    @Override
    public int applyYatzy(Dice dice) {
        int sum = 0;
        int i;
        for (i = 0; i < dice.getLength(); i++)
            if (dice.toArray()[i] == 5)
                sum = sum + 5;
        return sum;
    }
}
