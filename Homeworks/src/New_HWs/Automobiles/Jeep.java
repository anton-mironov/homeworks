package New_HWs.Automobiles;

public class Jeep extends Track implements Rally, Truck {

    int enduranceLevel = 5;

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isDiesel() {
        return false;
    }

    @Override
    public boolean isAutonomous() {
        return true;
    }
}