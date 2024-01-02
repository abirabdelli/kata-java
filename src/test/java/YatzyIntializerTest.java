import main.YatzyIntializer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyIntializerTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = YatzyIntializer.apply("CHANCE", new YatzyIntializer.Dice(2, 3, 4, 5, 1));
        assertEquals(expected, actual);
        assertEquals(16, YatzyIntializer.apply("CHANCE", new YatzyIntializer.Dice(3, 3, 4, 5, 1)));
    }

    @ParameterizedTest(name = "{index} => expectedValues={0}, d1={1}, d1={1}, d2={2}, d3={3},d4={4},d5={5}, type= {6}")
    @MethodSource("yatzyCaseDataProvider")
    void test_yatzy_case(TestCaseData testCaseData) {
        assertEquals(testCaseData.expectedValue(), YatzyIntializer.apply(testCaseData.type(), testCaseData.dice()));
    }

    private static Stream<TestCaseData> yatzyCaseDataProvider() {
        return Stream.of(
            new TestCaseData(50, "YATZY", new YatzyIntializer.Dice(4, 4, 4, 4, 4)),
            new TestCaseData(50, "YATZY", new YatzyIntializer.Dice(6, 6, 6, 6, 6)),
            new TestCaseData(0, "YATZY", new YatzyIntializer.Dice(6, 6, 6, 6, 3))
        );
    }

 /*   @Test public void test_1s() {
        assertTrue(YatzyIntializer.apply("ONES",1,2,3,4,5) == 1);
        assertEquals(2, YatzyIntializer.apply("ONES",1,2,1,4,5));
        assertEquals(0, YatzyIntializer.apply("ONES",6,2,2,4,5));
        assertEquals(4, YatzyIntializer.apply("ONES",1,2,1,1,1));
    }

    @Test
    public void test_2s() {
        assertEquals(4, YatzyIntializer.apply("TWOS",1,2,3,2,6));
        assertEquals(10, YatzyIntializer.apply("TWOS",2,2,2,2,2));
    }

    @Test
    public void test_threes() {
        assertEquals(6, YatzyIntializer.apply("THREES",1,2,3,2,3));
        assertEquals(12, YatzyIntializer.apply("THREES",2,3,3,3,3));
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, YatzyIntializer.apply("FOURS",4,4,4,5,5));
        assertEquals(8, YatzyIntializer.apply("FOURS",4,4,5,5,5));
        assertEquals(4, YatzyIntializer.apply("FOURS",4,5,5,5,5));
    }

    @Test
    public void fives() {
        assertEquals(10, YatzyIntializer.apply("FIVES",4,4,4,5,5));
        assertEquals(15, YatzyIntializer.apply("FIVES",4,4,5,5,5));
        assertEquals(20, YatzyIntializer.apply("FIVES",4,5,5,5,5));
    }

    @Test
    public void sixes_test() {
        assertEquals(0, YatzyIntializer.apply("SIXES",4,4,4,5,5));
        assertEquals(6, YatzyIntializer.apply("SIXES",4,4,6,5,5));
        assertEquals(18, YatzyIntializer.apply("SIXES",6,5,6,6,5));
    }

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
}
