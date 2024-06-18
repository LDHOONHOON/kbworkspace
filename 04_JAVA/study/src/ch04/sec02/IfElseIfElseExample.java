package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

//        조건이 여러개일 경우 else if는 무한정 추가 가능하지만 if와 else는 한개씩 사용해야한다
        if(score>=90) {
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A입니다.");
        } else if(score>=80) { // 80 <= score < 90일 경우
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if(score>=70) { // 70 <= score < 80일 경우
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else { // score < 70일 경우
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
