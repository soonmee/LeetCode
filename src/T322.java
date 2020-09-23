/**
 * 322.零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回-1
 *
 * 示例1：
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例2：
 * 输入: coins = [2], amount = 3
 * 输出: -1
 */
class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++){
            dp[i] = amount + 1;
            for (int j = 0; j < coins.length; j++){
                if (i - coins[j] < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        if(dp[amount] > amount)
            return -1;
        return dp[amount];
    }
}

public class T322 {
    public static void main(String[] args) {
        Solution322 solution322 = new Solution322();
        System.out.println(solution322.coinChange(new int[]{1},3));
    }
}