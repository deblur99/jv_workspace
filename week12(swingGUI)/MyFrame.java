import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 Swing Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenu());

        setSize(300, 300);
        setLocation(500, 500);
        
        // 프레임에 창 하나 만들기
        Container contentPane = getContentPane();

        // 배경 및 오브젝트 배열 설정
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        // 버튼 추가
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setVisible(true);
    }

    private JMenuBar createMenu() {
        // 메뉴바 추가
        JMenuBar mBar = new JMenuBar();

        // 바깥쪽 메뉴 추가
        JMenu screenMenu = new JMenu("Screen");

        // 안쪽 메뉴 추가
        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("Exit"));

        mBar.add(screenMenu);

        return mBar;
    }
}