package DIT952.polygon;

import java.util.*;
import java.util.List;
import java.awt.*;

import javax.swing.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(0,0));
		points.add(new Point(100,0));
		points.add(new Point(0,100));
		AbstractPolygon p = new BasePolygon(points);
		AbstractPolygon translatedP = new TranslatedPolygon(p, 10, 0);
		
		JFrame frame = new JFrame();
		frame.add(translatedP);
//		frame.setPreferredSize(new Dimension(300, 300));
		frame.setVisible(true);
		frame.setBounds(30, 30, 300, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		
	}
		
}
