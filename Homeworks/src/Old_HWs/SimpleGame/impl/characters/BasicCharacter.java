package Old_HWs.SimpleGame.impl.characters;

import Old_HWs.SimpleGame.api.characters.BasicCharacterAction;
import Old_HWs.SimpleGame.api.characters.features.*;

public class BasicCharacter implements Old_HWs.SimpleGame.api.characters.BasicCharacter {
    private double health;
    public int power;

    public BasicCharacter(double health) {
        this.health = health;
    }

    public BasicCharacter(int power) {
        this.power = power;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void changeHealth(int health) {
        this.health += health;
        if (this.health < 0) {
            this.health = 0;
            System.out.println(getClass().getName() + " has been killed");
        }
    }

    @Override
    public void doAction(BasicCharacterAction action) {
        if (canDoAction(action) && health > 0) {
            action.doAction();
        }
    }

    @Override
    public boolean canMoveToPosition() {
        return Moving.class.isAssignableFrom(this.getClass());
    }

    protected boolean canJumpToPosition(Object o){
        return Jumping.class.isAssignableFrom(o.getClass());
    }

    protected boolean canFlyThruPoints(Object o){
        return Flying.class.isAssignableFrom(o.getClass());
    }

    @Override
    public boolean canDoAction(BasicCharacterAction action) {
        return true;
    }
}