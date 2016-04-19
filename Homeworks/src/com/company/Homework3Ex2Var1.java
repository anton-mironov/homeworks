package com.company;

public class Homework3Ex2Var1 {
    public static void main(String[] args) {

        CalculatorMinMax calc1 = new CalculatorMinMax();
        calc1.setN(987.65);
        int min1 = calc1.calcN()[0];
        int max1 = calc1.calcN()[4];
        print(min1, max1, calc1.getN());

        CalculatorMinMax calc2 = new CalculatorMinMax();
        calc2.setN(543.21);
        int min2 = calc2.calcN()[0];
        int max2 = calc2.calcN()[4];
        print(min2, max2, calc2.getN());
    }

    private static void print(int min, int max, double val) {
        System.out.println("\n" + "Минимум из цифр в числе " + val + " равен " + min);
        System.out.println("\n" + "Максимум из цифр в числе " + val + " равен " + max);
    }
}

class CalculatorMinMax {
    double n;

    public void setN(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public int[] calcN() {
        double newN = n;
        String stringN = String.valueOf(newN).replace(".", "");

        String str1 = String.valueOf(stringN.charAt(0));
        String str2 = String.valueOf(stringN.charAt(1));
        String str3 = String.valueOf(stringN.charAt(2));
        String str4 = String.valueOf(stringN.charAt(3));
        String str5 = String.valueOf(stringN.charAt(4));

        int x1 = Integer.parseInt(str1);
        int x2 = Integer.parseInt(str2);
        int x3 = Integer.parseInt(str3);
        int x4 = Integer.parseInt(str4);
        int x5 = Integer.parseInt(str5);

        int sort[] = {x1, x2, x3, x4, x5};

        return bubbleSort(sort);
    }

    public int[] bubbleSort(int sort[]) {
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int t = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = t;
                }
            }
        }
        return sort;
    }
}