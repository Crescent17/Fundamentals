package com.epam.exercise.fundamental.fourth;

import java.util.Scanner;

public class CoordinatesInput {
    @SuppressWarnings("input")
    private final Scanner scanner;

    public CoordinatesInput() {
        this.scanner = new Scanner(System.in);
    }

    public int enterValue() {
        while (!scanner.hasNextInt()) {
            System.out.println("It's not a number!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}
