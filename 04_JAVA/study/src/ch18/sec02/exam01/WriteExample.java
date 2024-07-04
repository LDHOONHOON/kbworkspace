package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
//    try 문 안쪽에 출력 스트림을 만들어주면 close할 필요 없이 자동으로 닫힌다
    public static void main(String[] args) {
        try {
            OutputStream os =
                    new FileOutputStream("/Users/kbworkspace/04_JAVA/study/src/test1.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}