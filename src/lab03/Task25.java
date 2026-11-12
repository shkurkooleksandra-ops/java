package lab03;

import java.util.Objects;

import static java.lang.Math.abs;
import static lab03.Tools.*;

public class Task25 {
    static void main() {
        int[] x = new int[20];
        System.out.println("Масив: " + arrayToString(x));

        System.out.println("Другий мінімальний за модулем: " + searchSecondMin(x));

        System.out.println("Елементи з індексами, кратними 4:");
        for (int i = 0; i < x.length; i += 4) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("Кількість додатних серед них: " + rickRoll2(x));
        System.out.println("Початковий масив: " + arrayToString(x));
        System.out.println("Новий масив: " + arrayToString(task64(x)));


    }

    static int searchSecondMin(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        if (arr.length < 2) {
            throw new IllegalArgumentException("array length less than 2");
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("array element can't be " + Integer.MIN_VALUE);
            }
            int currentAbs = abs(e);
            if (currentAbs < abs(min1)) {
                min2 = min1;
                min1 = e;
            } else if (currentAbs < abs(min2)) {
                min2 = e;
            }
        }
        return min2;
    }

    static int rickRoll2(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        int counter = 0;
        for (int i = 0; i < arr.length; i += 4) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    static int[] task64(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < 0) {
                result[i] = current * -1;
            } else if (current > 0) {
                result[i] = current - 3;
            } else {
                result[i] = -2;
            }
        }
        return result;
    }

}
