package Stuff;
import java.awt.*;

import static java.lang.System.out;

/**
 * Created by Jon on 2017-01-20.
 */
public abstract class Polygon {
    protected Point centerPoint;

    Polygon(int x, int y){
        centerPoint = new Point(x,y);
    }

    public abstract void paint (Graphics g);

    @Override
    public abstract String toString();

    public boolean overlaps(Polygon p){
            out.print("Polygon.overlaps: ");
            out.print(this.toString());
            out.print(" vs ");
            out.println(p.toString());
            return true;
    }
}