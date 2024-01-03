package runner;

import cases.*;
import model.Dice;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class YatzyRunner {

    public enum YatzyCasesEnum {
        YATZY,
        CHANCE,
        ONES,
        TWOS,
        THREES,
        FOURS,
        FIVES,
        SIXES
    }

    private static final Map<YatzyCasesEnum, YatzyCase> yatzyCases;

    static {
        EnumMap<YatzyCasesEnum, YatzyCase> cases = new EnumMap<>(Map.of(
            YatzyCasesEnum.CHANCE, new Chance(),
            YatzyCasesEnum.YATZY, new YatzyDice(),
            YatzyCasesEnum.ONES, new Ones(),
            YatzyCasesEnum.TWOS, new Tows(),
            YatzyCasesEnum.THREES, new Threes(),
            YatzyCasesEnum.FOURS, new Fours(),
            YatzyCasesEnum.FIVES, new Fives(),
            YatzyCasesEnum.SIXES, new Sixes()));
        yatzyCases = Collections.unmodifiableMap(cases);
    }

    public static int apply(YatzyCasesEnum type, Dice dice) {
        return yatzyCases.get(type).applyYatzy(dice);
    }

}
