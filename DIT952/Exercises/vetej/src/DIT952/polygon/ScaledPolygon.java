package DIT952.polygon;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class ScaledPolygon extends AbstractPolygon implements
		IPolygon {
	private AbstractPolygon base;
	double xFactor, yFactor;

	ScaledPolygon(AbstractPolygon base, double xFactor,
			double yFactor) {
		this.base = base;
		this.xFactor = xFactor;
		this.yFactor = yFactor;
	}

	@Override
	public IPolygon translate(int x, int y) {
		return new TranslatedPolygon(this, x, y);
	}

	@Override
	public IPolygon rotate(double radians) {
		return new RotatedPolygon(this, radians);
	}

	@Override
	public IPolygon scale(double x, double y) {
		xFactor = x;
		yFactor = y;
		return this;
	}

	//Scales the point
	protected void manipulatePoint(Point center, Point point) {
		double newX = (point.x - center.x) * xFactor
				+ center.x;
		double newY = (point.y - center.y) * yFactor
				+ center.y;
		point.x = (int) newX;
		point.y = (int) newY;
	}

	public List<Point> getPoints() {
		return getPointsWithBase(base);
	}

	@Override
	public Point getCenterPoint() {
		return base.getCenterPoint();
	}
}
