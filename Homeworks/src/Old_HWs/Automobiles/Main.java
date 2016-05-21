package Old_HWs.Automobiles;

public class Main {
    public static void main(String[] args) {

        Dodge carDodge = new Dodge();

        System.out.println("Automobile - " + carDodge.getType() + " " + carDodge.model + "\nTires vendor - " + carDodge.tiresVendor + "\nMax speed = " + carDodge.maxSpeed + " km/h");
        System.out.println("\nDimensions: \n\t\t\tHeight: " + carDodge.height + " m\n\t\t\tLength: " + carDodge.length + " m\n\t\t\tWidth: " + carDodge.width + " m\n\t\t\tWeight: " + carDodge.weight + " kgs\n\n\t\t\tPower: " + carDodge.power + " hp" + "\n\t\t\tMax tonnage = " + carDodge.maxTonnage + " kgs");
        System.out.println("\nNumber of seats = " + carDodge.numberOfSeats + "\nNumber of wheels = " + carDodge.getNumberOfWheels() + "\nEndurance level = " + carDodge.enduranceLevel);
        System.out.println("\nDiesel = " + carDodge.isDiesel() + "\nAutonomous = " + carDodge.isAutonomous());

    }
}