package Stuff;
import java.awt.*;

import static java.lang.System.out;

public class Rectangle extends Polygon {

    public Rectangle (int x, int y){
        super(x,y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x - 20, centerPoint.y - 10, 40, 20);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    /*@Override
    public boolean overlaps(Polygon r){
        out.print("Rectangle.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(r.toString());
        return true;
    }*/
    public boolean overlaps(Rectangle r){
        out.print("Rectangle.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(r.toString());
        return true;
    }
}
