package New_HWs.KidsAndSweets;

public class Main {
    public static void main(String[] args) {

        Kid kid1 = new Kid("Ann", 0, 0);
        Kid kid2 = new Kid("Alex", 1, 1);
        Kid kid3 = new Kid("Betty", 0, 1);
        Kid kid4 = new Kid("Jack", 1, 0);

        Kid[] kids = new Kid[]{kid1, kid2, kid3, kid4};

        System.out.println("Feeding kids:");
        for (Kid kid : kids) {
            new CandyShop().purchase(kid);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Kid kid : kids) {
            System.out.println(kid.toString());
        }

        System.out.println("\nChanging food in pairs:");
        Changer changer = new Changer();
        changer.change(kid1, kid2);
        changer.change(kid3, kid4);

        System.out.println("\nChanging food in chain:");
        Changer chainChanger = new Changer();
        chainChanger.change(kids);
    }
}