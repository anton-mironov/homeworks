package com.company;

public class Homework3Ex1Var1 {
    public static void main(String[] args) {
        double n = 543.21;
        int bigN = (int) (n/0.01);

        int first = bigN/10000;
        int digit = bigN - first*10000;

        int second = digit/1000;
        digit = digit - second*1000;

        int third = digit/100;
        digit = digit - third*100;

        int fourth = digit/10;
        digit = digit - fourth*10;

        int fifth = digit%10;

        System.out.print("Набор цифр: "+ first + ", "+ second + ", " + third + ", " + fourth + ", " + fifth + ".");

        int summ = first + second + third + fourth + fifth;
        System.out.println("\n" + "Сумма цифр для числа " + n + " равна " + summ);
    }
}
