package runner;

import model.TestCaseData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import utils.TestCaseDataProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyRunnerTest {


    @BeforeAll
    public static void setup() {

        TestCaseDataProvider.init();

    }


    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#chanceCaseDataProvider")
    void test_chance_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#yatzyCaseDataProvider")
    void test_yatzy_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }


    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#onesCaseDataProvider")
    void test_ones_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#twosCaseDataProvider")
    public void test_twos_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);

    }


    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#threesCaseDataProvider")
    public void test_threes_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#foursCaseDataProvider")
    public void test_fours_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#fivesCaseDataProvider")
    public void test_fives_case(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    @ParameterizedTest
    @MethodSource("utils.TestCaseDataProvider#sixesCaseDataProvider")
    public void sixes_test(TestCaseData testCaseData) {
        verifyTestCase(testCaseData);
    }

    /*
        @Test
        public void one_pair() {
            assertEquals(6, YatzyIntializer.score_pair(3,4,3,5,6));
            assertEquals(10, YatzyIntializer.score_pair(5,3,3,3,5));
            assertEquals(12, YatzyIntializer.score_pair(5,3,6,6,5));
        }

        @Test
        public void two_Pair() {
            assertEquals(16, YatzyIntializer.two_pair(3,3,5,4,5));
            assertEquals(16, YatzyIntializer.two_pair(3,3,5,5,5));
        }

        @Test
        public void three_of_a_kind()
        {
            assertEquals(9, YatzyIntializer.three_of_a_kind(3,3,3,4,5));
            assertEquals(15, YatzyIntializer.three_of_a_kind(5,3,5,4,5));
            assertEquals(9, YatzyIntializer.three_of_a_kind(3,3,3,3,5));
        }

        @Test
        public void four_of_a_knd() {
            assertEquals(12, YatzyIntializer.four_of_a_kind(3,3,3,3,5));
            assertEquals(20, YatzyIntializer.four_of_a_kind(5,5,5,4,5));
            assertEquals(9, YatzyIntializer.three_of_a_kind(3,3,3,3,3));
        }

        @Test
        public void smallStraight() {
            assertEquals(15, YatzyIntializer.smallStraight(1,2,3,4,5));
            assertEquals(15, YatzyIntializer.smallStraight(2,3,4,5,1));
            assertEquals(0, YatzyIntializer.smallStraight(1,2,2,4,5));
        }

        @Test
        public void largeStraight() {
            assertEquals(20, YatzyIntializer.largeStraight(6,2,3,4,5));
            assertEquals(20, YatzyIntializer.largeStraight(2,3,4,5,6));
            assertEquals(0, YatzyIntializer.largeStraight(1,2,2,4,5));
        }

        @Test
        public void fullHouse() {
            assertEquals(18, YatzyIntializer.fullHouse(6,2,2,2,6));
            assertEquals(0, YatzyIntializer.fullHouse(2,3,4,5,6));
        }*/
    private static void verifyTestCase(TestCaseData testCaseData) {
        assertEquals(testCaseData.expectedValue(), YatzyRunner.apply(testCaseData.type(), testCaseData.dice()));
    }
}
