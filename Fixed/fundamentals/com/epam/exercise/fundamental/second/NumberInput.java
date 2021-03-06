package com.epam.exercise.fundamental.second;

import java.util.Scanner;

public class NumberInput {
    @SuppressWarnings("resource")
    private final Scanner scanner;

    public NumberInput() {
        this.scanner = new Scanner(System.in);
    }

    public int enterValue() {
        System.out.print("Enter the value of number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("It's not a number!");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
