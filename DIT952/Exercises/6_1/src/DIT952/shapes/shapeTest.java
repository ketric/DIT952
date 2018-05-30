package DIT952.shapes;

import java.awt.Point;

public class shapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape mutate = new Triangle(0,0);
		Point p = mutate.getCenterPoint();
		System.out.println(p);
		p.x = 5;
		System.out.println(mutate.getCenterPoint());
		
		Shape mutate2 = new Rectangle(p.x, p.y);

	}
	
	/* To prevent this, we could make getCenterPoint return a new
	 * point with the same coordinates, and in the constructor,
	 * create a new point. Which we already do.
	 */

}
