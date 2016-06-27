package Old_HWs.DifferentHWs;

public class Homework5Ex5 {

    public static void main(String[] args) {

        int ticketsPack[] = new int[1000000];
        int counter = 0;

        for (int i = 1; i < ticketsPack.length; i++) {
            ticketsPack[i] = i;
            int number = ticketsPack[i];

            int n1 = number / 100000;
            int digit = number - n1 * 100000;
            int n2 = digit / 10000;
            digit = digit - n2 * 10000;
            int n3 = digit / 1000;
            digit = digit - n3 * 1000;
            int n4 = digit / 100;
            digit = digit - n4 * 100;
            int n5 = digit / 10;
            digit = digit - n5 * 10;
            int n6 = digit % 10;

            int summ1 = n1 + n2 + n3;
            int summ2 = n4 + n5 + n6;

            if (summ1 - summ2 == 0) {
                counter++;
            }
        }
        System.out.println("Число счастливых билетов из " + (ticketsPack.length - 1) + " штук равно " + counter);
    }
}