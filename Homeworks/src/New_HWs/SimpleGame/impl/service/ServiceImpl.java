package New_HWs.SimpleGame.impl.service;

import New_HWs.SimpleGame.api.characters.features.Moving;
import New_HWs.SimpleGame.api.service.Service;
import New_HWs.SimpleGame.api.characters.BasicCharacter;
import New_HWs.SimpleGame.api.characters.features.BasicMonster;
import New_HWs.SimpleGame.impl.characters.features.BigOrk;
import New_HWs.SimpleGame.impl.characters.features.MegaOrk;
import New_HWs.SimpleGame.impl.characters.features.Ork;
import New_HWs.SimpleGame.impl.characters.player.Guerrilla;
import New_HWs.SimpleGame.impl.characters.player.Soldier;
import New_HWs.SimpleGame.impl.characters.player.SuperSoldier;

import java.awt.*;
import java.util.Random;

public class ServiceImpl implements Service {

    static final int GUERRILLA_HEALTH = 100;
    static final int GUERRILLA_POWER = 20;
    static final int GUERRILLA_MOVE_DISTANCE = 2;
    static final int GUERRILLA_JUMP_DISTANCE = 0;
    static final int GUERRILLA_ATTACK_DISTANCE = 2;

    static final int SOLDIER_HEALTH = 200;
    static final int SOLDIER_POWER = 40;
    static final int SOLDIER_MOVE_DISTANCE = 3;
    static final int SOLDIER_JUMP_DISTANCE = 2;
    static final int SOLDIER_ATTACK_DISTANCE = 5;

    static final int SUPERSOLDIER_HEALTH = 400;
    static final int SUPERSOLDIER_POWER = 50;
    static final int SUPERSOLDIER_MOVE_DISTANCE = 4;
    static final int SUPERSOLDIER_JUMP_DISTANCE = 3;
    static final int SUPERSOLDIER_ATTACK_DISTANCE = 8;

    static final int MAX_MONSTERS = 3;
    static final int MAX_MOVE_LENGTH = 2;
    static final int MAX_JUMP_LENGTH = 3;

    static final BasicCharacter randomPlayerCharacter() {
        BasicCharacter plChar;
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            plChar = new Guerrilla(GUERRILLA_HEALTH, GUERRILLA_POWER, GUERRILLA_MOVE_DISTANCE, GUERRILLA_JUMP_DISTANCE, GUERRILLA_ATTACK_DISTANCE);
        } else if (random.nextInt(2) >= 5) {
            plChar = new Soldier(SOLDIER_HEALTH, SOLDIER_POWER, SOLDIER_MOVE_DISTANCE, SOLDIER_JUMP_DISTANCE, SOLDIER_ATTACK_DISTANCE);
        } else {
            plChar = new SuperSoldier(SUPERSOLDIER_HEALTH, SUPERSOLDIER_POWER, SUPERSOLDIER_MOVE_DISTANCE, SUPERSOLDIER_JUMP_DISTANCE, SUPERSOLDIER_ATTACK_DISTANCE);
        }
        if (plChar.canMoveToPosition()) {
            ((Moving) plChar).moveToPosition(new Point(0, 0));
        }
        return plChar;
    }

    static final BasicMonster[] randomMonsterCharacter() {
        Random random = new Random();
        BasicMonster[] monstersArray = new BasicMonster[random.nextInt(MAX_MONSTERS) + MAX_MONSTERS];
        for (int i = 0; i < monstersArray.length; i++) {
            BasicMonster BM;
            if (random.nextInt(2) == 0) {
                BM = new Ork(random.nextInt(60) + 10, random.nextInt(50) + 10, random.nextInt(1) + 1, 0);
            } else if (random.nextInt(2) >= 5) {
                BM = new BigOrk(random.nextInt(90) + 10, random.nextInt(70) + 10, random.nextInt(2) + 1, 0);
            } else if (random.nextInt(2) >= 10) {
                BM = new BigOrk(random.nextInt(120) + 10, random.nextInt(100) + 10, random.nextInt(2) + 1, 2);
            } else {
                BM = new MegaOrk(random.nextInt(150) + 10, random.nextInt(130) + 10, random.nextInt(2) + 1, 3);
            }
            monstersArray[i] = BM;
        }
        return monstersArray;
    }

    BasicCharacter playerCharacter;
    BasicMonster[] monsters;
    Gameplay gameplay;

    public ServiceImpl() {
        this.playerCharacter = randomPlayerCharacter();
        this.monsters = randomMonsterCharacter();
        this.gameplay = this.new Gameplay();
        this.gameplay.iterResult();
    }


    @Override
    public BasicCharacter getPlayerCharacter() {
        return this.playerCharacter;
    }

    @Override
    public BasicMonster[] getMonster() {
        return this.monsters;
    }

    @Override
    public void nextIteration() {
        this.gameplay.calcNextIteration();
    }

    class Gameplay {
        Moving[] movingMonsters = new Moving[monsters.length + 1];

        Gameplay() {
            Random random = new Random();
            for (int i = 0; i < monsters.length; i++) {
                if (monsters[i].canMoveToPosition()) {
                    int x = random.nextInt(MAX_MOVE_LENGTH);
                    int y = random.nextInt(MAX_MOVE_LENGTH);
                    Moving moving = (Moving) monsters[i];
                    moving.moveToPosition(new Point(x, y));
                    movingMonsters[i] = moving;
                }
            }
            movingMonsters[movingMonsters.length - 1] = (Moving) playerCharacter;
        }

        void calcNextIteration() {
            doAttack();
            doMove();
            iterResult();
        }

        void doAttack() {
            for (int i = 0; i < movingMonsters.length - 1; i++) {
                Moving moving1 = movingMonsters[i];
                Moving moving2 = movingMonsters[i + 1];
                if (moving1.getCharacterPosition().distance(moving2.getCharacterPosition().getX(), moving2.getCharacterPosition().getY()) <= ((BasicMonster) moving1).getAttackDistance()) {
                    ((BasicMonster) moving1).attack(((BasicMonster) moving2));
                }
            }
        }

        void doMove() {
            Random random = new Random();
            for (int i = 0; i < movingMonsters.length; i++) {
                Moving moving = movingMonsters[i];
                int step = random.nextInt(2) == 0 ? -1 : 1;
                moving.moveToPosition(new Point(moving.getCharacterPosition().x + random.nextInt(MAX_MOVE_LENGTH) * step, moving.getCharacterPosition().y + random.nextInt(MAX_MOVE_LENGTH) * step));
            }
        }

        void iterResult() {
            for (int i = 0; i < movingMonsters.length; i++) {
                BasicMonster BM = (BasicMonster) movingMonsters[i];
                System.out.println(BM.getClass().getSimpleName() + " with health " + BM.getHealth() + " at position " + movingMonsters[i].getCharacterPosition())
                ;
            }
        }
    }
}