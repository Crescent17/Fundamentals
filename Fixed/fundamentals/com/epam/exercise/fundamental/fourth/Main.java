package com.epam.exercise.fundamental.fourth;

public class Main {
    public static void main(String[] args) {
        CoordinatesInput coordinatesInput = new CoordinatesInput();
        int x = coordinatesInput.enterValue();
        int y = coordinatesInput.enterValue();
        PointLogic pointLogic = new PointLogic();
        boolean inTheArea = pointLogic.isThePointInTheArea(x, y);
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(inTheArea);
    }
}
