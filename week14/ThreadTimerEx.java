import java.awt.*;
import javax.swing.*;

public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("Timer Thread Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();

        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setSize(300, 170);
        setLocation(600, 600);
        setVisible(true);
        
        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
