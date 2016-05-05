package New_HWs.Automobiles;

public interface Vehicle {

    double height = 0;
    double length = 0;
    double width = 0;

    int weight = 0;
    double power = 0;

    int getNumberOfWheels();

    String getType();

    String vendor = null;
    String model = null;

}