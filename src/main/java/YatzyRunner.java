import cases.*;
import model.Dice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class YatzyRunner {

    private static final Map<String, YatzyCase> yatzyCases;

    static {
        Map<String, YatzyCase> cases = new HashMap<>();
        cases.put("CHANCE", new Chance());
        cases.put("YATZY", new YatzyDice());
        cases.put("ONES", new Ones());
        cases.put("TWOS", new Tows());
        cases.put("THREES", new Threes());
        cases.put("FOURS", new Fours());
        cases.put("FIVES", new Fives());
        cases.put("SIXES", new Sixes());
        yatzyCases = Collections.unmodifiableMap(cases);
    }
    public static int apply(String type, Dice dice) {
        return yatzyCases.get(type).applyYatzy(dice);
    }

}
