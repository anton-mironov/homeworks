package Old_HWs.SimpleGame.impl.characters.features;

import Old_HWs.SimpleGame.api.characters.*;
import Old_HWs.SimpleGame.api.characters.features.Moving;
import Old_HWs.SimpleGame.impl.characters.attacks.PunchAttack;

public class Ork extends BasicMonster implements Moving{

    public Ork(double health, int power, int moveDistance, int jumpDistance) {
        super(health, power, moveDistance, jumpDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new PunchAttack(character, power);
    }
}