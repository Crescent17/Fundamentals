package com.epam.exercises.fundamentals.second;

import java.util.Scanner;

public class NumberInput {
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
