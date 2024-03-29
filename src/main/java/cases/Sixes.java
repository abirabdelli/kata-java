package cases;

import model.Dice;

public class Sixes implements YatzyCase {
    @Override
    public int applyYatzy(Dice dice) {
        int sum = 0;
        for (int at = 0; at < dice.getLength(); at++)
            if (dice.toArray()[at] == 6)
                sum = sum + 6;
        return sum;
    }
}
