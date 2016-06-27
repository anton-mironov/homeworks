package Old_HWs.DifferentHWs;

public class Homework5Ex1 {

    public static void main(String[] args) {

        int array[] = {1, 2, 9, 3, 4, 9, 5, 6, 9, 7, 8, 9};
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = 1;
            } else if (array[i] == max) {
                count++;
            }
        }
        System.out.println("Число максимальных элементов массива = " + count);
    }
}