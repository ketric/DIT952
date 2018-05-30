package DIT952.polygons.polygon;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public abstract class Polygon extends JComponent {
    Point centerPoint;

    Polygon(Point center) {
        this.centerPoint = center;
    }

    Polygon(int x, int y) {
        this(new Point(x, y));
    }

    void updateCenter(int x, int y) {
        this.centerPoint = new Point(x, y);
    }

    Point getCenterPoint() {
        return new Point(centerPoint);
    }

    @Override
    public abstract void paint(Graphics g)//paint
    ;
}
