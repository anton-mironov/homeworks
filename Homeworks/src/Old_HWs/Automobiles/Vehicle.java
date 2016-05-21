package Old_HWs.Automobiles;

public interface Vehicle {

    double height = 1;
    double length = 1;
    double width = 1;

    int weight = 100;
    double power = 20;

    int getNumberOfWheels();

    String getType();

    String vendor = null;
    String model = null;

}