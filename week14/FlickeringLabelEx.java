import java.awt.*;
import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx() {
        setTitle("Flickering Label Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        FlickeringLabel fLabel = new FlickeringLabel("Flickering", 500);
        JLabel label = new JLabel("Non Flickering");
        FlickeringLabel fLabel2 = new FlickeringLabel("Flickering", 300);

        c.add(fLabel);  
        c.add(label);
        c.add(fLabel2);

        setSize(300, 150);
        setLocation(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}
