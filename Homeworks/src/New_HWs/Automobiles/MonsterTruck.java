package New_HWs.Automobiles;

public class MonsterTruck extends Track implements Rally, Truck, Individual {

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