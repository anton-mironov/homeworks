package Tranings.Community_fees.Calculators;

public class WaterCalculator {

    private double coldWaterSupplyTariff;
    private double hotWaterSupplyTariff;
    private double sanitationTariff;

    public double calcWaterPayment(int waterDiff) {
        double coldWaterSupplyPayment = waterDiff * coldWaterSupplyTariff;
        double sanitationPayment = waterDiff * sanitationTariff;
        double waterPayment = coldWaterSupplyPayment + sanitationPayment;
        return waterPayment;
    }

    public double calcWaterPayment(int coldWaterDiff, int hotWaterDiff) {
        double coldWaterSupplyPayment = coldWaterDiff * coldWaterSupplyTariff;
        double hotWaterSupplyPayment = hotWaterDiff * hotWaterSupplyTariff;
        double sanitationPayment = (coldWaterDiff + hotWaterDiff) * sanitationTariff;
        double waterPayment = coldWaterSupplyPayment + hotWaterSupplyPayment + sanitationPayment;
        return waterPayment;
    }

    public double getColdWaterSupplyTariff() {
        return coldWaterSupplyTariff;
    }

    public void setColdWaterSupplyTariff(double coldWaterSupplyTariff) {
        this.coldWaterSupplyTariff = coldWaterSupplyTariff;
    }

    public double getHotWaterSupplyTariff() {
        return hotWaterSupplyTariff;
    }

    public void setHotWaterSupplyTariff(double hotWaterSupplyTariff) {
        this.hotWaterSupplyTariff = hotWaterSupplyTariff;
    }

    public double getSanitationTariff() {
        return sanitationTariff;
    }

    public void setSanitationTariff(double sanitationTariff) {
        this.sanitationTariff = sanitationTariff;
    }
}