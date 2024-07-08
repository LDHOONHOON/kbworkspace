package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "/Users/ldh/kbworkspace/kbworkspace/test1.jpg";
        String targetFileName = "/Users/ldh/kbworkspace/kbworkspace/test2.jpg";

        try(
                InputStream is = new FileInputStream(originalFileName);
                OutputStream os = new FileOutputStream(targetFileName);
        ) {

            byte[] data = new byte[1024];
            while (true) {
//                최대 배열의 크기인 1024바이트 읽기
                int num = is.read(data); // 최대 1024바이트 읽기
                if (num == -1) break; // 파일을 다 읽으면 while 문 종료
                os.write(data, 0, num); // 읽은 데이터 파일에 쓰기
            }
            os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
            System.out.println("복사가 잘 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
