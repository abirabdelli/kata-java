package cases;
import model.Dice;

public class YatzyDice implements YatzyCase {
    @Override
    public int applyYatzy(Dice dice) {
        int[] counts = new int[6];
        for (int diceValue: dice.toArray())
            counts[diceValue-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }
}
