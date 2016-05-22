package New_HWs.SimpleGame.api.characters.features;

import java.awt.*;

public interface Moving {

    void moveToPosition(Point point);

    boolean canMoveToPosition(Point point);

    Point getCharacterPosition();
}