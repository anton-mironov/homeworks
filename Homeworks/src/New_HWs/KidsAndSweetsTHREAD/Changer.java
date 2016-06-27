package New_HWs.KidsAndSweetsTHREAD;

public class Changer {
    Sweet localSweet;

    public void change(Kid kid1, Kid kid2) {
        localSweet = kid1.getLocalSweet();
        kid1.setLocalSweet(kid2.getLocalSweet());
        kid2.setLocalSweet(localSweet);

        System.out.println(kid1.getName() + " is now eating " + kid1.getLocalSweet().taste + " " + kid1.getLocalSweet().name + ".");
        System.out.println(kid2.getName() + " is now eating " + kid2.getLocalSweet().taste + " " + kid2.getLocalSweet().name + ".");
    }

    public void change(Kid kids[]) {
        //localSweet = kids[0].getLocalSweet();

        for (int i = 0; i < kids.length - 1; i++) {
            Sweet localSweet = kids[i].getLocalSweet();

            System.out.print(kids[i + 1].getName() + " gave " + kids[i].getName() + " the " + kids[i + 1].getLocalSweet().name + ". ");

            kids[i].setLocalSweet(kids[i + 1].getLocalSweet());
            kids[i + 1].setLocalSweet(localSweet);

            System.out.print(kids[i].getName() + " is now eating " + kids[i].getLocalSweet().taste + " " + kids[i].getLocalSweet().name + ". ");
            System.out.println(kids[i + 1].getName() + " is now eating " + kids[i + 1].getLocalSweet().taste + " " + kids[i + 1].getLocalSweet().name + ".");

        }
        System.out.print(kids[0].getName() + " gave " + kids[kids.length - 1].getName() + " the " + kids[0].getLocalSweet().name + ". ");
        System.out.println(kids[kids.length - 1].getName() + " is now eating " + kids[0].getLocalSweet().taste + " " + kids[0].getLocalSweet().name +
                ". The " + kids[kids.length - 1].getLocalSweet().taste + " " + kids[kids.length - 1].getLocalSweet().name + " is back to " + kids[0].getName() + ".");
    }
}