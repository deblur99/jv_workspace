import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx() {
        setTitle("Timer Thread Ex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        Thread th = new Thread(new TimerRunnable(timerLabel));
        setSize(300, 170);
        setLocation(500, 500);
        setVisible(true);
        
        th.start();
    }

    public static void main(String[] args) {
        new RunnableTimerEx();
    }
}