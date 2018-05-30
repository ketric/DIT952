package Stuff;
import java.awt.*;
import javax.swing.*;
import java.util.*;

import static java.lang.System.out;

public class DrawPolygons extends Component {
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();

        polygons.add(new Square(100,100));
        polygons.add(new Triangle(150,150));
        polygons.add(new Rectangle(100,200));
    }
    @Override
    public void paint(Graphics g){

        for (Polygon p : polygons){
            p.paint(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

        out.println(polygons.polygons.get(0).toString());
        Square s = new Square(10, 10);
        Rectangle r = new Rectangle(20,20);
        Polygon p = new Triangle(30,30);
        s.overlaps(r);
        s.overlaps(s);
        p.overlaps(p);
        p.overlaps(s);

    }
}
