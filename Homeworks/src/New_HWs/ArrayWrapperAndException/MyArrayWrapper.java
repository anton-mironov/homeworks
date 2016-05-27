package New_HWs.ArrayWrapperAndException;

import java.util.Arrays;

public class MyArrayWrapper<AW extends Number> {

    public Number[] array;

    public MyArrayWrapper(AW[] initArray) {
        this.array = initArray;
    }

    public void add(AW digit) {
        Number[] expandArray = new Number[array.length + 1];
        System.arraycopy(array, 0, expandArray, 0, array.length);
        expandArray[array.length] = digit;
        array = expandArray;
    }

    public void showArray() {
        System.out.println(Arrays.deepToString(array));
    }

    public void remove(AW digit) {

        for (int i = 0; i < array.length; i++) {
            if (digit.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, (array.length - (i + 1)));
            }
        }

        Number[] constrictedArray = new Number[array.length - 1];
        System.arraycopy(array, 0, constrictedArray, 0, array.length - 1);
        array = constrictedArray;
    }

    public void calcMinMax() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[0] instanceof Integer) {
                    if ((int) array[j] > (int) array[j + 1]) {
                        sort(j);

                    }
                } else if (array[0] instanceof Double) {
                    if ((double) array[j] > (double) array[j + 1]) {
                        sort(j);
                    }
                } else if (array[0] instanceof Long) {
                    if ((long) array[j] > (long) array[j + 1]) {
                        sort(j);
                    }
                }
            }
        }
        String s = "Min value = " + array[0] + "  \t\tMax value = " + array[array.length - 1];
        System.out.println(s);
    }

    private void sort(int j) {
        Number tmp;
        tmp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = tmp;
    }

    public void calcAverageArrayValue() {
        Number average = null;
        int length = array.length;
        if (array[0] instanceof Integer) {
            int summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (int) array[i];
            }
            average = summ / length;
        } else if (array[0] instanceof Double) {
            double summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (double) array[i];
            }
            average = summ / length;
        } else if (array[0] instanceof Long) {
            long summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (long) array[i];
            }
            average = summ / length;
        }
        String s = "Average value = " + average;
        System.out.println(s);
    }
}