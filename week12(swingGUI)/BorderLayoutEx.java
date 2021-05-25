import java.awt.*;
import javax.swing.*;
public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(String title) {
        super(title);

        setSize(300, 400);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(30, 40));

        Container c = getContentPane();

        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.CENTER);
        c.add(new JButton("mult"), BorderLayout.SOUTH);
        c.add(new JButton("div"), BorderLayout.EAST);
        c.add(new JButton("calculate"), BorderLayout.WEST);

        setVisible(true);
    }
}
