package Old_HWs.Delivery_Service;

public class TransportDetails {
    private int weight;                                     //in kgs
    private int price;                                        //per mile
    public double cost;                                    //depending on weight
    private int duration;                                  //in days
    private int numberOfIntermediatePoints;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String transportationParameters(TransportType chosenTransportType, String chosenCity1, String chosenCity2) {
        switch (chosenTransportType) {
            case SEA:
                price = 12;
                duration = 10;
                numberOfIntermediatePoints = 3;
                cost = calcCost();
                break;

            case GROUND:
                price = 2;
                duration = 7;
                numberOfIntermediatePoints = 12;
                cost = calcCost();
                break;

            case AIR:
                price = 25;
                duration = 1;
                numberOfIntermediatePoints = 3;
                cost = calcCost();
                break;

            case COMBO:
                price = 20;
                duration = 2;
                numberOfIntermediatePoints = 5;
                cost = calcCost();
                break;
        }
        return ("Total cost = $" + cost * calcDistances(chosenCity1, chosenCity2) + ".\nNumber of intermediate points = " + numberOfIntermediatePoints + ".\nDuration = " + duration + " day(s).");
    }

    private double calcCost() {
        if (weight > 0 && weight <= 2) {
            cost = price * 0.5;
        } else if (weight > 2 && weight <= 5) {
            cost = price;
        } else if (weight > 5 && weight <= 10) {
            cost = price * 2.5;
        } else if (weight > 10 && weight <= 100) {
            cost = price * 5;
        } else if (weight > 100 && weight <= 1000) {
            cost = price * 25;
        } else cost = price * 50;
        return cost;
    }

