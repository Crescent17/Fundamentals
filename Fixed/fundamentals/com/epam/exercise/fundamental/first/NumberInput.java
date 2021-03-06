package com.epam.exercise.fundamental.first;

import java.util.Scanner;

public class NumberInput {
    @SuppressWarnings("input")
    private final Scanner scanner;

    public NumberInput() {
        this.scanner = new Scanner(System.in);
    }

    public String enterValue() {
        System.out.print("Enter the number: ");
        String value = scanner.next();
        scanner.nextLine();
        return value;
    }
}
