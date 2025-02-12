package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin: coins){
                if (i >= coin) {
                    dp[i] = Math.min(dp[i],1 + dp[i-coin]);
                }
            }
        }
        if (dp[amount] != amount + 1) return dp[amount];
        return -1;

    }
}
