package ch09.sec05.exam01;

public class A {
    //A의 인스턴스 필드와 메소드
    int field1;
    void method1() { }

    //A의 정적 필드와 메소드
    static int field2;
    static void method2() { }

    //인스턴스 멤버 클래스
    class B {
        void method() {
//A의 인스턴스 필드와 메소드 사용
                    field1 = 10; //(o)
            method1(); //(o)
//A의 정적 필드와 메소드 사용
                    field2 = 10; //(o)
            method2(); //(o)
        }
    }

    //정적 멤버 클래스
    static class C {
        void method() {
            //A의 인스턴스 필드와 메소드 사용
            //static 클래스에서 인스턴스 필드와 메소드는 접근 불가능
//field1 = 10;
//method1();

            //로컬 클래가스 아닌 멤버 클래스에서는 필드 수정이 가능
                    field2 = 10; //(o)
            method2(); //(o)
        }
    }
}
