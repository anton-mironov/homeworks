package Practices_In_SYTOSS.Practices.Homework_No_1;

/* Если оба числа имеют одинаковый знак (или положительный
или отрицательный) - перемножить их; в противном случае - сложить. */

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        if (((i > 0) && (j > 0)) || ((i < 0) && (j < 0))) {
            System.out.println("i * j = " + (i * j));
        } else {
            System.out.println("i + j = " + (i + j));
        }
    }
}
