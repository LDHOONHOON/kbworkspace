package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {

//        String에서 Primitive type으로 변환시 "타입.parse타입"의 형태로 변환
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);


//        Primitive type에서 String으로 변환시 String.valueOf()를 사용
        String str1 = String.valueOf(value1);
        String str2 = String.valueOf(value2);
        String str3 = String.valueOf(value3);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
