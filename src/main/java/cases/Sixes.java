package cases;

import main.YatzyIntializer;

public class Sixes implements YatzyDiceCase {
    @Override
    public int applyYatzy(YatzyIntializer.Dice dice) {
        int sum = 0;
        for (int at = 0; at < dice.getLength(); at++)
            if (dice.toArray()[at] == 6)
                sum = sum + 6;
        return sum;
    }
}
