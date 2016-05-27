package Old_HWs.ArrayWrapperAndException;

public class MyArrayException extends Exception {

    public static void method1(String ex, NumberFormatException numFormEx) {
        method2(ex, numFormEx);
        System.out.println("Close method1.");
    }

    private static void method2(String ex, NumberFormatException numFormEx) {
        exceptionReport(ex, numFormEx);
        System.out.println("Close method2.");
    }

    public static void exceptionReport(String ex, NumberFormatException numFormEx) {
        System.out.println("Exception caught. This message shows instead exception:");
        System.out.println("\t\t\tType: \t\t" + numFormEx.getClass() + "\n\t\t\tValue: \t\t\"" + ex + "\"\n\t\t\tCaused by: \t" + ex.getClass());
    }
}