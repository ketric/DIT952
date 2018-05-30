package DIT952;

/* This is now all we (can) use from the sub-package */
//import DIT952.polygons.polygon.IDrawablePolygon;
//import DIT952.polygons.polygon.PolygonFactory;


/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT952.shapes package.
 */
import DIT952.polygon.*;
import DIT952.macro.*;

public class DrawPolygons {

    public static PolygonModel initPolygons(){
        PolygonModel polygons = new PolygonModel();

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;

    }//initializer

    public static void main(String[] args) {
        PolygonModel polygons = initPolygons();
        PolygonViewer view = new PolygonViewer();
        view.add(polygons);
        polygons.addListener(view);
        PolygonController controller = new PolygonController(polygons, view);

        Macro macro = new Macro();
        macro.addTransform(new ExampleTransform());
        macro.addTransform(p -> p.rotate(Math.PI/6));
        macro.addTransform(p -> p.translate(10, 7));
        polygons.animate(macro);

    }//main

}//DIT952.DrawPolygons