package utils;

import model.Dice;
import model.TestCaseData;
import runner.YatzyRunner;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Stream;

public class TestCaseDataProvider {

    public static EnumMap<YatzyRunner.YatzyCasesEnum, int[]> expectedValuesByType;
    public static EnumMap<YatzyRunner.YatzyCasesEnum, Dice[]> diceCasesByType;

    public static Stream<TestCaseData> provide(YatzyRunner.YatzyCasesEnum type) throws Exception {
        List<TestCaseData> result = new ArrayList<>();
        if (!expectedValuesByType.isEmpty() && !diceCasesByType.isEmpty() && expectedValuesByType.size() == diceCasesByType.size()) {
            int[] expectedValues = expectedValuesByType.get(type);
            Dice[] diceCases = diceCasesByType.get(type);
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
        return provide(YatzyRunner.YatzyCasesEnum.CHANCE);
    }

    static Stream<TestCaseData> yatzyCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.YATZY);
    }


    static Stream<TestCaseData> onesCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.ONES);
    }

    static Stream<TestCaseData> twosCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.TWOS);
    }

    static Stream<TestCaseData> threesCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.THREES);
    }

    static Stream<TestCaseData> foursCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.FOURS);
    }

    static Stream<TestCaseData> fivesCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.FIVES);
    }

    static Stream<TestCaseData> sixesCaseDataProvider() throws Exception {
        return provide(YatzyRunner.YatzyCasesEnum.SIXES);
    }

    public static void init() {
        expectedValuesByType = TestCaseDataIntializer.initExpectedResults();
        diceCasesByType = TestCaseDataIntializer.initDiceCasesByType();
    }
}

