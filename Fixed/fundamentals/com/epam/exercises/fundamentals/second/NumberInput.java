package com.epam.exercises.fundamentals.second;

import java.util.Scanner;

public class NumberInput {
    private final Scanner scanner;

    public NumberInput() {
        this.scanner = new Scanner(System.in);
    }

    public int enterValue() {
        return scanner.nextInt();
    }
}
