package DIT952;

import DIT952.adapter.IPolygon;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonController {
    private PolygonModel model;
    private PolygonViewer view;
    public int ticker = 0;
    public boolean direction = true;

    PolygonController(PolygonModel model, PolygonViewer view){
        this.model = model;
        this.view = view;
    }

    public void initiateView(){
        view.setupViewFrame(model);
    }
    
    public void addPolygonsToView(){
    	
    }
    public void updatePolygons() {
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p : model) {
            p.updateCenter(p.getCenter().x + value, p.getCenter().y + value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        updateView();
        
    }
    public void animate() {
		try {
            while (true) {
                Thread.sleep(500);
                updatePolygons();
            }
        } catch (InterruptedException e) {
        }
	}
    private void updateView(){
    	view.repaint();
    }
    public void startProgram(){
        initiateView();
        animate();
    }

}
