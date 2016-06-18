package New_HWs.KidsAndSweets;

public class Kid {
    public String name;

    public void eatSweet(Sweet sweet) {

        System.out.println(this.name + " is eating " + sweet.taste + " " + sweet.name);
    }
}