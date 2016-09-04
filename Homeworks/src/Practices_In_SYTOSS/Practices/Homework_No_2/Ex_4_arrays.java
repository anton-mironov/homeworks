package Practices_In_SYTOSS.Practices.Homework_No_2;

/* Найти и вывести минимальное число в массиве.*/

import java.util.Arrays;

public class Ex_4_arrays {
    public static void main(String[] args) {
        int array[] = new int[]{5, 3, 4, 2, 1};
        System.out.println("Initial array: " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Minimum = " + array[0]);
    }

    private static int[] sortArray(int array[]) {
        boolean isChanged;
        int n = 0;
        do {
            isChanged = false;
            n++;
            for (int i = 0; i < array.length - n; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isChanged = true;
                }
            }
        } while (isChanged);
        return array;
    }
}