package DIT952;

import java.awt.Graphics;

import javax.swing.*;

import DIT952.adapter.IPolygon;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonViewer extends JFrame{
    public PolygonViewer() {//constructor
    }

    public void setupViewFrame (PolygonModel polygons){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(30, 30, 300, 300);
        addFigures(polygons);
        this.setVisible(true);
    }
//    @Override
//    public void paint(Graphics g) {
//        for (IPolygon currentPolygon : polygons) {
//            currentPolygon.paint(g);
//        }
//    }//paint

	private void addFigures(PolygonModel polygons) {
		this.getContentPane().add(polygons);
	}
    
}
