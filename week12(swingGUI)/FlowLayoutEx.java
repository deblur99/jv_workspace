import java.awt.*;
import javax.swing.*;
public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(String title) {
        super(title);

        setSize(300, 400);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        Container c = getContentPane();

        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mult"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));

        setVisible(true);
    }
}
