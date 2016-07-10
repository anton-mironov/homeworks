package Community_fees.Calculators;

import java.util.Locale;

public class TotalCalculator {

    public String createTotalBill(int elDiff, int gasDiff, int coldWaterDiff, int hotWaterDiff, double heatPayment, double mntPayment) {

        ElectricityCalculator elCalc = new ElectricityCalculator();
        double elPaymt = elCalc.calcElectricityPayment(elDiff);
        String elRes = "Electricity payment = " + String.format(new Locale("ru"), "%(.2f", elPaymt) + " UAH\n";

        GasCalculator gasCalc = new GasCalculator();
        double gasPaymt = gasCalc.calcGasPayment(gasDiff);
        String gasRes = "Town gas payment = " + String.format(new Locale("ru"), "%(.2f", gasPaymt) + " UAH\n";

        WaterCalculator waterCalc = new WaterCalculator();
        double waterPaymt = waterCalc.calcWaterPayment(coldWaterDiff, hotWaterDiff);
        String watRes = "Water payment = " + String.format(new Locale("ru"), "%(.2f", waterPaymt) + " UAH\n";

        HeatingCalculator heatCalc = new HeatingCalculator();
        double heatPaymt = heatCalc.calcHeatingPayment(heatPayment);
        String heatRes = "";
        if (heatPaymt != 0) {
            heatRes = "Heating payment = " + String.format(new Locale("ru"), "%(.2f", heatPaymt) + " UAH\n";
        }

        MaintenanceCalculator mtnCalc = new MaintenanceCalculator();
        double mntPaymt = mtnCalc.calcMaintenancePayment(mntPayment);
        String mntRes = "Maintenance payment = " + String.format(new Locale("ru"), "%(.2f", mntPaymt) + " UAH\n";

        double totalBill = elPaymt + gasPaymt + waterPaymt + heatPaymt + mntPaymt;
        String totalRes = "-------------------------------------------------\n" +
                "Total: " + String.format(new Locale("ru"), "%.2f", totalBill) + " UAH";


        return elRes + gasRes + watRes + heatRes + mntRes + totalRes;
    }
}