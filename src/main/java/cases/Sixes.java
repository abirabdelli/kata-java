package cases;

import main.YatzyInitializer;

public class Sixes implements YatzyCase {
    @Override
    public int applyYatzy(YatzyInitializer.Dice dice) {
        int sum = 0;
        for (int at = 0; at < dice.getLength(); at++)
            if (dice.toArray()[at] == 6)
                sum = sum + 6;
        return sum;
    }
}
