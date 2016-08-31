package Practices_In_SYTOSS.Practices.Homework_No_1;

/* К минимальному числу прибавить максимальное, если максимально чётное, и
умножить - если максимальное нечётное. В случае равенства результат равен -1. */

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int min, max;

        if (i > j) {
            max = i;
            min = j;
        } else {
            max = j;
            min = i;
        }

        if ((max % 2 == 0) && (max != min)) {
            System.out.println("min + max = " + (min + max));
        } else if ((max % 2 != 0) && (max != min)) {
            System.out.println("min * max = " + (min * max));
        } else {
            System.out.println("min = max. Result = -1.");
        }

        scanner.close();
    }
}