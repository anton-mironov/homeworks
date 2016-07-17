package New_HWs.LoggingArrayWrapperAndException;

import org.apache.log4j.Logger;

public class MyArrayException extends Exception {

    private static Logger logger = Logger.getLogger(MyArrayException.class);

    public static void method1(String ex, NumberFormatException numFormEx) {
        method2(ex, numFormEx);
        logger.info("Close method1.");
    }

    private static void method2(String ex, NumberFormatException numFormEx) {
        exceptionReport(ex, numFormEx);
        logger.info("Close method2.");
    }

    public static void exceptionReport(String ex, NumberFormatException numFormEx) {
        logger.warn("Exception caught. This message shows instead exception:");
        logger.info("\t\t\tType: \t\t" + numFormEx.getClass() + "\n\t\t\tValue: \t\t\"" + ex + "\"\n\t\t\tCaused by: \t"
                + ex
                .getClass());
    }
}