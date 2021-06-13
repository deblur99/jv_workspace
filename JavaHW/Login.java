import javax.swing.JOptionPane;
public class Login extends Object{
    String ID,PW;
    public Login(){
        this.ID = ID;
        this.PW = PW;

    }
    public void login(){
        String Complete = "로그인이 완료되었습니다! ";
        this.ID = JOptionPane.showInputDialog("아이디를 입력해주세요. ");
        this.PW = JOptionPane.showInputDialog("비밀번호를 입력해주세요. ");
        JOptionPane.showMessageDialog(null,Complete);
    }
}
