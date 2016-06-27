package Old_HWs.SimpleGame.impl.characters.attacks;

import Old_HWs.SimpleGame.api.characters.BasicCharacter;
import Old_HWs.SimpleGame.api.characters.AttackingType;

public class MediumAttack extends BasicAttack {

    public MediumAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }

    public AttackingType getAttackingType() {
        return AttackingType.MEDIUM;
    }
}