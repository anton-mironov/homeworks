package New_HWs.SimpleGame.api.characters.features;

import java.awt.*;

public interface Moving {

    void moveToPosition(Point point);

    Point getCharacterPosition();
}