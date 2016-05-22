package New_HWs.SimpleGame.api.service;

import New_HWs.SimpleGame.api.characters.features.BasicMonster;

public interface Service {

    BasicMonster[] getMonster();

    void nextIteration();
}