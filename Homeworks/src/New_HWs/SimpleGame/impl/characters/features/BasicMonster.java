package New_HWs.SimpleGame.impl.characters.features;

import New_HWs.SimpleGame.api.characters.*;
import New_HWs.SimpleGame.api.characters.features.*;
import New_HWs.SimpleGame.impl.characters.BasicCharacter;

import java.awt.*;

public abstract class BasicMonster extends BasicCharacter implements Moving, New_HWs.SimpleGame.api.characters.features.BasicMonster {

    protected int power;
    private int moveDistance;
    private int jumpDistance;
    private int attackDistance;
    private Point coordinates;

    public BasicMonster(double health, int power, int moveDistance, int jumpDistance) {
        this(health, power, moveDistance, jumpDistance, 1);
    }

    public BasicMonster(double health, int power, int moveDistance, int jumpDistance, int attackDistance) {
        super(health);
        this.power = power;
        this.moveDistance = moveDistance;
        this.jumpDistance = jumpDistance;
        this.attackDistance = attackDistance;
    }

    @Override
    public final boolean canDoAction(BasicCharacterAction action) {
        if (canFlyThruPoints(action.getActionTarget()) && !canFlyThruPoints(this)) {
            return false;
        }
        return true;
    }

    public final void attack(New_HWs.SimpleGame.api.characters.BasicCharacter character) {
        getAttack(character).doAction();
    }

    protected abstract BasicCharacterAction getAttack(New_HWs.SimpleGame.api.characters.BasicCharacter character);

    public final void moveToPosition(Point point) {
        this.coordinates = point;
    }

    public final boolean canMoveToPosition(Point point) {
        if (this.coordinates == null) {
            return true;
        } else {
            return this.coordinates.distance(point.getX(), point.getY()) < this.moveDistance;
        }
    }

    public final boolean canJumpToPosition(Point point) {
        if (this.coordinates == null) {
            return true;
        } else {
            return this.coordinates.distance(point.getX(), point.getY()) < this.jumpDistance;
        }
    }

    @Override
    public int getAttackDistance() {
        return this.attackDistance;
    }

    @Override
    public Point getCharacterPosition() {
        return this.coordinates;
    }
}