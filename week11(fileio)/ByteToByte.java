import java.io.*;
public class ByteToByte {
    public static void main(String[] args) {
        try {
            // 파일 크기 가져오기
            File file = new File("week11(fileio)/lenna.png");
            
            // 입출력 스트림 선언
            InputStream in = new FileInputStream("week11(fileio)/lenna.png");
            OutputStream out = new FileOutputStream("week11(fileio)/lenna_single.png");
            
            // 파일 크기만큼 byte형 배열 생성 후 파일 읽기
            byte[] arr = new byte[(int)file.length()];
            in.read(arr);

            // 1바이트씩 파일 쓰기
            for (int i = 0; i < (int)file.length(); i++) {
                out.write(arr[i]);
            }

            // 파일 객체 종료
            out.close();
            in.close();
        }
        // 예외
        catch (IOException e) {
            e.getStackTrace();
        }
    }
}