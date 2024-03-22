/**
 * 功能描述: 爬楼梯
 *
 * @author hezhan
 * @date 2024/3/21 11:09
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(40));
    }

    /**
     * 递归解法
     * @param n 入参
     * @return
     */
    public static int climbStairs(int n) {
        if (n<= 2){
            return n;
        }
        return climbStairs(n- 1)+ climbStairs(n- 2);
    }


    /**
     * 动态规划解法
     * @param n 入参
     * @return
     */
    public static int climbStairsDp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
