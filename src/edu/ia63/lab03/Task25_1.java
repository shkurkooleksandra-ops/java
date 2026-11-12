package edu.ia63.lab03;

import static edu.ia63.lab03.Tools.*;
import static edu.ia63.lab03.Tools.matrixToString;

public class Task25_1 {

    static void main() {
        int[][] x = generateRandomMatrix(20, 10, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println("Масив:\n" + matrixToString(x));
        int[] sumOfAbs = calculateSumOfAbs(x);
        System.out.println("Сума модулів:\n" + arrayToString(sumOfAbs));
        int maxSumOfAbs = findMax(sumOfAbs);
        System.out.println("Max Сума модулів: " + maxSumOfAbs);
        for (int i = 0; i < sumOfAbs.length; i++) {
            if (sumOfAbs[i] == maxSumOfAbs) {
                System.out.println("Мінімальне в колонці: " + i + ": " + findMinInColumn(x, i));
            }
        }
    }

    private static int[] calculateSumOfAbs(int[][] matrix) {
        if (matrix.length < 1) {
            return new int[0];
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] sumOfAbs = new int[columns];
        for (int column = 0; column < columns; column++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += Math.abs(matrix[row][column]);
            }
            sumOfAbs[column] = sum;
        }
        return sumOfAbs;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    private static int findMinInColumn(int[][] matrix, int column) {
        int min = matrix[0][column];
        for (int row = 1; row < matrix.length; row++) {
            min = Math.min(min, matrix[row][column]);
        }
        return min;
    }
}
