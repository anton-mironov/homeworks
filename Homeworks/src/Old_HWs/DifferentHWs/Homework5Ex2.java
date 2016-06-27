package Old_HWs.DifferentHWs;

public class Homework5Ex2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 11;
        }

        System.out.println("Прямой порядок символов в массиве:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nИнверсный порядок символов в массиве:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}


