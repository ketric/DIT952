package DIT952.polygons.polygon;

import java.awt.*;

public class PolygonInformation {
    public static Point getPolygonCenter(Polygon p) {
        return new Point(p.getCenterPoint());
    }
}
