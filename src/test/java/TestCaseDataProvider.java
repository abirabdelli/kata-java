import main.YatzyInitializer;
import utils.TestCaseDataIntializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestCaseDataProvider {

    public static Map<String, int[]> expectedValuesByType = new HashMap<>();
    public static Map<String, YatzyInitializer.Dice[]> diceCasesByType = new HashMap<>();

    private static Stream<TestCaseData> provide(String type) throws Exception {
        List<TestCaseData> result = new ArrayList<>();
        if (!expectedValuesByType.isEmpty() && !diceCasesByType.isEmpty() && expectedValuesByType.size() == diceCasesByType.size()) {
            int[] expectedValues = expectedValuesByType.get(type);
            YatzyInitializer.Dice[] diceCases = diceCasesByType.get(type);
            for (int i = 0; i < expectedValues.length; i++) {
                TestCaseData testCaseData = new TestCaseData(expectedValues[i], type, diceCases[i]);
                result.add(testCaseData);
            }
            return result.stream();
        } else {
            throw new Exception("Expected results and cases don't match");
        }
    }


    static Stream<TestCaseData> chanceCaseDataProvider() throws Exception {
        return provide("CHANCE");
    }

    static Stream<TestCaseData> yatzyCaseDataProvider() throws Exception {
        return provide("YATZY");
    }


    static Stream<TestCaseData> onesCaseDataProvider() throws Exception {
        return provide("ONES");
    }

    static Stream<TestCaseData> twosCaseDataProvider() throws Exception {
        return provide("TWOS");
    }

    static Stream<TestCaseData> threesCaseDataProvider() throws Exception {
        return provide("THREES");
    }

    static Stream<TestCaseData> foursCaseDataProvider() throws Exception {
        return provide("FOURS");
    }

    static Stream<TestCaseData> fivesCaseDataProvider() throws Exception {
        return provide("FIVES");
    }

    static Stream<TestCaseData> sixesCaseDataProvider() throws Exception {
        return provide("SIXES");
    }

    public static void init() {
        expectedValuesByType = TestCaseDataIntializer.initExpectedResults();
        diceCasesByType = TestCaseDataIntializer.initDiceCasesByType();
    }
}

