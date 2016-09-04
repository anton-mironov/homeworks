package Practices_In_SYTOSS.Practices.Homework_No_2;

/* Считывает с клавиатуры число. Если число не положительное - выводит его в 10 степени, а если положительное - его факториал. */

import java.util.Scanner;

public class Ex_2_recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int degree = 10;

        if (i <= 0) {
            System.out.println("Ten degree = " + getTenDegree(i, degree));
        } else {
            System.out.println("Factorial = " + getFactorial(i));
        }
    }

    private static int getTenDegree(int i, int degree) {
        if (degree == 0) {
            return 1;
        } else {
            return getTenDegree(i, degree - 1) * i;
        }
    }

    private static int getFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        return getFactorial(i - 1) * i;
    }
}