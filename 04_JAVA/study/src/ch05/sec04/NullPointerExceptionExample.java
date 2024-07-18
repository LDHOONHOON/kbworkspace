package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
            int[] intArray = null;
        //null인 배열이 0번째 값을 할당했긴 때문에 NullPointerException발생
//        intArray[0] = 10;

            String str = null;
            //null로 초기화된 문자열의 길이가 출력했기 때문에 NullPointerException발생
            System.out.println("총 문자 수: " + str.length() );
    }
}
