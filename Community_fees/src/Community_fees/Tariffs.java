package Community_fees;

public class Tariffs {

    public static double electricityTariffNorm = 0.570;
    public static double electricityTariffOver100 = 0.990;
    public static double electricityTariffOver600 = 1.560;

    public static double gasTariff = 6.879;

    public static double coldWaterSupplyTariff = 6.990;
    public static double hotWaterSupplyTariff = 7.440;
    public static double sanitationTariff = 3.720;

    public static void setDefaultTariffs() {
        electricityTariffNorm = 0.570;
        electricityTariffOver100 = 0.990;
        electricityTariffOver600 = 1.560;
        gasTariff = 6.879;
        coldWaterSupplyTariff = 6.990;
        hotWaterSupplyTariff = 7.440;
        sanitationTariff = 3.720;
    }

    public static void setNewTariffs(String elNorm, String el100, String el600, String gas, String coldWater, String hotWater, String sanit) {
        if (elNorm.equals("0")) {
        } else if (!elNorm.equals(electricityTariffNorm)) {
            electricityTariffNorm = Double.parseDouble(elNorm);
        }

        if (el100.equals("0")) {
        } else if (!el100.equals(electricityTariffOver100)) {
            electricityTariffOver100 = Double.parseDouble(el100);
        }

        if (el600.equals("0")) {
        } else if (!el600.equals(electricityTariffOver600)) {
            electricityTariffOver600 = Double.parseDouble(el600);
        }

        if (gas.equals("0")) {
        } else if (!gas.equals(gasTariff)) {
            gasTariff = Double.parseDouble(gas);
        }

        if (coldWater.equals("0")) {
        } else if (!coldWater.equals(coldWaterSupplyTariff)) {
            coldWaterSupplyTariff = Double.parseDouble(coldWater);
        }

        if (hotWater.equals("0")) {
        } else if (!hotWater.equals(hotWaterSupplyTariff)) {
            hotWaterSupplyTariff = Double.parseDouble(hotWater);
        }

        if (sanit.equals("0")) {
        } else if (!sanit.equals(sanitationTariff)) {
            sanitationTariff = Double.parseDouble(sanit);
        }
    }
}