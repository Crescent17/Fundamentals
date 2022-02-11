package com.epam.exercises.fundamentals.second;

public class Main {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        int a = numberInput.firstNumberInput();
        int b = numberInput.secondNumberInput();
        int c = numberInput.thirdNumberInput();
        FormulaLogic formulaLogic = new FormulaLogic();
        double result = formulaLogic.formula(a, b, c);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(result);
    }
}
