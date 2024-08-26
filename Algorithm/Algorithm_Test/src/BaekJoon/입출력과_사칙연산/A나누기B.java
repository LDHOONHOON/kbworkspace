package Algorithm_Test.src.BaekJoon.입출력과_사칙연산;

import java.util.Scanner;

public class A나누기B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        sc.close();

        System.out.println(a / b);
    }
}
