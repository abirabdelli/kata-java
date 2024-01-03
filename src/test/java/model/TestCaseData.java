package model;

import runner.YatzyRunner;

public record TestCaseData(
    int expectedValue,
    YatzyRunner.YatzyCasesEnum type,
    Dice dice
) {
}
