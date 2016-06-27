package New_HWs.KidsAndSweetsTHREAD;

public class Main {
    public static void main(String[] args) {

//        String[] names = {"Ann", "Alex", "Betty", "Jack"};
//
//        for (String name : names) {
//            Sweet sweet = null;
//            Kid kid = new Kid(sweet);
//            //           new Thread(kid).start();
//            sweet = new CandyShop().purchase(1, 1);
////            sweet.notify();
//            System.out.println("kid.getLocalSweet() = " + kid.getLocalSweet().name);
//            //  kid.setLocalSweet(sweet);
//
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        Kid kid1 = new Kid("Ann", 0, 0);
        Kid kid2 = new Kid("Alex", 1, 1);
        Kid kid3 = new Kid("Betty", 0, 1);
        Kid kid4 = new Kid("Jack", 1, 0);

        Kid[] kids = new Kid[]{kid1, kid2, kid3, kid4};

        System.out.println("Feeding kids:");
        for (Kid kid : kids) {
            kid.setLocalSweet(new CandyShop().purchase(kid.getSex(), kid.getPreference()));

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