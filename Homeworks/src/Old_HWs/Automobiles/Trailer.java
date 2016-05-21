package Old_HWs.Automobiles;

public class Trailer implements Cargo {

    @Override
    public int getNumberOfWheels() {
        return 6;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isAutonomous() {
        return false;
    }

    @Override
    public boolean isDiesel() {
        return false;
    }
}