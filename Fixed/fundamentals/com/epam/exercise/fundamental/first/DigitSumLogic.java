package com.epam.exercise.fundamental.first;

public class DigitSumLogic {
    public boolean equalityOfNumberDigits(String number) {
        if (number.length() != 4 || Integer.parseInt(number) < 0) {
            throw new IllegalStateException("Wrong number format");
        }
        return (Integer.parseInt(number.substring(0, 1)) + (Integer.parseInt(number.substring(1, 2)))) ==
                (Integer.parseInt(number.substring(2, 3))) + (Integer.parseInt(number.substring(3, 4)));
    }
}
