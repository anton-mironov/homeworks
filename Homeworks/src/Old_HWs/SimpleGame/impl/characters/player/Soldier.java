package Old_HWs.SimpleGame.impl.characters.player;

import Old_HWs.SimpleGame.api.characters.*;
import Old_HWs.SimpleGame.api.characters.features.*;
import Old_HWs.SimpleGame.impl.characters.attacks.StrongAttack;
import Old_HWs.SimpleGame.impl.characters.features.BasicMonster;

public class Soldier extends BasicMonster implements Moving, Jumping, Flying {

    public Soldier(double health, int power, int moveDistance, int jumpDistance, int attackDistance) {
        super(health, power, moveDistance, jumpDistance, attackDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new StrongAttack(character, power);
    }
}