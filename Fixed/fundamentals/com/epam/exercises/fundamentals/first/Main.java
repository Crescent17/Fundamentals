package com.epam.exercises.fundamentals.first;

public class Main {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        String number = numberInput.numberInput();
        DigitSumLogic digitSumLogic = new DigitSumLogic();
        boolean result = digitSumLogic.equalityOfNumberDigits(number);
        DigitSumOutput digitSumOutput = new DigitSumOutput();
        digitSumOutput.printInfo(result);
    }
}
