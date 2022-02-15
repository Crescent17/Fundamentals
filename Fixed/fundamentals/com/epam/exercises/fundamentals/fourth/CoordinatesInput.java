package com.epam.exercises.fundamentals.fourth;

import java.util.Scanner;

public class CoordinatesInput {
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
