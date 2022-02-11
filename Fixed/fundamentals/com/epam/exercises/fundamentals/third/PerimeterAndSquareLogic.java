package com.epam.exercises.fundamentals.third;

public class PerimeterAndSquareLogic {
    public double hypotenuseLength(double firstCathetusLength, double secondCathetusLength) {
        return Math.sqrt(Math.pow(firstCathetusLength, 2) + Math.pow(secondCathetusLength, 2));
    }

    public double perimeter(double firstCathetusLength, double secondCathetusLength, double hypotenuseLength) {
        return firstCathetusLength + secondCathetusLength + hypotenuseLength;
    }

    public double square(double firstCathetusLength, double secondCathetusLength) {
        return firstCathetusLength * secondCathetusLength / 2;
    }
}
