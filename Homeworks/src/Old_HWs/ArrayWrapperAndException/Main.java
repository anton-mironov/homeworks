package Old_HWs.ArrayWrapperAndException;

public class Main {

    private static String ex = "Exception";

    public static void main(String[] args) {
        Integer[] arrayInt = {99, 88, 7, 66, 55, 44, 13, 22, 15};
        Double[] arrayDoub = {99.0, 88.0, 7.0, 66.0, 55.0, 44.0, 13.0, 22.0, 15.0};
        Long[] arrayLong = {15L, 22L, 13L, 44L, 55L, 66L, 7L, 88L, 99L};

        MyArrayWrapper<Integer> mAWI = new MyArrayWrapper<>(arrayInt);
        MyArrayWrapper<Double> mAWD = new MyArrayWrapper<>(arrayDoub);
        MyArrayWrapper<Long> mAWL = new MyArrayWrapper<>(arrayLong);

        System.out.println("Initial arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        mAWI.add(29);
        mAWD.add(29.8);
        mAWL.add(29L);

        System.out.println("\nExpanded arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        mAWI.remove(7);
        mAWD.remove(7.0);
        mAWL.remove(7L);

        System.out.println("\nConstricted arrays:");
        mAWI.showArray();
        mAWD.showArray();
        mAWL.showArray();

        System.out.println("\nMin & Max values:");
        mAWI.calcMinMax();
        mAWD.calcMinMax();
        mAWL.calcMinMax();

        System.out.println("\nAverage values of arrays:");
        mAWI.calcAverageArrayValue();
        mAWD.calcAverageArrayValue();
        mAWL.calcAverageArrayValue();

        try {
            mAWI.add(Integer.valueOf(ex));
        } catch (NumberFormatException numFormEx) {
            System.out.println("\nCall to MyArrayException:");
            MyArrayException.method1(ex, numFormEx);
            System.out.println("Back to Main.");
        }

        try {
            mAWD.add(Double.valueOf(ex));
        } catch (NumberFormatException numFormEx) {
            System.out.println("\nInner exception:");
            try {
                throw new MyArrayException();
            } catch (MyArrayException myArrayException) {
                MyArrayException.exceptionReport(ex, numFormEx);
            }
            System.out.println("End of inner \"try-catch\" block.");
        }
        System.out.println("End of outer \"try-catch\" block.");
    }
}