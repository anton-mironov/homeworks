package New_HWs.Animals;

import New_HWs.Animals.Animal;

public abstract class Herbivorous extends Animal implements Food {

    abstract String getBreed();

    Herbivorous(int i) {
        super(i);
    }

    @Override
    String getType() {
        return this.getClass().getName();
    }

    @Override
    void eat(Food food) {
        System.out.println(food.grass);
    }
}