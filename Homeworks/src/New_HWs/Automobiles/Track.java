package New_HWs.Automobiles;

public class Track implements Racing {

    String tiresVendor;

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    public boolean isDiesel() {
        return false;
    }
}