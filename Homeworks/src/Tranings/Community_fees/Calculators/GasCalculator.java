package Tranings.Community_fees.Calculators;

public class GasCalculator {
    private double gasTariff;

    public double calcGasPayment(int gasDiff) {
        double gasPayment = gasDiff * gasTariff;
        return gasPayment;
    }

    public double getGasTariff() {
        return gasTariff;
    }

    public void setGasTariff(double gasTariff) {
        this.gasTariff = gasTariff;
    }
}
