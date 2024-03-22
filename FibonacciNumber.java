/**
 * 功能描述: 斐波那契数
 *
 * @author hezhan
 * @date 2024/3/22 11:26
 */
public class FibonacciNumber {
    public static void main(String[] args) {
       System.out.println(fib(10));
    }

    private static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int[] dp = new int[n+ 1];
        dp[1] = 1;
        dp[0] = 0;
        for(int i=2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
