package edu.ia63.lab02;

import java.util.Scanner;

public class Input {

    public static int readInt2(String prompt, int min, int max) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < min || number > max) {
            throw new IllegalArgumentException("Допустимі значення [" + min + "," + max + "]");
        }
        return number;
    }

    public static int readInt(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int x;
        boolean notInRange;
        do {
            System.out.print(prompt);
            x = scanner.nextInt();
            notInRange = x < min || x > max;
            if (notInRange) {
                System.out.println("Допустимі значення [" + min + "," + max + "]");
            }
        } while (notInRange);
        return x;
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
