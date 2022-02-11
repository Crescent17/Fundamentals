package com.epam.exercises.fundamentals.third;

import com.epam.exercises.fundamentals.second.ResultOutput;

public class Main {
    public static void main(String[] args) {
        TriangleCathetusInput triangleCathetusInput = new TriangleCathetusInput();
        double firstCathetus = triangleCathetusInput.firstCathetusInput();
        double secondCathetus = triangleCathetusInput.secondCathetusInput();
        PerimeterAndSquareLogic perimeterAndSquareLogic = new PerimeterAndSquareLogic();
        double hypotenuse = perimeterAndSquareLogic.hypotenuseLength(firstCathetus, secondCathetus);
        double perimeter = perimeterAndSquareLogic.perimeter(firstCathetus, secondCathetus, hypotenuse);
        double square = perimeterAndSquareLogic.square(firstCathetus, secondCathetus);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(perimeter);
        resultOutput.printResult(square);
    }
}
