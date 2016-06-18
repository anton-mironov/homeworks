package New_HWs.KidsAndSweets;

public class Changer {
    volatile Sweet sweet1, sweet2;

    public void change(Kid kid1, Kid kid2, Sweet sweet1, Sweet sweet2) {
        this.sweet1 = sweet1;
        this.sweet2 = sweet2;
        sweet1 = this.sweet2;
        sweet2 = this.sweet1;

        System.out.println(kid1.name + " is now eating " + sweet1.taste + " " + sweet1.name);
        System.out.println(kid2.name + " is now eating " + sweet2.taste + " " + sweet2.name);
    }
}