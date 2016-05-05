package New_HWs.Automobiles;

public interface Cargo extends Vehicle {

    int maxTonnage = 1000;

    boolean isAutonomous();

    boolean isDiesel();

}