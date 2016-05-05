package New_HWs.Automobiles;

public class Bus extends Trailer implements Communal {

    int numberOfSeats = 21;

    @Override
    public int getNumberOfWheels() {
        return 8;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isDiesel() {
        return false;
    }
}