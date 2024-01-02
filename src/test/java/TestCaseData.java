import main.YatzyIntializer;

public record TestCaseData (
    int expectedValue,
    String type,
    YatzyIntializer.Dice dice
) {}
