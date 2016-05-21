package Old_HWs.Animals;

public class Main {
    public static void main(String[] args) {

        Wolf wolf = new Wolf(1);
        wolf.eat(new Zebra(2));

        Zebra zebra = new Zebra(5);
        zebra.eat(new Zebra(2));

        System.out.println();
    }
}