package DIT952.adapter;

import DIT952.shapes.*;
import DIT952.shapes.Polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-21.
 */
/* package-private */ class PolygonWrapper implements IPolygon {
    private Polygon wrappedPolygon;

    PolygonWrapper(Polygon toBeWrapped) {
        this.wrappedPolygon = toBeWrapped;
    }

    @Override
    public void paint(Graphics g) {
        wrappedPolygon.paint(g);
    }

    /* This is where the magic happens */
    @Override
    public void updateCenter(int newX, int newY) {
        Point oldCenter = wrappedPolygon.getCenterPoint();
        wrappedPolygon.translate(newX - oldCenter.x, newY - oldCenter.y);
    }

    @Override
    public Point getCenter() {
        return wrappedPolygon.getCenterPoint();
    }
}
