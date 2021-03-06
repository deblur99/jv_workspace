import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
    public InnerClassListener() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(350, 150);
        setLocation(300, 300);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if (b.getText().equals("Action"))
                b.setText("Bction");
            else
                b.setText("Action");
            setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }
}