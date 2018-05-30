package DIT952.macro;

import DIT952.polygon.*;
import java.util.*;

/**
 * Created by Niklas on 2016-03-02.
 */
public class Macro implements Transform {
    private List<Transform> transforms = new ArrayList<>();

    public void addTransform(Transform transform){
    	transforms.add(transform);
    }
    
    public IPolygon transform (IPolygon polygon){
    	for(Transform t: transforms){
    		polygon = t.transform(polygon);
    	}
    	return polygon;
    }

}
