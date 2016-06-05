package New_HWs.SimpleGame.impl.characters.features;

import New_HWs.SimpleGame.api.characters.*;
import New_HWs.SimpleGame.api.characters.features.Jumping;
import New_HWs.SimpleGame.impl.characters.attacks.MediumAttack;


public class BigOrk extends Ork implements Jumping{

    public BigOrk(double health, int power, int moveDistance, int jumpDistance) {
        super(health, power, moveDistance, jumpDistance);
    }

    @Override
    protected BasicCharacterAction getAttack(BasicCharacter character) {
        return new MediumAttack(character, power);
    }
}