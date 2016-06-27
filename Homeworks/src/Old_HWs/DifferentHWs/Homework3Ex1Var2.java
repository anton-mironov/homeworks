package Old_HWs.DifferentHWs;

public class Homework3Ex1Var2 {
    public static void main(String[] args) {

        CalculatorStr calc1 = new CalculatorStr();
        calc1.setN(987.65);
        int s1 = calc1.calcN();
        print(s1, calc1.getN());

        CalculatorStr calc2 = new CalculatorStr();
        calc2.setN(543.21);
        int s2 = calc2.calcN();
        print(s2, calc2.getN());
    }

    private static void print(int s, double val) {
        System.out.println("\n" + "Сумма цифр для числа " + val + " равна " + s);
    }
}

class CalculatorStr {
    double n;

    public void setN(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    int calcN() {
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

        int summ = x1 + x2 + x3 + x4 + x5;
        System.out.print("Набор цифр: " + x1 + ", " + x2 + ", " + x3 + ", " + x4 + ", " + x5 + ".");

        return summ;
    }
}