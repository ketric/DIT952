package DIT952.polygon;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class TranslatedPolygon extends AbstractPolygon implements
		IPolygon {
	private AbstractPolygon base;
	int xMove;
	int yMove;

	TranslatedPolygon(AbstractPolygon polygonToTranslate,
			int x, int y) {
		this.base = polygonToTranslate;
		this.xMove = x;
		this.yMove = y;
	}

	@Override
	public IPolygon translate(int x, int y) {
		xMove = x;
		yMove = y;
		return this;
	}

	@Override
	public IPolygon rotate(double radians) {
		return new RotatedPolygon(this, radians);
	}

	@Override
	public IPolygon scale(double x, double y) {
		return new ScaledPolygon(this, x, y);
	}

	@Override
	public List<Point> getPoints() {
		// the points from base are already defensively
		// copied
		return getPointsWithBase(base);
	}

	//Translates the point
	@Override
	protected void manipulatePoint(Point center, Point p) {
		p.x += this.xMove;
		p.y += this.yMove;
	}

	@Override
	public Point getCenterPoint() {
		// the centerpoint from base is already defensively
		// copied
		Point baseCenter = base.getCenterPoint();
		baseCenter.x += xMove;
		baseCenter.y += yMove;
		return baseCenter;
	}
}
