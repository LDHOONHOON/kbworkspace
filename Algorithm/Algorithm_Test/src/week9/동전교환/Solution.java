package Algorithm_Test.src.week9.동전교환;

import java.util.*;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[0] = 0;

        for (int i = 0; i <= dp.length; i++) {
            for(int coin : coins) {
                if(i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] ==Integer.MAX_VALUE-1 ? -1 : dp[amount];
    }
}

// 제한사항 다른 버전, 주석 다른 버전

import java.util.*;
class Solution {
    public int solution(int[] coins, int amount) {
        // dp 배열 만들고, 최대값-1로 초기화, dp[0]=0
        int [] dp = new int [amount+1];
        int INF = Integer.MAX_VALUE-1;
        Arrays.fill(dp, INF);
        dp[0] = 0;

        // for문으로 dp길이만큼 돌면서
        // coins 값을 돌며 coins를 빼오고
        // i가 코인이상이면, 동전 사용 가능하므로 dp[i] 갱신
        // (dp[i] vs dp[i-coin]+1 비교)
        for (int i=0; i<dp.length; i++){
            for (int coin : coins){
                if(i>=coin){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }


        // 코인 못만들면 (최대값 갱신 못하면) -1
        // 아니면 dp[amount] 리턴
        return dp[amount]==INF ? -1  : dp[amount];
    }
}