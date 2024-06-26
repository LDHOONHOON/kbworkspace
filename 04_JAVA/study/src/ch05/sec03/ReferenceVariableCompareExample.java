package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; //배열 변수 arr1 선언
        int[] arr2; //배열 변수 arr1 선언
        int[] arr3; //배열 변수 arr1 선언

        arr1 = new int[] { 1, 2, 3 };
        arr2 = new int[] { 1, 2, 3 };
//        arr2의 주소값을 arr3에 할당
        arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입

        // == 은 객체의ㅐ 주소값을 비교
        // new을 할때마다 새롭게 객체의 주소가 할당되기 때문에 arr1과 arr2의 주소값은 다르다.
        System.out.println(arr1 == arr2);
//        arr3이 arr2의 주소값을 할당받았기 때문에 둘의 주소값은 같다.
        System.out.println(arr2 == arr3);
    }
}
