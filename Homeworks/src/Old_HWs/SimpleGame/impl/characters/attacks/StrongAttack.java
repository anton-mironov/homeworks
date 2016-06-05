package Old_HWs.SimpleGame.impl.characters.attacks;

import Old_HWs.SimpleGame.api.characters.BasicCharacter;
import Old_HWs.SimpleGame.api.characters.AttackingType;

public class StrongAttack extends BasicAttack{

    public StrongAttack(BasicCharacter targetCharacter, int power) {
        super(targetCharacter, power);
    }

        public AttackingType getAttackingType() {
        return AttackingType.STRONG;
    }
}