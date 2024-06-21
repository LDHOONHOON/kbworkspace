package ch07.sec08.exam01;

public class Car {
    //필드 선언
    //has0a 관계, 클래스가 다른 객체를 가지고 있다
    public Tire tire;

    //메소드 선언
    public void run() {
        //tire 필드에 대입된 객체의 roll() 메소드 호출
        tire.roll();
    }
}
