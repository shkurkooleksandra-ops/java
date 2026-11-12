package edu.ia63.lab03;

import static edu.ia63.lab03.Tools.*;

public class Task25_11 {

    static void main() {
        String[] teams = {
                "Динамо",
                "Шахтар",
                "Карпати",
        };
        int[][] scores = {
                {0, 2, 0},
                {0, 0, 2},
                {2, 0, 0}
        };
        for (int row = 0; row < scores.length; row++) {
            boolean hasLoses = false;
            for (int col = 0; col < scores[row].length; col++) {
                if (!isDiagonal(row, col) && scores[row][col] == 0) {
                    hasLoses = true;
                    break;
                }
            }
            if (!hasLoses) {
                System.out.println("команда " + String.format("%10s", teams[row]) + " пройшла без поразок: "
                        + arrayToString(scores[row]).replace('0', '-'));
            } else System.out.println("Команда " + String.format("%10s", teams[row] + " мала поразки"));
        }
    }

    private static boolean isDiagonal(int row, int col) {
        return row == col;
    }

}
