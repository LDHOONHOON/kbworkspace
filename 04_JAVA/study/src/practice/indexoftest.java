package practice;

public class indexoftest {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

//        포함되는 경우
//        int index = subject.indexOf("프로그래밍");
        int index = subject.indexOf("냉덩훈"); //포함되지 않는 경우
        if (index == -1) {
            System.out.println("포함되어 있지 않은 경우");
            //포함되어 있지 않은 경우
        } else {
            System.out.println("포함되어 있는 경우");
            // 포함되어있는 경우
        }
    }
}
