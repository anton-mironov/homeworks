package Old_HWs.DifferentHWs;

public class Homework3Ex1Var1 {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        calc1.setN(123.45);
        int s1 = calc1.calcN();
        print(s1, calc1.getN());

        Calculator calc2 = new Calculator();
        calc2.setN(678.90);
        int s2 = calc2.calcN();
        print(s2, calc2.getN());
    }

    private static void print(int s, double val) {
        System.out.println("\n" + "Сумма цифр для числа " + val + " равна " + s);
    }
}

class Calculator {
    double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    int calcN() {
        int bigN = (int) (n / 0.01);
        int first = bigN / 10000;
        int digit = bigN - first * 10000;
        int second = digit / 1000;
        digit = digit - second * 1000;
        int third = digit / 100;
        digit = digit - third * 100;
        int fourth = digit / 10;
        digit = digit - fourth * 10;
        int fifth = digit % 10;
        int summ = first + second + third + fourth + fifth;
        System.out.print("Набор цифр: " + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ".");
        return summ;
    }
}