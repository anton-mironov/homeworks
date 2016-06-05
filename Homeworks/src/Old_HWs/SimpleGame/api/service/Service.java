package Old_HWs.SimpleGame.api.service;

import Old_HWs.SimpleGame.api.characters.features.BasicMonster;

public interface Service {

    BasicMonster[] getMonster();

    void nextIteration();
}