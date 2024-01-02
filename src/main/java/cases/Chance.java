package cases;
import main.YatzyIntializer.Dice;

public class Chance implements YatzyCase {
    @Override
    public int applyYatzy(Dice dice) {
        int total = 0;
        total += dice.d1();
        total += dice.d2();
        total += dice.d3();
        total += dice.d4();
        total += dice.d5();
        return total;
    }
}
