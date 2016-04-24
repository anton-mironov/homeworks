package New_HWs;

public class Homework5Ex3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        int array[][] = new int[2][n];

        System.out.println("Случайное число, указывающее размер второй размерности массива - " + n);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("\nМассив:");
        for (int i = 0; i < array.length; i++) {
           System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
    }
}
