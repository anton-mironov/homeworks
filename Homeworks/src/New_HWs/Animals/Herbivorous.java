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
    final void eat(Food food) {
        System.out.println(food.grass);
        if (food instanceof Animal) {
            System.out.println("Can't eat another animals");
        }
    }
}