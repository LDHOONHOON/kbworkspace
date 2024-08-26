package Algorithm_Test.src.week2.주식가격;

public class Solution {
    // solution 메서드는 주식 가격 배열을 입력받아 가격이 떨어지지 않은 기간을 계산하여 반환합니다.
    public int[] solution(int[] prices) {
        int len = prices.length; // 주식 가격 배열의 길이를 저장
        int[] answer = new int[len]; // 결과를 저장할 배열을 선언하고 초기화

        // 주식 가격 배열을 순회하는 첫 번째 루프
        for (int i = 0; i < len; i++) {
            // 현재 시점 이후의 가격을 비교하는 두 번째 루프
            for (int j = i + 1; j < len; j++) {
                answer[i]++; // 가격이 떨어지지 않은 기간을 1초 증가시킴
                // 현재 가격이 이후 시점의 가격보다 높은 경우 (가격이 떨어진 경우)
                if (prices[i] > prices[j]) {
                    break; // 내부 루프를 종료하여 다음 시점으로 이동
                }
            }
        }
        return answer; // 결과 배열을 반환
    }
}

























