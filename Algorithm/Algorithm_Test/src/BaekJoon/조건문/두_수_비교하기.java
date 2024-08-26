package Algorithm_Test.src.BaekJoon.조건문;

import java.util.Scanner;

public class 두_수_비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}




// 오답
//import java.util.Scanner;
//
//public class 두_수_비교하기 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        if(true) {
//            System.out.println(A > B);
//        } else if(false){
//            System.out.println(A < B);
//        } else if(false){
//            System.out.println(A == B);
//        }
//    }
//}
