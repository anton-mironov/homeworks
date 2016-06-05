package New_HWs.SimpleGame.api.characters;

public interface BasicCharacter {

    double getHealth();

    int getPower();

    void changeHealth(int health);

    void doAction(BasicCharacterAction action);

    boolean canMoveToPosition();

    boolean canDoAction(BasicCharacterAction action);
}