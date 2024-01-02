package cases;
import main.YatzyInitializer.Dice;

@FunctionalInterface
public interface YatzyCase {

    int applyYatzy(Dice dice);

}
