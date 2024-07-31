package Algorithm_Test.src.BaekJoon.대소문자_바꾸기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            // charAt() : 문자열에서 문자 하나만 가져오는 함수
            b = a.charAt(i);

            // Character.isUpperCase() : 대문자인지 확인
            if (Character.isUpperCase(b)) {
                // Character.toLowerCase() : 소문자로 변환
                answer += Character.toLowerCase(b);
            } else {
                // Character.toUpperCase() : 대문자로 변환
                answer += Character.toUpperCase(b);
            }
        }
        System.out.println(answer);
    }
}
