package cases;
import main.YatzyIntializer.Dice;

public class YatzyDice implements YatzyDiceCase {
    @Override
    public int applyYatzy(Dice dice) {
        int[] counts = new int[6];
        for (int die : dice.valuesArray())
            counts[die-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }
}
