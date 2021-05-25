import java.awt.*;
import javax.swing.*;
public class GridLayoutEx extends JFrame {
    public GridLayoutEx(String title) {
        super(title);
        setSize(300, 400);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3));
        Container c = getContentPane();

        for (int i = 0; i < 12; i++)
            c.add(new JButton(Integer.toString(i + 1)));

        setVisible(true);
    }
}
