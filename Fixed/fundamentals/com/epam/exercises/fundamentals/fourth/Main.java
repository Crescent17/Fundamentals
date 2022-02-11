package com.epam.exercises.fundamentals.fourth;

public class Main {
    public static void main(String[] args) {
        CoordinatesInput coordinatesInput = new CoordinatesInput();
        int x = coordinatesInput.valueOfX();
        int y = coordinatesInput.valueOfY();
        PointLogic pointLogic = new PointLogic();
        boolean inTheArea = pointLogic.isThePointInTheArea(x, y);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(inTheArea);
    }
}
