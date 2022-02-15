package com.epam.exercises.fundamentals.first;

import java.util.Scanner;

public class NumberInput {
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
