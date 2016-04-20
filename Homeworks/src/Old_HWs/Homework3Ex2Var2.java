package Old_HWs;

public class Homework3Ex2Var2 {
    public static void main(String[] args) {

        CalculatorMath calc1 = new CalculatorMath();
        calc1.setN(987.65);
        int min1 = calc1.calcN()[0];
        int max1 = calc1.calcN()[1];
        print(min1, max1, calc1.getN());

        CalculatorMath calc2 = new CalculatorMath();
        calc2.setN(543.21);
        int min2 = calc2.calcN()[0];
        int max2 = calc2.calcN()[1];
        print(min2, max2, calc2.getN());
    }

    private static void print(int min, int max, double val) {
        System.out.println("\n" + "Минимум из цифр в числе " + val + " равен " + min);
        System.out.println("Максимум из цифр в числе " + val + " равен " + max);
    }
}

class CalculatorMath {
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

        int arr[] = {x1, x2, x3, x4, x5};

        return mathMinMax(arr);
    }

    public int[] mathMinMax(int arr[]) {
        int[] arrayMinMax = new int[2];
        arrayMinMax[0] = (Math.min((Math.min((Math.min(arr[0], arr[1])), (Math.min(arr[2], arr[3])))), arr[4]));
        arrayMinMax[1] = (Math.max((Math.max((Math.max(arr[0], arr[1])), (Math.max(arr[2], arr[3])))), arr[4]));

        return arrayMinMax;
    }
}