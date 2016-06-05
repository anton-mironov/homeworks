package New_HWs.SimpleGame.impl.characters.attacks;

import New_HWs.SimpleGame.api.characters.BasicCharacter;
import New_HWs.SimpleGame.api.characters.AttackingType;

public class PunchAttack extends BasicAttack {

    public PunchAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }

    public AttackingType getAttackingType() {
        return AttackingType.PUNCH;
    }
}