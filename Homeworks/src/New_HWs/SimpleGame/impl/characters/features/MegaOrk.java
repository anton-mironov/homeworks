package New_HWs.SimpleGame.impl.characters.features;

import New_HWs.SimpleGame.api.characters.*;
import New_HWs.SimpleGame.api.characters.features.Flying;
import New_HWs.SimpleGame.api.characters.features.Jumping;
import New_HWs.SimpleGame.impl.characters.attacks.StrongAttack;

public class MegaOrk extends Ork implements Jumping, Flying{

    public MegaOrk(double health, int power, int moveDistance, int jumpDistance) {
        super(health, power, moveDistance, jumpDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new StrongAttack(character, power);
    }
}