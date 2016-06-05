package New_HWs.SimpleGame.impl.characters.attacks;

import New_HWs.SimpleGame.api.characters.BasicCharacter;
import New_HWs.SimpleGame.api.characters.AttackingType;

public class KnockoutAttack extends BasicAttack {

    public KnockoutAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }


    public AttackingType getAttackingType() {
        return AttackingType.KNOCKOUT;
    }
}