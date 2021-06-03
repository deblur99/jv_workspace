import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerEx extends JFrame {
    private JLabel la = new JLabel("hello");
    public MouseListenerEx() {
        setTitle("Mouse event listener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);
        setSize(250, 250);
        setLocation(500, 500);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }

        /*
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        */
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
