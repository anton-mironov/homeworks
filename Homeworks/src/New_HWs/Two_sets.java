package New_HWs;

import java.util.HashSet;

public class Two_sets {
    public static void main(String[] args) {
        HashSet<String> blockedCars = new HashSet<>();
        blockedCars.add("car 1");
        blockedCars.add("car 2");
        blockedCars.add("car 3");
        blockedCars.add("car A");
        blockedCars.add("car B");
        blockedCars.add("car C");

        HashSet<String> selectedCars = new HashSet<>();
        selectedCars.add("car A");
        selectedCars.add("car B");
        selectedCars.add("car C");
        selectedCars.add("car 4");
        selectedCars.add("car 5");

        HashSet<String> blockedCars2 = new HashSet<>();
        blockedCars2.addAll(blockedCars);

        System.out.println("Initial blocked cars" + blockedCars);
        System.out.println("Initial selected cars" + selectedCars);

        if (blockedCars.removeAll(selectedCars)) {
            System.out.println("\nRemoved blocked cars" + blockedCars);
        }

        if (selectedCars.removeAll(blockedCars2)) {
            System.out.println("Removed selected cars" + selectedCars);
        }
    }
}