import javax.swing.JOptionPane;

public class MainApp extends Login implements WhatToDo {
    String ExistBook[] = {};
    String LendingBookList[] = {};
// 존재하는 책과 빌련간 책의 리스트를 정의
    @Override
    public static void WhatToDo() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("책을 빌려가시려면 1번을 책을 반납하시려면 2번을 책을 추가하시려면 3번을 입력해주세요. "));
        if(a == 1){
            ListView();
            SelectBook();
        }
        else if(a == 2){
            LendingListView();
            LendBook();
        }
        else if(a == 3){
            AddBook();
        }
    }
// 무엇을 할지 선택하는 함수
    @Override
    public void ListView() {
        JOptionPane.showMessageDialog(null,ExistBook);
    }
// 현재 존재하는 책을 보여주는 함수
    @Override
    public void SelectBook() {
        String e = JOptionPane.showInputDialog("빌려가시려는 책을 입력해주세요. ");
    }
// 현재 존재하는 책을 고르는 함수
    @Override
    public void AddBook() {
        String c = JOptionPane.showInputDialog("추가하시려는 책을 입력해주십시오. ");
        for(int i = 0; i <= 100; i++){
            ExistBook[i] = c;
        }

    }
// 책을 추가하는 함수
    @Override
    public static void Exit() {
        String b = JOptionPane.showInputDialog("더 이상의 용무가 없다면 Q를 입력해주세요. ");
        do{
            WhatToDo();
        }while(b == "Q");
    }
// 프로그램에서 나가기 위한 함수
    @Override
    public void LendingListView() {
        JOptionPane.showMessageDialog(null,LendingBookList);
    }
// 빌린 책의 리스트를 보여주는 함수
    @Override
    public void LendBook() {
        String f = JOptionPane.showInputDialog("반납하시려는 책을 입력해주세요.");
    }

    public static void main(String[] args) {
        Login member = new Login();
        member.login();
        WhatToDo();
        Exit();
    }
}
// 빌린 책을 반납하기 위한 함수