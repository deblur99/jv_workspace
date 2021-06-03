import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTextEx extends JFrame {
    public KeyEventTextEx() {
        setTitle("Key event listener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        setSize(250, 250);
        setLocation(500, 500);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    // void keyPressed(KeyEvent e)에서
    // char getKeyChar: 키보드를 누른 위치의 문자 반환
    // int getKeyCode: 키보드를 누른 위치의 문자에 해당하는 아스키 코드값 반환
    // String getKeyText: 키보드를 누른 위치의 문자에 해당하는 텍스트 반환
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            char ch = e.getKeyChar();
            System.out.println("Key pressed "+ch+", "+code+", "+e.getKeyText(code));
        }

        public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
        }

        public void keyTyped(KeyEvent e) {
            System.out.println("Key typed");
        }
    }

    public static void main(String[] args) {
        new KeyEventTextEx();
    }
}
