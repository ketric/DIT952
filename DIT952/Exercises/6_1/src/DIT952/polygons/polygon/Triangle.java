package DIT952.polygons.polygon;

import java.awt.*;

class Triangle extends Polygon {
    Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
        g.drawLine(centerPoint.x-10, centerPoint.y+10,
                centerPoint.x+10, centerPoint.y+10);
        g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
    }
}
