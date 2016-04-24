package New_HWs;

public class Homework5Ex4 {
    public static void main(String[] args) {

        int arrayFibon[] = new int[11];

        int a = arrayFibon[0] = arrayFibon[1] = 1;
        System.out.print(a + " " + a + " ");

        for (int i = 2; i < arrayFibon.length; i++) {
            arrayFibon[i] = arrayFibon[i - 2] + arrayFibon[i - 1];
            System.out.print(arrayFibon[i] + " ");
        }
    }
}