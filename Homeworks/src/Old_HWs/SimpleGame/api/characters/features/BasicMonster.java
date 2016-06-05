package Old_HWs.SimpleGame.api.characters.features;

import Old_HWs.SimpleGame.api.characters.BasicCharacter;

public interface BasicMonster extends BasicCharacter {

    void attack(BasicCharacter character);

    int getAttackDistance();
}