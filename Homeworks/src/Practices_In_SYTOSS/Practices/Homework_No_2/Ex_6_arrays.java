package Practices_In_SYTOSS.Practices.Homework_No_2;

/* Найти и вывести произведение всех чисел из второй половины массива.*/

import java.util.Arrays;

public class Ex_6_arrays {
    public static void main(String[] args) {
        double array[] = new double[]{6, 5, 4, 3.5, 2, 1};
        System.out.println("Array: " + Arrays.toString(array));
        int len = array.length;
        int half;

        if (len % 2 != 0) {
            half = (len / 2) + 1;
            calculateAndPrint(half, array);
        } else {
            half = len / 2;
            calculateAndPrint(half, array);
        }
    }

    private static void calculateAndPrint(int half, double[] array) {
        System.out.println("Half = " + half);
        System.out.println("Second half starts with " + array[half]);

        double product = 1;
        for (int i = half; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println("Product = " + product);
    }
}