package New_HWs.SimpleGame.impl.characters.player;

import New_HWs.SimpleGame.api.characters.*;
import New_HWs.SimpleGame.api.characters.features.*;
import New_HWs.SimpleGame.impl.characters.attacks.KnockoutAttack;
import New_HWs.SimpleGame.impl.characters.features.BasicMonster;

public class SuperSoldier extends BasicMonster implements Moving, Jumping, Flying {
    public SuperSoldier(double health, int power, int moveDistance, int jumpDistance, int attackDistance) {
        super(health, power, moveDistance, jumpDistance, attackDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new KnockoutAttack(character, power);
    }
}