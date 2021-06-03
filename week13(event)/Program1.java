import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program1 extends JFrame {
    public Program1() {
        setTitle("Program1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());

        setSize(250, 250);
        setLocation(500, 500);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    public class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            Component c = (Component)e.getSource();

            int keyCode = e.getKeyCode(); // keyCode 받고 Text로 변환해야 한다.
            char keyChar = e.getKeyChar();
            String keyText = e.getKeyText(keyCode);

            if (keyText.equals("F1")) {
                c.setBackground(Color.GREEN);
            }

            if (keyChar == '%') {
                c.setBackground(Color.YELLOW);
            }
        }
    }

    public static void main(String[] args) {
        new Program1();
    }
}