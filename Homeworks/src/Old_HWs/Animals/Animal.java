package Old_HWs.Animals;

public abstract class Animal {

    protected int age;
    protected double weight;
    protected boolean dom;


    abstract String getType();

    abstract void eat(Food food);

    abstract void animalSound();

    boolean isDomesticated() {
        return dom;
    }

    public int getAge() {
        return age;
    }

    Animal(int a) {
        this.age = a;
    }
}

interface Food {
    String grass = "grass";
    String meat = "meat";
   }