import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
    public AnonymousClassListener() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("Bction");
                else b.setText("Action");
                setTitle(b.getText());
            }
        });

        c.add(btn);
        setSize(350, 150);
        setLocation(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}