package model;

public record TestCaseData(
    int expectedValue,
    String type,
    Dice dice
) {
}
