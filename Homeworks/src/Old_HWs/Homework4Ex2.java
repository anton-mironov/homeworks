package Old_HWs;

public class Homework4Ex2 {
    public static void exercise4_2() {
        double digit = 123.45678;


        String stringN = String.valueOf(digit).replace(".", "");

        String str1 = String.valueOf(stringN.charAt(0));
        String str2 = String.valueOf(stringN.charAt(1));
        String str3 = String.valueOf(stringN.charAt(2));
        String str4 = String.valueOf(stringN.charAt(3));
        String str5 = String.valueOf(stringN.charAt(4));
        String str6 = String.valueOf(stringN.charAt(5));
        String str7 = String.valueOf(stringN.charAt(6));
        String str8 = String.valueOf(stringN.charAt(7));

        int x1 = Integer.parseInt(str1);
        int x2 = Integer.parseInt(str2);
        int x3 = Integer.parseInt(str3);
        int x4 = Integer.parseInt(str4);
        int x5 = Integer.parseInt(str5);
        int x6 = Integer.parseInt(str6);
        int x7 = Integer.parseInt(str7);
        int x8 = Integer.parseInt(str8);

        int summ = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8;
        System.out.println("Формула: " + x1 + " + " + x2 + " + " + x3 + " + " + x4 + " + " + x5 + " + " + x6 + " + " + 7 + " + " + 8 + " = " + summ + ".");


    }
}

