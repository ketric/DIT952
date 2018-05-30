package DIT952.polygon;

import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
public interface IPolygon {
    public IPolygon translate(int x, int y);
    public IPolygon rotate(double radians);
    public IPolygon scale(double x, double y);

    public Point getCenterPoint();

    public void paint(Graphics g);
}
