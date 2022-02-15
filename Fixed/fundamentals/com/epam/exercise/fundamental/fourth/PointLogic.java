package com.epam.exercise.fundamental.fourth;

public class PointLogic {
    public boolean isThePointInTheArea(int x, int y) {
        if ((x >= -4 && x <= -2 && y <= 0) || (x >= -2 && x <= 2 && y >= -3 && y <= 4) || (x >= 2 && x <= 4 && y <= 0)) {
            return true;
        }
        return false;
    }
}
