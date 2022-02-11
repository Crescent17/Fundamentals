package com.epam.exercises.fundamentals.fourth;

import java.util.Scanner;

public class CoordinatesInput {
    private final Scanner scanner;

    public CoordinatesInput() {
        this.scanner = new Scanner(System.in);
    }

    public int valueOfX() {
        return scanner.nextInt();
    }

    public int valueOfY() {
        return scanner.nextInt();
    }
}
