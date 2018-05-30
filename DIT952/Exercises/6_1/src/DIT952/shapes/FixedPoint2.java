package DIT952.shapes;

import java.awt.Point;

public class FixedPoint2 {
	private Point p;

	public FixedPoint2(){
		p = new Point();
	}
	public FixedPoint2(Point p){
		p = new Point(p);
	}
	public FixedPoint2(int x, int y){
		p = new Point(x,y);
	}
	public int getX(){
		return p.x;
	}
	public int getY(){
		return p.y;
	}
	public Point getLocation(){
		return p.getLocation();
	}
//	public FixedPoint2 move(int x, int y){
//		return new FixedPoint2(x, y);
//	}
//	
}
