package Algorithm_Test.src.BaekJoon.조건문;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        if (A % 400 == 0) {
            System.out.println(1);
        } else if (A % 100 == 0) {
            System.out.println(0);

        } else if (A % 4 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
