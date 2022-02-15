package com.epam.exercise.fundamental.second;

public class FormulaLogic {
    public double formula(int a, int b, int c) {
        if (a == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
