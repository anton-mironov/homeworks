package Old_HWs.SimpleGame.impl.characters.player;

import Old_HWs.SimpleGame.api.characters.*;
import Old_HWs.SimpleGame.api.characters.features.*;
import Old_HWs.SimpleGame.impl.characters.attacks.KnockoutAttack;
import Old_HWs.SimpleGame.impl.characters.features.BasicMonster;

public class SuperSoldier extends BasicMonster implements Moving, Jumping, Flying {
    public SuperSoldier(double health, int power, int moveDistance, int jumpDistance, int attackDistance) {
        super(health, power, moveDistance, jumpDistance, attackDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new KnockoutAttack(character, power);
    }
}