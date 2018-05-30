package DIT952;

import DIT952.adapter.IPolygon;
import DIT952.adapter.PolygonFactory;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonModel extends JComponent implements Iterable<IPolygon>{
    public ArrayList<IPolygon> polygons;

    public PolygonModel(){
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.createSquare(50, 50));
        polygons.add(PolygonFactory.createTriangle(100,100));
        polygons.add(PolygonFactory.createRectangle(50,150));

    }//constructor

	@Override
	public Iterator<IPolygon> iterator() {
		// TODO Auto-generated method stub
		return polygons.iterator();
	}
	
    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint
    
}
