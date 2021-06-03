import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
    private JLabel la = new JLabel("No Mouse Event");

    public MouseListenerAllEx() {
        setTitle("MouseListener & MouseMotionListener Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addMouseListener(new MyMouseListener());
        c.addMouseMotionListener(new MyMouseListener());

        c.add(la);

        setSize(250, 250);
        setLocation(500, 500);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
        }

        public void mouseReleased(MouseEvent e) {
            la.setText("mouseReleased ("+e.getX()+", "+e.getY()+")");
        }

        public void mouseExited(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseDragged(MouseEvent e) {
            la.setText("mouseDragged ("+e.getX()+", "+e.getY()+")");
        }

        public void mouseMoved(MouseEvent e) {
            la.setText("mouseMoved ("+e.getX()+", "+e.getY()+")");
        }

        public void mouseClicked(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.CYAN);
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}