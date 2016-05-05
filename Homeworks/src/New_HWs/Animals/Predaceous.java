package New_HWs.Animals;

import New_HWs.Animals.Animal;

public abstract class Predaceous extends Animal {

    abstract String getBreed();

    Predaceous(int i) {
        super(i);
    }

    @Override
    String getType() {
        return this.getClass().getName();
    }

    @Override
    void eat(Food food) {
        System.out.println(food.meat);
    }

    void eat(Herbivorous food) {
        System.out.println(food.meat);
    }
}