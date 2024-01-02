import main.YatzyInitializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestCaseDataProvider {

    public static Map<String, int[]> expectedValuesByType = new HashMap<>();
    public static Map<String, YatzyInitializer.Dice[]> diceCasesByType = new HashMap<>();

    Stream<TestCaseData> provide(String type) throws Exception {
        List<TestCaseData> result = new ArrayList<>();
        if (!expectedValuesByType.isEmpty() && !diceCasesByType.isEmpty() && expectedValuesByType.size() == diceCasesByType.size()) {
            int[] expectedValues = expectedValuesByType.get(type);
            YatzyInitializer.Dice[] diceCases = diceCasesByType.get(type);
            for (int i=0; i<expectedValues.length;i++) {
                TestCaseData testCaseData = new TestCaseData(expectedValues[i],type, diceCases[i]);
                result.add(testCaseData);
            }
            return result.stream();
        } else {
            throw new Exception("Expected results and cases don't match");
        }
    }

    public void init() {

        expectedValuesByType.put("YATZY", new int[]{50,50,0} );
        expectedValuesByType.put("CHANCE", new int[] {15,16});

        diceCasesByType.put("YATZY",new YatzyInitializer.Dice[]{
            new YatzyInitializer.Dice(4, 4, 4, 4, 4),
            new YatzyInitializer.Dice(6, 6, 6, 6, 6),
            new YatzyInitializer.Dice(6, 6, 6, 6, 3)
        });

        diceCasesByType.put("CHANCE",new YatzyInitializer.Dice[]{
            new YatzyInitializer.Dice(2, 3, 4, 5, 1),
            new YatzyInitializer.Dice(3, 3, 4, 5, 1)
        });


    }
}

