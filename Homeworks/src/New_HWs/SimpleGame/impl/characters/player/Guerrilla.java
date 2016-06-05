package New_HWs.SimpleGame.impl.characters.player;

import New_HWs.SimpleGame.api.characters.*;
import New_HWs.SimpleGame.api.characters.features.*;
import New_HWs.SimpleGame.impl.characters.attacks.PunchAttack;
import New_HWs.SimpleGame.impl.characters.features.BasicMonster;

public class Guerrilla extends BasicMonster implements Moving{

    public Guerrilla(double health, int power, int moveDistance, int jumpDistance, int attackDistance) {
        super(health, power, moveDistance, jumpDistance, attackDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new PunchAttack(character, power);
    }
}