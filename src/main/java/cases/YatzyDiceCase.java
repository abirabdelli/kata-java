package cases;
import main.YatzyIntializer.Dice;

@FunctionalInterface
public interface YatzyDiceCase extends YatzyCase{

    int applyYatzy(Dice dice);

}
