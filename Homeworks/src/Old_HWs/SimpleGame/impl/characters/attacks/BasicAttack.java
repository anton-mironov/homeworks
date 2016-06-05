package Old_HWs.SimpleGame.impl.characters.attacks;

import Old_HWs.SimpleGame.api.characters.*;
import Old_HWs.SimpleGame.api.characters.BasicCharacter;

public abstract class BasicAttack implements BasicCharacterAction {

    private BasicCharacter targetCharacter;
    protected int power;

    public BasicAttack(BasicCharacter targetCharacter, int power) {
        this.targetCharacter = targetCharacter;
        this.power = power;
    }

    //public abstract AttackingType getAttackingType();

    @Override
    public void doAction() {
        this.targetCharacter.changeHealth(-this.power);
    }

    @Override
    public BasicCharacter getActionTarget() {
        return this.targetCharacter;
    }
}