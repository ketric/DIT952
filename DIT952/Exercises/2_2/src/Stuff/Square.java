package Stuff;
import java.awt.*;

import static java.lang.System.out;

public class Square extends Polygon {

    public Square (int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x - 20, centerPoint.y - 10, 40, 20);
    }

    @Override
    public String toString() {
        return "Square";
    }

    /*@Override
    public boolean overlaps(Polygon s){
        out.print("Square.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(s.toString());
        return true;
    }
    */
    public boolean overlaps(Square s){
        out.print("Square.overlaps: ");
        out.print(this.toString());
        out.print(" vs ");
        out.println(s.toString());
        return true;
    }
}
