package Community_fees.Calculators;

import Community_fees.Tariffs;

public class ElectricityCalculator {

    private double electricityTariffNorm = Tariffs.electricityTariffNorm;
    private double electricityTariffOver100 = Tariffs.electricityTariffOver100;
    private double electricityTariffOver600 = Tariffs.electricityTariffOver600;

    public double calcElectricityPayment(int electricityDiff) {
        double electricityPayment100 = 100 * electricityTariffNorm;
        double electricityPayment = 0;
        if (electricityDiff < 100) {
            electricityPayment = electricityDiff * electricityTariffNorm;
        } else if (electricityDiff >= 100 || electricityDiff < 600) {
            int extra100 = electricityDiff - 100;
            electricityPayment = electricityPayment100 + extra100 * electricityTariffOver100;
        }
        if (electricityDiff >= 600) {
            int extra600 = electricityDiff - 600;
            electricityPayment = electricityPayment100 + 500 * electricityTariffOver100 + extra600 * electricityTariffOver600;
        }
        return electricityPayment;
    }
}