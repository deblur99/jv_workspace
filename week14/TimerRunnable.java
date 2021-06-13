import java.awt.*;
import javax.swing.*;

class TimerRunnable extends Thread implements Runnable {
    // for 35p example. when you test before things, disable below code
    private JLabel timerLabel;
    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    // main
    int n = 0;

    @Override
    public void run() {
        while (true) {
            // for 35p example. when you test before things, disable below code
            timerLabel.setText(Integer.toString(n));

            //System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
