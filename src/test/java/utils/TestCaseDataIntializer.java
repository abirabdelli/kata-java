package utils;

import model.Dice;
import runner.YatzyRunner;

import java.util.EnumMap;
import java.util.Map;

public class TestCaseDataIntializer {


    public static EnumMap<YatzyRunner.YatzyCasesEnum, int[]> initExpectedResults() {
        return new EnumMap<>(Map.of(
            YatzyRunner.YatzyCasesEnum.YATZY, new int[]{50, 50, 0},
            YatzyRunner.YatzyCasesEnum.CHANCE, new int[]{15, 16},
            YatzyRunner.YatzyCasesEnum.ONES, new int[]{1, 2, 0, 4},
            YatzyRunner.YatzyCasesEnum.TWOS, new int[]{4, 10},
            YatzyRunner.YatzyCasesEnum.THREES, new int[]{6, 12},
            YatzyRunner.YatzyCasesEnum.FOURS, new int[]{12, 8, 4},
            YatzyRunner.YatzyCasesEnum.FIVES, new int[]{10, 15, 20},
            YatzyRunner.YatzyCasesEnum.SIXES, new int[]{0, 6, 18}));

    }

    public static EnumMap<YatzyRunner.YatzyCasesEnum, Dice[]> initDiceCasesByType() {

        return new EnumMap<>(Map.of(

            YatzyRunner.YatzyCasesEnum.YATZY, new Dice[]{
                new Dice(4, 4, 4, 4, 4),
                new Dice(6, 6, 6, 6, 6),
                new Dice(6, 6, 6, 6, 3)
            }

            , YatzyRunner.YatzyCasesEnum.CHANCE, new Dice[]{
                new Dice(2, 3, 4, 5, 1),
                new Dice(3, 3, 4, 5, 1)
            }

            , YatzyRunner.YatzyCasesEnum.ONES, new Dice[]{
                new Dice(1, 2, 3, 4, 5),
                new Dice(1, 2, 1, 4, 5),
                new Dice(6, 2, 2, 4, 5),
                new Dice(1, 2, 1, 1, 1)
            }


            , YatzyRunner.YatzyCasesEnum.TWOS, new Dice[]{
                new Dice(1, 2, 3, 2, 6),
                new Dice(2, 2, 2, 2, 2)
            }

            , YatzyRunner.YatzyCasesEnum.THREES, new Dice[]{
                new Dice(1, 2, 3, 2, 3),
                new Dice(2, 3, 3, 3, 3)
            }

            , YatzyRunner.YatzyCasesEnum.FOURS, new Dice[]{
                new Dice(4, 4, 4, 5, 5),
                new Dice(4, 4, 5, 5, 5),
                new Dice(4, 5, 5, 5, 5)
            }

            , YatzyRunner.YatzyCasesEnum.FIVES, new Dice[]{
                new Dice(4, 4, 4, 5, 5),
                new Dice(4, 4, 5, 5, 5),
                new Dice(4, 5, 5, 5, 5)
            }

            , YatzyRunner.YatzyCasesEnum.SIXES, new Dice[]{
                new Dice(4, 4, 4, 5, 5),
                new Dice(4, 4, 6, 5, 5),
                new Dice(6, 5, 6, 6, 5)
            }));

    }
}
