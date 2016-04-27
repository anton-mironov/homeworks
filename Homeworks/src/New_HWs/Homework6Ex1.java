package New_HWs;

import java.util.Arrays;

public class Homework6Ex1 {

    public static void main(String[] args) {

        String[] string = {"111 22 333", "44 555 66", "777 88 999"};
        System.out.println("Строка:\n" + Arrays.deepToString(string));
        String[] splitter;

        int array[][] = new int[3][3];
        for (int i = 0; i < string.length; i++) {
            splitter = string[i].split(" ");

            for (int j = 0; j < array.length; j++) {
                array[i][j] = Integer.parseInt(String.valueOf(splitter[j]));
            }
        }
        System.out.println("\nМассив Integer'ов:\n" + Arrays.deepToString(array));

        int summArray[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int number = array[i][j];

                int n1 = number / 100;
                int digit = number - n1 * 100;
                int n2 = digit / 10;
                digit = digit - n2 * 10;
                int n3 = digit % 10;
                int summ = n1 + n2 + n3;
                summArray[i][j] = summ;
            }
        }
        System.out.println("\nСумма цифр каждого элемента:\n" + Arrays.deepToString(summArray));
    }
}