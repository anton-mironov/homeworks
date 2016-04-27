package New_HWs;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Homework6Ex2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите предполагаемое число: ");
        while (scanner.hasNextInt() && counter < 7) {
            int guess = scanner.nextInt();

            if (guess == secret) {
                System.out.println("Вы угадали!");
                return;
            } else if (guess > secret) {
                System.out.println("Много!");
            } else {
                System.out.println("Мало!");
            }
            counter++;
        }
        System.out.println("Количество попыток исчерпано. Игра окончена");
    }
}