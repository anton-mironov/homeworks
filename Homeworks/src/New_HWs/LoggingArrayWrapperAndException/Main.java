package New_HWs.LoggingArrayWrapperAndException;

import org.apache.log4j.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Initializing arrays.");
        Integer[] arrayInt = {99, 88, 7, 66, 55, 44, 13, 22, 15};
        Double[] arrayDoub = {99.0, 88.0, 7.0, 66.0, 55.0, 44.0, 13.0, 22.0, 15.0};
        Long[] arrayLong = {15L, 22L, 13L, 44L, 55L, 66L, 7L, 88L, 99L};

        logger.info("Creating wrappers.");
        MyArrayWrapper<Integer> mAWI = new MyArrayWrapper<>(arrayInt);
        MyArrayWrapper<Double> mAWD = new MyArrayWrapper<>(arrayDoub);
        MyArrayWrapper<Long> mAWL = new MyArrayWrapper<>(arrayLong);

        logger.debug("Create initial arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        mAWI.add(29);
        mAWD.add(29.8);
        mAWL.add(29L);

        logger.debug("\nExpand arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        mAWI.remove(7);
        mAWD.remove(7.0);
        mAWL.remove(7L);

        logger.debug("\nConstrict arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        logger.debug("\nMin & Max values:");
        mAWI.calcMinMax();
        mAWD.calcMinMax();
        mAWL.calcMinMax();

        logger.debug("\nAverage values of arrays:");
        mAWI.calcAverageArrayValue();
        mAWD.calcAverageArrayValue();
        mAWL.calcAverageArrayValue();

        String ex = "Exception";
        try {
            mAWI.add(Integer.valueOf(ex));
        } catch (NumberFormatException numFormEx) {
            logger.debug("\nCall to MyArrayException:");
            MyArrayException.method1(ex, numFormEx);
            logger.warn("Back to WriteReadFileVar1.");
        }

        try {
            mAWD.add(Double.valueOf(ex));
        } catch (NumberFormatException numFormEx) {
            logger.info("\nInner exception:");
            try {
                throw new MyArrayException();
            } catch (MyArrayException myArrayException) {
                MyArrayException.exceptionReport(ex, numFormEx);
            }
            logger.info("End of inner \"try-catch\" block.");
        }
        logger.info("End of outer \"try-catch\" block.");
    }
}