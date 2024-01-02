import main.YatzyInitializer;

public record TestCaseData (
    int expectedValue,
    String type,
    YatzyInitializer.Dice dice
) {}
