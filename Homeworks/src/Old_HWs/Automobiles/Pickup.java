package Old_HWs.Automobiles;

public class Pickup implements Truck, Individual {

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isDiesel() {
        return true;
    }

    @Override
    public boolean isAutonomous() {
        return true;
    }
}