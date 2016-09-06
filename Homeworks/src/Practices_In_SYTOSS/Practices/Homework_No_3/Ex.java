package Practices_In_SYTOSS.Practices.Homework_No_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Please, enter your numbers below:");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        do {
            Integer i = scanner.nextInt();
            if (i > 0) {
                if (arrayList.contains(i)) {
                    arrayList.remove(i);
                }
                arrayList.add(i);
            } else {
                break;
            }
        } while (true);

        scanner.close();

        System.out.println("You've entered all data.");

        int sum = 0;

        for (Integer anArrayList : arrayList) {
            sum += anArrayList;
        }

        Integer avg = sum / arrayList.size();

        System.out.println("Summ = " + sum);
        System.out.println("Average value = " + avg);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (Integer anArrayList : arrayList) {
            if (anArrayList < avg) {
                numbers.add(anArrayList);
            }
        }

        System.out.println("Less then avg (or equals): " + numbers.toString() + ". (Sorted in order of input)");

        sortArray(arrayList);

        System.out.println("Sorted array: " + arrayList.toString());
    }

    private static ArrayList<Integer> sortArray(ArrayList<Integer> array) {
        boolean isChanged;
        int n = 0;
        do {
            isChanged = false;
            n++;
            for (int i = 0; i < array.size() - n; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    int tmp = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, tmp);
                    isChanged = true;
                }
            }
        } while (isChanged);
        return array;
    }
}