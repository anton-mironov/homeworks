package New_HWs.Delivery_Service;

public enum TransportType {
    SEA, GROUND, AIR, COMBO;

    private int price;                          //per mile
    private int weight;                       //in kgs
    private int duration;                    //in days
    private int numberOfIntermediatePoints;
    private double cost;                    //total

    TransportType tType;

    public void transportationParameters() {
        switch (tType) {
            case SEA:
                price = 12;
                duration = 10;
                numberOfIntermediatePoints = 3;

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
                break;

            case GROUND:
                price = 2;
                duration = 7;
                numberOfIntermediatePoints = 12;

                if (weight > 0 && weight <= 2) {
                    cost = price * 0.2;
                } else if (weight > 2 && weight <= 5) {
                    cost = price * 0.5;
                } else if (weight > 5 && weight <= 10) {
                    cost = price * 1.5;
                } else if (weight > 10 && weight <= 100) {
                    cost = price * 3;
                } else if (weight > 100 && weight <= 1000) {
                    cost = price * 10;
                } else cost = price * 25;
                break;

            case AIR:
                price = 25;
                duration = 1;
                numberOfIntermediatePoints = 3;

                if (weight > 0 && weight <= 2) {
                    cost = price * 0.7;
                } else if (weight > 2 && weight <= 5) {
                    cost = price * 1.5;
                } else if (weight > 5 && weight <= 10) {
                    cost = price * 5;
                } else if (weight > 10 && weight <= 100) {
                    cost = price * 20;
                } else if (weight > 100 && weight <= 1000) {
                    cost = price * 50;
                } else cost = price * 120;
                break;

            case COMBO:
                price = 20;
                duration = 2;
                numberOfIntermediatePoints = 5;

                if (weight > 0 && weight <= 2) {
                    cost = price * 0.5;
                } else if (weight > 2 && weight <= 5) {
                    cost = price * 1.2;
                } else if (weight > 5 && weight <= 10) {
                    cost = price * 4;
                } else if (weight > 10 && weight <= 100) {
                    cost = price * 17;
                } else if (weight > 100 && weight <= 1000) {
                    cost = price * 45;
                } else cost = price * 100;
                break;
        }
    }
}

  /*  TransportType(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }*/