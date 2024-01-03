package utils;

import model.Dice;

import java.util.HashMap;
import java.util.Map;

public class TestCaseDataIntializer {


    public static Map<String, int[]> initExpectedResults() {
        Map<String, int[]> expectedValuesByType = new HashMap<>();
        expectedValuesByType.put("YATZY", new int[]{50, 50, 0});
        expectedValuesByType.put("CHANCE", new int[]{15, 16});
        expectedValuesByType.put("ONES", new int[]{1, 2, 0, 4});
        expectedValuesByType.put("TWOS", new int[]{4, 10});
        expectedValuesByType.put("THREES", new int[]{6, 12});
        expectedValuesByType.put("FOURS", new int[]{12, 8, 4});
        expectedValuesByType.put("FIVES", new int[]{10, 15, 20});
        expectedValuesByType.put("SIXES", new int[]{0, 6, 18});
        return expectedValuesByType;


    }

    public static Map<String, Dice[]> initDiceCasesByType() {

        Map<String, Dice[]> diceCasesByType = new HashMap<>();

        diceCasesByType.put("YATZY", new Dice[]{
            new Dice(4, 4, 4, 4, 4),
            new Dice(6, 6, 6, 6, 6),
            new Dice(6, 6, 6, 6, 3)
        });

        diceCasesByType.put("CHANCE", new Dice[]{
            new Dice(2, 3, 4, 5, 1),
            new Dice(3, 3, 4, 5, 1)
        });

        diceCasesByType.put("ONES", new Dice[]{
            new Dice(1, 2, 3, 4, 5),
            new Dice(1, 2, 1, 4, 5),
            new Dice(6, 2, 2, 4, 5),
            new Dice(1, 2, 1, 1, 1)
        });


        diceCasesByType.put("TWOS", new Dice[]{
            new Dice(1, 2, 3, 2, 6),
            new Dice(2, 2, 2, 2, 2)
        });

        diceCasesByType.put("THREES", new Dice[]{
            new Dice(1, 2, 3, 2, 3),
            new Dice(2, 3, 3, 3, 3)
        });

        diceCasesByType.put("FOURS", new Dice[]{
            new Dice(4, 4, 4, 5, 5),
            new Dice(4, 4, 5, 5, 5),
            new Dice(4, 5, 5, 5, 5)
        });

        diceCasesByType.put("FIVES", new Dice[]{
            new Dice(4, 4, 4, 5, 5),
            new Dice(4, 4, 5, 5, 5),
            new Dice(4, 5, 5, 5, 5)
        });

        diceCasesByType.put("SIXES", new Dice[]{
            new Dice(4, 4, 4, 5, 5),
            new Dice(4, 4, 6, 5, 5),
            new Dice(6, 5, 6, 6, 5)
        });

        return diceCasesByType;

    }
}
