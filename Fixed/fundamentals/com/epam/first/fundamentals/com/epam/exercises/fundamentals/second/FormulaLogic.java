package com.epam.exercises.fundamentals.second;

public class FormulaLogic {
    public double formula(int a, int b, int c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
