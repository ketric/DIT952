package DIT952;

/* This is now all we (can) use from the sub-package */
//import DIT952.polygons.polygon.IPolygon;
//import DIT952.polygons.polygon.PolygonFactory;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT952.shapes package.
 */
import DIT952.adapter.*;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

public class DrawPolygons extends JComponent {
    public static void main(String[] args) {
        PolygonModel polygons = new PolygonModel();
        PolygonViewer view = new PolygonViewer();
        PolygonController controller = 
        		new PolygonController(polygons, view);
        controller.startProgram();

    }//main

	
}