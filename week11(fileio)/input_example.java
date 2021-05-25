// 1) Reader, FileReader, IOException 가져오기
import java.io.*;
public class input_example {
    public static void main(String[] args) {
        try {
            // FileReader는 char 스트림이고, InputStreamReader는 byte 스트림
            FileInputStream i = new FileInputStream("week11(fileio)/input.txt");
            InputStreamReader in = new InputStreamReader(i, "UTF8");

            char[] buffer = new char[1024];

            in.read(buffer);

            System.out.print(buffer);    

            in.close();
        }
        // 5) 예외처리
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}