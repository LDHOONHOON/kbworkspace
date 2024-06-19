package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    Car(String model) {

        // 각 생성자에서 다른생성라를 this로 호출
        this(model, "은색", 250);
    }
    Car(String model, String color) {

        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
