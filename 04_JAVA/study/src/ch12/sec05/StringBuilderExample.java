package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC") // 0번째 인덱스에 "ABC" 추가, "ABCDE"
                .delete(3, 4) .toString(); // 인덱스 3번째 글자 삭제, "ABCDE"
        System.out.println(data); // StringBulider 객체를 String으로 변환
    }
}
