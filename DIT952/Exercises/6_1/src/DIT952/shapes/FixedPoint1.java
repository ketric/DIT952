package DIT952.shapes;

import java.awt.Point;

public class FixedPoint1 {
	private int x;
	private int y;
	
	public FixedPoint1(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public FixedPoint1(Point p){
		x = p.x;
		y = p.y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
//	public FixedPoint1 move(int x, int y){
//		return new FixedPoint1(x, y);
//	}
	
	public FixedPoint1 getLocation(FixedPoint1 f){
		return new FixedPoint1(f.getX(), f.getY()); 
	}
	

}
