package Stuff;
import java.awt.*;

import static java.lang.System.out;

public class Triangle extends Polygon {

    public Triangle(int x, int y){
        super(x,y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(centerPoint.x, centerPoint.y - 10, centerPoint.x - 10, centerPoint.y + 10);
        g.drawLine(centerPoint.x - 10, centerPoint.y + 10,
                centerPoint.x + 10, centerPoint.y + 10);
        g.drawLine(centerPoint.x + 10, centerPoint.y + 10, centerPoint.x, centerPoint.y - 10);
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    /*@Override
    public boolean overlaps(Polygon t){
        out.print("Triangle.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(t.toString());
        return true;
    }
    */
    public boolean overlaps(Triangle s){
        out.print("Square.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(s.toString());
        return true;
    }
}
