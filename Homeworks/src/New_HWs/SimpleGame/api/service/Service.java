package New_HWs.SimpleGame.api.service;

import New_HWs.SimpleGame.api.characters.features.BasicMonster;

public interface Service {

    New_HWs.SimpleGame.api.characters.BasicCharacter getPlayerCharacter();

    BasicMonster[] getMonster();

    void nextIteration();
}