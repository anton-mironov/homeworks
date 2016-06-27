package New_HWs.KidsAndSweetsTHREAD;

public class CandyShop {

    public synchronized Sweet purchase(int sex, int preference) {
        Sweet sweet;

        if (sex == 0) {
            if (preference == 0) {
                sweet = new Candy("lollipop", "vanilla");
                sweet.setTimeStamp(System.currentTimeMillis());
            } else {
                sweet = new Candy("caramel", "fruit");
                sweet.setTimeStamp(System.currentTimeMillis());
            }
        } else {
            if (preference == 0) {
                sweet = new IceCream("plombyro", "chocolate");
                sweet.setTimeStamp(System.currentTimeMillis());
            } else {
                sweet = new IceCream("ice-cream", "pistachio");
                sweet.setTimeStamp(System.currentTimeMillis());
            }
        }


        return sweet;
    }
}