    private double calcDistances(String chosenCity1, String chosenCity2) {
        double distance = 0;
        String error = "\nPlease, select another city because now actual distance is 0.0 kms.";
        if (chosenCity1 == "Kharkiv") {
            switch (chosenCity2) {
                case "Kharkiv":
                    System.out.println(error);
                    break;
                case "Kyiv":
                    distance = 410;
                    break;
                case "Madrid":
                    distance = 3260;
                    break;
                case "New-York":
                    distance = 7850;
                    break;
                case "Deli":
                    distance = 4175;
                    break;
                case "Cairo":
                    distance = 2255;
                    break;
                case "Tokyo":
                    distance = 7900;
                    break;
                case "Havana":
                    distance = 9895;
                    break;
                case "Capetown":
                    distance = 9494;
                    break;
                case "Sydney":
                    distance = 14533;
                    break;
            }
        } else if (chosenCity1 == "Kyiv") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 410;
                    break;
                case "Kyiv":
                    System.out.println(error);
                    break;
                case "Madrid":
                    distance = 2862;
                    break;
                case "New-York":
                    distance = 7510;
                    break;
                case "Deli":
                    distance = 4557;
                    break;
                case "Cairo":
                    distance = 2267;
                    break;
                case "Tokyo":
                    distance = 8198;
                    break;
                case "Havana":
                    distance = 9530;
                    break;
                case "Capetown":
                    distance = 9456;
                    break;
                case "Sydney":
                    distance = 14942;
                    break;
            }
        } else if (chosenCity1 == "Madrid") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 3260;
                    break;
                case "Kyiv":
                    distance = 2862;
                    break;
                case "Madrid":
                    System.out.println(error);
                    break;
                case "New-York":
                    distance = 5767;
                    break;
                case "Deli":
                    distance = 7273;
                    break;
                case "Cairo":
                    distance = 3350;
                    break;
                case "Tokyo":
                    distance = 10761;
                    break;
                case "Havana":
                    distance = 7441;
                    break;
                case "Capetown":
                    distance = 8571;
                    break;
                case "Sydney":
                    distance = 17683;
                    break;
            }
        } else if (chosenCity1 == "New-York") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 7850;
                    break;
                case "Kyiv":
                    distance = 7510;
                    break;
                case "Madrid":
                    distance = 5767;
                    break;
                case "New-York":
                    System.out.println(error);
                    break;
                case "Deli":
                    distance = 11752;
                    break;
                case "Cairo":
                    distance = 9020;
                    break;
                case "Tokyo":
                    distance = 10848;
                    break;
                case "Havana":
                    distance = 2108;
                    break;
                case "Capetown":
                    distance = 12564;
                    break;
                case "Sydney":
                    distance = 15988;
                    break;
            }
        } else if (chosenCity1 == "Deli") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 4175;
                    break;
                case "Kyiv":
                    distance = 4557;
                    break;
                case "Madrid":
                    distance = 7273;
                    break;
                case "New-York":
                    distance = 11752;
                    break;
                case "Deli":
                    System.out.println(error);
                    break;
                case "Cairo":
                    distance = 4428;
                    break;
                case "Tokyo":
                    distance = 5835;
                    break;
                case "Havana":
                    distance = 13859;
                    break;
                case "Capetown":
                    distance = 9306;
                    break;
                case "Sydney":
                    distance = 10427;
                    break;
            }
        } else if (chosenCity1 == "Cairo") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 2255;
                    break;
                case "Kyiv":
                    distance = 2267;
                    break;
                case "Madrid":
                    distance = 3350;
                    break;
                case "New-York":
                    distance = 9020;
                    break;
                case "Deli":
                    distance = 4428;
                    break;
                case "Cairo":
                    System.out.println(error);
                    break;
                case "Tokyo":
                    distance = 9561;
                    break;
                case "Havana":
                    distance = 10789;
                    break;
                case "Capetown":
                    distance = 7241;
                    break;
                case "Sydney":
                    distance = 14415;
                    break;
            }
        } else if (chosenCity1 == "Tokyo") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 7900;
                    break;
                case "Kyiv":
                    distance = 8198;
                    break;
                case "Madrid":
                    distance = 10761;
                    break;
                case "New-York":
                    distance = 10848;
                    break;
                case "Deli":
                    distance = 5835;
                    break;
                case "Cairo":
                    distance = 9561;
                    break;
                case "Tokyo":
                    System.out.println(error);
                    break;
                case "Havana":
                    distance = 12118;
                    break;
                case "Capetown":
                    distance = 14730;
                    break;
                case "Sydney":
                    distance = 7826;
                    break;
            }
        } else if (chosenCity1 == "Havana") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 9895;
                    break;
                case "Kyiv":
                    distance = 9530;
                    break;
                case "Madrid":
                    distance = 7441;
                    break;
                case "New-York":
                    distance = 2108;
                    break;
                case "Deli":
                    distance = 13859;
                    break;
                case "Cairo":
                    distance = 10789;
                    break;
                case "Tokyo":
                    distance = 12118;
                    break;
                case "Havana":
                    System.out.println(error);
                    break;
                case "Capetown":
                    distance = 12368;
                    break;
                case "Sydney":
                    distance = 14701;
                    break;
            }
        } else if (chosenCity1 == "Capetown") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 9494;
                    break;
                case "Kyiv":
                    distance = 9456;
                    break;
                case "Madrid":
                    distance = 8571;
                    break;
                case "New-York":
                    distance = 12564;
                    break;
                case "Deli":
                    distance = 9306;
                    break;
                case "Cairo":
                    distance = 7241;
                    break;
                case "Tokyo":
                    distance = 14730;
                    break;
                case "Havana":
                    distance = 12368;
                    break;
                case "Capetown":
                    System.out.println(error);
                    break;
                case "Sydney":
                    distance = 11011;
                    break;
            }
        } else if (chosenCity1 == "Sydney") {
            switch (chosenCity2) {
                case "Kharkiv":
                    distance = 14533;
                    break;
                case "Kyiv":
                    distance = 14942;
                    break;
                case "Madrid":
                    distance = 17683;
                    break;
                case "New-York":
                    distance = 15988;
                    break;
                case "Deli":
                    distance = 10427;
                    break;
                case "Cairo":
                    distance = 14415;
                    break;
                case "Tokyo":
                    distance = 7826;
                    break;
                case "Havana":
                    distance = 14701;
                    break;
                case "Capetown":
                    distance = 11011;
                    break;
                case "Sydney":
                    System.out.println(error);
                    break;
            }
        }
        return distance;
    }
}