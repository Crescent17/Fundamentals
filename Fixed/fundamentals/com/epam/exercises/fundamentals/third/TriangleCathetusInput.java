package com.epam.exercises.fundamentals.third;

import java.util.Scanner;

public class TriangleCathetusInput {
    private final Scanner scanner;

    public TriangleCathetusInput() {
        this.scanner = new Scanner(System.in);
    }

    public double cathetusInput() {
        return scanner.nextDouble();
    }

}
