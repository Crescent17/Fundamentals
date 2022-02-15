package com.epam.exercise.fundamental.third;

public class Main {
    public static void main(String[] args) {
        TriangleCathetusInput triangleCathetusInput = new TriangleCathetusInput();
        double firstCathetus = triangleCathetusInput.cathetusInput();
        double secondCathetus = triangleCathetusInput.cathetusInput();
        PerimeterAndSquareLogic perimeterAndSquareLogic = new PerimeterAndSquareLogic();
        double hypotenuse = perimeterAndSquareLogic.hypotenuseLength(firstCathetus, secondCathetus);
        double perimeter = perimeterAndSquareLogic.perimeter(firstCathetus, secondCathetus, hypotenuse);
        double square = perimeterAndSquareLogic.square(firstCathetus, secondCathetus);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(perimeter);
        resultOutput.printResult(square);
    }
}
