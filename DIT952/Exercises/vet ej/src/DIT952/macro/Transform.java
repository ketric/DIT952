package DIT952.macro;
import DIT952.polygon.*;

/**
 * Created by Niklas on 2016-03-02.
 */
@FunctionalInterface
public interface Transform {
	public IPolygon transform (IPolygon polygon);
}
