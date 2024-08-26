package Algorithm_Test.src.BaekJoon.대소문자_바꾸기;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        char[] text = sc.next().toCharArray();
        char[] newText = new char[text.length];
        // System.out.println(Arrays.toString(text));

        for (int i = 0; i < text.length; i++) {
            if (text[i] <= 90) {                                // 대문자 Z 의 ASCII 코드인 90 을 기준으로 이보다 작은수는 대문자.
                newText[i] = (char)(text[i] + 32);              // ASCII 코드에서 대문자와 소문자는 32 간격 차이를 갖음.
            }
            else if (text[i] >= 97) {                           // 소문자 a 의 ASCII 코드인 97 을 기준으로 이보다 큰수는 소문자.
                newText[i] = (char)(text[i] - 32);              // ASCII 코드에서 대문자와 소문자는 32 간격 차이를 갖음.
            }
        }
        // System.out.println(Arrays.toString(newText));           // TEST PRINT

        for (int i = 0; i < newText.length; i++) {
            System.out.print(newText[i]);
        }
    }
}

//public class Main { // public 클래스 Main 선언. 이 클래스가 프로그램의 진입점
//    public static void main(String[] args) { // main 메서드: 프로그램의 시작 지점
//        Scanner sc = new Scanner(System.in); // Scanner 객체 생성, 사용자 입력을 받기 위해 사용
//
//        String a = sc.next(); // 사용자로부터 문자열을 입력받아 변수 a에 저장
//        char b; // 변환할 문자를 저장할 임시 변수
//        String answer = ""; // 변환된 문자열을 저장할 변수. 빈 문자열로 초기화
//
//        // 입력된 문자열 a의 각 문자를 순차적으로 처리하기 위한 for 루프
//        for (int i = 0; i < a.length(); i++) {
//            // charAt() 메서드를 사용하여 문자열 a의 i번째 문자를 가져옴
//            b = a.charAt(i);
//
//            // Character.isUpperCase() 메서드를 사용하여 문자가 대문자인지 확인
//            if (Character.isUpperCase(b)) {
//                // 대문자일 경우, Character.toLowerCase() 메서드를 사용하여 소문자로 변환하고 answer에 추가
//                answer += Character.toLowerCase(b);
//            } else {
//                // 소문자일 경우, Character.toUpperCase() 메서드를 사용하여 대문자로 변환하고 answer에 추가
//                answer += Character.toUpperCase(b);
//            }
//        }
//
//        // 변환된 문자열을 출력
//        System.out.println(answer);
//    }
//}

// 강사님 답지
//import java.util.Scanner; // Scanner 클래스를 사용하기 위해 임포트
//
//public class Main { // 공용 클래스 Main 선언
//    public static void main(String[] args) { // 프로그램의 진입점인 main 메서드 정의
//        Scanner sc = new Scanner(System.in); // Scanner 객체 생성, 사용자 입력을 받기 위해 사용
//        String str = sc.next(); // 사용자로부터 문자열을 입력받아 변수 str에 저장
//
//        // 문자열을 문자 배열로 변환
//        char[] ans = str.toCharArray(); // 문자열 str을 문자 배열로 변환하여 ans에 저장
//
//        // 문자열의 각 문자를 순차적으로 처리하기 위한 for 루프
//        for(int i = 0; i < str.length(); i++) {
//            // 만약 현재 문자가 소문자라면
//            if('a' <= ans[i] && ans[i] <= 'z') {
//                // 소문자를 대문자로 변환
//                // 'a'와 'A'의 아스키 값 차이를 이용
//                // 'b' - 'a' = 1 -> 'A' + 1 -> 'B'
//                ans[i] = (char)('A' + (ans[i] - 'a'));
//            }
//            // 만약 현재 문자가 대문자라면
//            else {
//                // 대문자를 소문자로 변환
//                // 'A'와 'a'의 아스키 값 차이를 이용
//                ans[i] = (char)('a' + (ans[i] - 'A'));
//            }
//        }
//
//        // 변환된 문자 배열을 문자열로 출력
//        System.out.println(ans); // 문자 배열 ans를 문자열로 변환하여 출력
//    }
//}




//package Algorithm_Test.src.BaekJoon.대소문자_바꾸기;
//
//이 코드는 Algorithm_Test/src/BaekJoon/대소문자_바꾸기 패키지에 속해 있음을 나타냅니다.
//import java.util.Scanner;
//
//Scanner 클래스를 사용하여 사용자 입력을 받을 수 있게 합니다.
//public class Main {
//
//    Main이라는 이름의 공용 클래스를 선언합니다. 이 클래스가 프로그램의 진입점이 됩니다.
//    public static void main(String[] args) {
//
//        프로그램이 실행될 때 가장 먼저 호출되는 main 메서드를 정의합니다. String[] args는 명령줄 인수를 받기 위한 매개변수입니다.
//                Scanner sc = new Scanner(System.in);
//
//        Scanner 객체를 생성하여 System.in(표준 입력)에서 사용자 입력을 받을 준비를 합니다.
//        String a = sc.next();
//
//        사용자가 입력한 단어를 String 변수 a에 저장합니다. next() 메서드는 공백으로 구분된 단어를 읽습니다.
//        char b;
//
//        변환할 개별 문자를 저장할 char 변수 b를 선언합니다.
//        String answer = "";
//
//        변환된 결과 문자열을 저장할 String 변수 answer를 빈 문자열로 초기화합니다.
//        for (int i = 0; i < a.length(); i++) {
//
//            for 루프를 사용하여 문자열 a의 각 문자를 순차적으로 처리합니다. i는 인덱스 변수입니다.
//                    b = a.charAt(i);
//
//            charAt(i) 메서드를 사용하여 문자열 a의 i번째 문자를 가져와 b에 저장합니다.
//            if (Character.isUpperCase(b)) {
//
//                Character.isUpperCase(b) 메서드를 사용하여 b가 대문자인지 확인합니다.
//                        answer += Character.toLowerCase(b);
//
//                b가 대문자일 경우 Character.toLowerCase(b) 메서드를 사용하여 소문자로 변환한 후 answer 문자열에 추가합니다.
//            } else {
//
//                b가 소문자일 경우를 처리하는 else 블록입니다.
//                        answer += Character.toUpperCase(b);
//
//                Character.toUpperCase(b) 메서드를 사용하여 b를 대문자로 변환한 후 answer 문자열에 추가합니다.
//            }
//
//            if-else 블록의 끝을 나타냅니다.
//        }
//
//        for 루프의 끝을 나타냅니다.
//                System.out.println(answer);
//
//        변환된 결과 문자열을 콘솔에 출력합니다.