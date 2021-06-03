import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Program2 extends JFrame {
    // 클래스 내 전역 변수 선언
    private JLabel la = new JLabel("Hello");

    public Program2() {
        setTitle("Program2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        // EventListener는 Container에 추가해야 한다. (Component에 추가 X)
        c.addKeyListener(new MyKeyListener());
        c.setLayout(null);

        la.setSize(100, 20);
        la.setLocation(50, 50);
        la.setVisible(true);
        c.add(la);

        setSize(500, 500);
        setLocation(500, 500);
        setVisible(true);
        
        c.setFocusable(true);
        c.requestFocus();
    }

    public class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (e.getKeyText(keyCode).equals("Up")) {
                la.setLocation(la.getX(), la.getY()-10);
            }
            else if (e.getKeyText(keyCode).equals("Down")) {
                la.setLocation(la.getX(), la.getY()+10);
            }
            else if (e.getKeyText(keyCode).equals("Left")) {
                la.setLocation(la.getX()-10, la.getY());
            }
            else if (e.getKeyText(keyCode).equals("Right")) {
                la.setLocation(la.getX()+10, la.getY());
            }
        }
    }

    public static void main(String[] args) {
        new Program2();
    }
}
