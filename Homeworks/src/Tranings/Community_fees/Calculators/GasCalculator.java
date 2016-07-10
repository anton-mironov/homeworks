package Tranings.Community_fees.Calculators;

import Tranings.Community_fees.Tariffs;

public class GasCalculator {
    private double gasTariff = Tariffs.gasTariff;

    public double calcGasPayment(int gasDiff) {
        return gasDiff * gasTariff;
    }
}