import java.io.*;
public class BlockCopy {
    public static void main(String[] args) {
        try {
            // 파일 크기 가져오기
            File file = new File("week11(fileio)/lenna.png");

            // 입출력 스트림 선언
            InputStream in = new FileInputStream("week11(fileio)/lenna.png");
            OutputStream out = new FileOutputStream("week11(fileio)/lenna_block.png");

            // 파일 크기만큼 byte형 배열 생성 후 파일 읽기
            byte[] buffer = new byte[(int)file.length()];
            int n = in.read(buffer);

            // 일괄적으로 파일 쓰기
            out.write(buffer, 0, n);

            // 파일 객체 종료
            out.close();
            in.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }
}