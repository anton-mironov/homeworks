package Community_fees.Calculators;

import Community_fees.Tariffs;

public class WaterCalculator {

    private double coldWaterSupplyTariff = Tariffs.coldWaterSupplyTariff;
    private double hotWaterSupplyTariff = Tariffs.hotWaterSupplyTariff;
    private double sanitationTariff = Tariffs.sanitationTariff;

    public double calcWaterPayment(int coldWaterDiff, int hotWaterDiff) {
        double coldWaterSupplyPayment = coldWaterDiff * coldWaterSupplyTariff;
        double hotWaterSupplyPayment = hotWaterDiff * hotWaterSupplyTariff;
        double sanitationPayment = (coldWaterDiff + hotWaterDiff) * sanitationTariff;
        return coldWaterSupplyPayment + hotWaterSupplyPayment + sanitationPayment;
    }
}