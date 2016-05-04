package New_HWs.Animals;

import New_HWs.Animals.Animal;

public abstract class Herbivorous extends Animal {

    abstract String getBreed();

    Herbivorous(int i) {
        super(i);
    }

    @Override
    String getType() {
        return this.getClass().getTypeName();
    }

    @Override
    String eat() {
        return "I'm eating grass only";
    }
}