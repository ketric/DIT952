package DIT952.macro;

import DIT952.polygon.*;

/**
 * Created by Niklas on 2016-03-02.
 */
public class ExampleTransform implements Transform {
	public IPolygon transform(IPolygon polygon){
		return polygon.scale(1,2);
	}
}
