import java.io.*;
public class output_example {
    public static void main(String[] args) {
        String data = "한글 파일 출력";
        try {
            FileOutputStream o = new FileOutputStream("week11(fileio)/output.txt");
            OutputStreamWriter stream = new OutputStreamWriter(o, "UTF8");
            stream.write(data);
            stream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
