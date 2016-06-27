package Old_HWs.SimpleGame.impl.characters.attacks;

import Old_HWs.SimpleGame.api.characters.BasicCharacter;
import Old_HWs.SimpleGame.api.characters.AttackingType;

public class KnockoutAttack extends BasicAttack {

    public KnockoutAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }


    public AttackingType getAttackingType() {
        return AttackingType.KNOCKOUT;
    }
}