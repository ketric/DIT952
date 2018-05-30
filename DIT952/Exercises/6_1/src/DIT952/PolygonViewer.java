package DIT952;

import javax.swing.*;
import java.awt.event.MouseListener;

public class PolygonViewer extends JFrame implements AnimateListener {

    public PolygonViewer() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(30, 30, 300, 300);
        setVisible(true);
    }

    @Override
    public void actOnUpdate() {
        repaint();
    }
}
