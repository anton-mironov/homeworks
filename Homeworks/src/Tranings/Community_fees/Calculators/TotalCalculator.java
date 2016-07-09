package Tranings.Community_fees.Calculators;

import java.util.Locale;

public class TotalCalculator {

    public double calculateAll() {

        ElectricityCalculator elCalc = new ElectricityCalculator();
        elCalc.setElectricityTariffNorm(0.57);
        elCalc.setElectricityTariffOver100(0.99);
        elCalc.setElectricityTariffOver600(1.56);
        double elPaymt = elCalc.calcElectricityPayment(143);
        System.out.println("Electricity payment = " + String.format(new Locale("ru"), "%(.2f", elPaymt) + " UAH");

        GasCalculator gasCalc = new GasCalculator();
        gasCalc.setGasTariff(6.879);
        double gasPaymt = gasCalc.calcGasPayment(50);
        System.out.println("Gas payment = " + String.format(new Locale("ru"), "%(.2f", gasPaymt) + " UAH");

        WaterCalculator waterCalc = new WaterCalculator();
        waterCalc.setColdWaterSupplyTariff(6.99);
        waterCalc.setSanitationTariff(3.72);
        double waterPaymt = waterCalc.calcWaterPayment(0, 33);
        System.out.println("Water payment (cold water only) = " + String.format(new Locale("ru"), "%(.2f", waterPaymt) + " UAH");

        WaterCalculator waterCalc1 = new WaterCalculator();
        waterCalc1.setColdWaterSupplyTariff(6.99);
        waterCalc1.setHotWaterSupplyTariff(7.440);
        waterCalc1.setSanitationTariff(3.72);
        double waterPaymtWithHot = waterCalc1.calcWaterPayment(5, 10);
        System.out.println("Water payment (cold and hot water)= " + String.format(new Locale("ru"), "%(.2f", waterPaymtWithHot) + " UAH");

        HeatingCalculator heatCalc = new HeatingCalculator();
        //heatCalc.setHeatingTariff(0);
        double heatPaymt = heatCalc.calcHeatingPayment(0);
        System.out.println("Heating payment = " + String.format(new Locale("ru"), "%(.2f", heatPaymt) + " UAH");

        MaintenanceCalculator mtnCalc = new MaintenanceCalculator();
        //mtnCalc.setMaintenanceTariff(50.30);
        double mntPaymt = mtnCalc.calcMaintenancePayment(50.30);
        System.out.println("Maintenance payment = " + String.format(new Locale("ru"), "%(.2f", mntPaymt) + " UAH");

        TotalCalculator totalCalc = new TotalCalculator();
        double totalBill = elPaymt + gasPaymt + waterPaymt + heatPaymt + mntPaymt;
        System.out.println("--------------------------------");
        System.out.println("Total: " + String.format(new Locale("ru"), "%(.2f", totalBill) + " UAH");
        return totalBill;
    }
}