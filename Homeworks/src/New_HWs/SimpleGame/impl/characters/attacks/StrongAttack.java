package New_HWs.SimpleGame.impl.characters.attacks;

import New_HWs.SimpleGame.api.characters.BasicCharacter;
import New_HWs.SimpleGame.api.characters.AttackingType;

public class StrongAttack extends BasicAttack{

    public StrongAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }

        public AttackingType getAttackingType() {
        return AttackingType.STRONG;
    }
}