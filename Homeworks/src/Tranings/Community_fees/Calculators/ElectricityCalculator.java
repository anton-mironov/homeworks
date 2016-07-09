package Tranings.Community_fees.Calculators;

public class ElectricityCalculator {

    private double electricityTariffNorm;
    private double electricityTariffOver100;
    private double electricityTariffOver600;

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

    public double getElectricityTariffNorm() {
        return electricityTariffNorm;
    }

    public void setElectricityTariffNorm(double electricityTariffNorm) {
        this.electricityTariffNorm = electricityTariffNorm;
    }

    public double getElectricityTariffOver100() {
        return electricityTariffOver100;
    }

    public void setElectricityTariffOver100(double electricityTariffOver100) {
        this.electricityTariffOver100 = electricityTariffOver100;
    }

    public double getElectricityTariffOver600() {
        return electricityTariffOver600;
    }

    public void setElectricityTariffOver600(double electricityTariffOver600) {
        this.electricityTariffOver600 = electricityTariffOver600;
    }
}