package com.epam.exercise.fundamental.second;

public class Main {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        int a = numberInput.enterValue();
        int b = numberInput.enterValue();
        int c = numberInput.enterValue();
        FormulaLogic formulaLogic = new FormulaLogic();
        double result = formulaLogic.formula(a, b, c);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(result);
    }
}
