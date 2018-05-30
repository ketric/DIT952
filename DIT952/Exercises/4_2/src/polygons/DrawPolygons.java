package DIT952.polygons;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends JComponent{
    public ArrayList<Polygon> polygons;
    public boolean direction = true;
    public int ticker = 0;
    public JFrame frame;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(new Square(50,50,this));
        polygons.add(new Triangle(100,100,this));
        polygons.add(new Rectangle(50,150,this));

    }//constructor

    public void update(){
        tickUp();
        updatePolygonCenters(setTranslation());
        setDirection();
   
    }
    private int setTranslation(){
    	return direction ? 10 : -10;
    }
    private void setDirection(){
        if (ticker > 10) {
            direction = !direction;
            resetTicker();
        }
    }

	private void resetTicker() {
		ticker = 0;
	}
    private void updatePolygonCenters(int value){
    	for (Polygon p: polygons){
            p.updateCenter(p.centerPoint.x+value, p.centerPoint.y+value);
        }
    }

    protected void tickUp(){
        ticker++;
    }
    
    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        polygons.frame = frame;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);


        try {
            while (true) {
                Thread.sleep(500);
                polygons.update();
            }
        } catch (InterruptedException e) {}

    }//main

}//DIT952.polygons.DrawPolygons