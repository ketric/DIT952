package DIT952.polygons.polygon;

import java.awt.*;

public interface IPolygon {
    void paint(Graphics g);
    void updateCenter(int newX, int newY);
    Point getCenter();
}
