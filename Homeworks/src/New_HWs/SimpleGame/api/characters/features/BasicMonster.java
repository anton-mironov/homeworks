package New_HWs.SimpleGame.api.characters.features;

import New_HWs.SimpleGame.api.characters.BasicCharacter;

public interface BasicMonster extends BasicCharacter {

    void attack(BasicCharacter character);

    int getAttackDistance();
}