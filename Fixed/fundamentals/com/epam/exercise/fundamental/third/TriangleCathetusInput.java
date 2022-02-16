package com.epam.exercise.fundamental.third;

import java.util.Scanner;

public class TriangleCathetusInput {
    @SuppressWarnings("resource")
    private final Scanner scanner;

    public TriangleCathetusInput() {
        this.scanner = new Scanner(System.in);
    }

    public double cathetusInput() {
        double value;
        while (true) {
            System.out.print("Enter the value of the cathetus: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Incorrect value!");
                scanner.nextLine();
            }
            value = scanner.nextDouble();
            if (value > 0) {
                break;
            } else {
                System.out.println("Negative number is forbidden!");
            }
        }
        return value;
    }

}
