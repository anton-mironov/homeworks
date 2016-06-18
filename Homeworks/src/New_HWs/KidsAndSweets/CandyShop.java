package New_HWs.KidsAndSweets;

public class CandyShop {

    public static Sweet getSweet(SweetType type) {
        switch (type) {
            case CANDY:
                return new Candy("lollipop", "chocolate");
            case ICECREAM:
                return new IceCream("ice-cream", "vanilla");
        }
        return null;
    }

    public static Sweet makeSweet(Sweet sweet) {
        Sweet purchase = null;
        if (sweet instanceof Candy) {
            purchase = new Candy("caramel", "fruit");
        } else if (sweet instanceof IceCream) {
            purchase = new IceCream("ice-cream", "pistachio");
        }
        return purchase;
    }

}