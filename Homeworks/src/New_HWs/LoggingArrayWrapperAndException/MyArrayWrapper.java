package New_HWs.LoggingArrayWrapperAndException;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class MyArrayWrapper<AW extends Number> {

    private static Logger logger = Logger.getLogger(MyArrayWrapper.class);
    public Number[] array;


    public MyArrayWrapper(AW[] initArray) {
        logger.debug("Wrapping initial array.");
        this.array = initArray;
    }

    public void add(AW digit) {
        logger.debug("Start expanding initial array.");
        Number[] expandArray = new Number[array.length + 1];
        System.arraycopy(array, 0, expandArray, 0, array.length);
        logger.info("Creating expanded array.");
        expandArray[array.length] = digit;
        array = expandArray;
        logger.info("Expanded array created.");
    }

    public void showArray() {
        logger.info("Printing array.");
        System.out.println(Arrays.deepToString(array));
    }

    public void remove(AW digit) {
        logger.debug("Start removing value from array.");
        for (int i = 0; i < array.length; i++) {
            if (digit.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, (array.length - (i + 1)));
            }
        }
        logger.info("Creating constricted array.");
        Number[] constrictedArray = new Number[array.length - 1];
        System.arraycopy(array, 0, constrictedArray, 0, array.length - 1);
        array = constrictedArray;
        logger.info("Constricted array created.");
    }

    public void calcMinMax() {
        logger.debug("Initializing calculations for Min/Max values.");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[0] instanceof Integer) {
                    logger.info("Calculations for integer values.");
                    if ((int) array[j] > (int) array[j + 1]) {
                        sort(j);

                    }
                } else if (array[0] instanceof Double) {
                    logger.info("Calculations for double values.");
                    if ((double) array[j] > (double) array[j + 1]) {
                        sort(j);
                    }
                } else if (array[0] instanceof Long) {
                    logger.info("Calculations for long values.");
                    if ((long) array[j] > (long) array[j + 1]) {
                        sort(j);
                    }
                }
            }
        }
        logger.debug("Creating result string.");
        String s = "Min value = " + array[0] + "  \t\tMax value = " + array[array.length - 1];
        logger.info("Getting result string.\t" + s);
    }

    private void sort(int j) {
        logger.debug("Sorting content.");
        Number tmp;
        tmp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = tmp;
        logger.info("Getting sorted result.");
    }

    public void calcAverageArrayValue() {
        logger.debug("Initializing calculations for average values.");
        Number average = null;
        int length = array.length;
        if (array[0] instanceof Integer) {
            logger.info("Calculations for integer values.");
            int summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (int) array[i];
            }
            average = summ / length;
        } else if (array[0] instanceof Double) {
            logger.info("Calculations for double values.");
            double summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (double) array[i];
            }
            average = summ / length;
        } else if (array[0] instanceof Long) {
            logger.info("Calculations for long values.");
            long summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += (long) array[i];
            }
            average = summ / length;
        }
        logger.debug("Creating result string.");
        String s = "Average value = " + average;
        logger.info("Getting result string.\t" + s);
    }
}