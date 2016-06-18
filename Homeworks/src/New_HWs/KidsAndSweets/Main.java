package New_HWs.KidsAndSweets;

public class Main {
    public static void main(String[] args) {

        Kid kid1 = new Kid();
        Kid kid2 = new Kid();
        Kid kid3 = new Kid();
        Kid kid4 = new Kid();

        kid1.name = "Ann";
        kid2.name = "Alex";
        kid3.name = "Betty";
        kid4.name = "Jack";

        Sweet sweet1, sweet2, sweet3, sweet4;

        sweet1 = CandyShop.getSweet(SweetType.CANDY);
        sweet2 = CandyShop.getSweet(SweetType.ICECREAM);

        sweet3 = CandyShop.makeSweet(sweet1);
        sweet4 = CandyShop.makeSweet(sweet2);

        System.out.println("Feeding kids:");

        kid1.eatSweet(sweet1);
        kid2.eatSweet(sweet2);
        kid3.eatSweet(sweet3);
        kid4.eatSweet(sweet4);

        System.out.println("\nChanging food in pairs:");

        Changer changer = new Changer();
        changer.change(kid1, kid2, sweet1, sweet2);
        changer.change(kid3, kid4, sweet3, sweet4);

        System.out.println("\nMixed food exchange:");
        changer.change(kid1, kid3, sweet2, sweet4);
        changer.change(kid3, kid2, sweet4, sweet1);
        changer.change(kid1, kid4, sweet2, sweet3);
        changer.change(kid3, kid1, sweet4, sweet2);

    }
}