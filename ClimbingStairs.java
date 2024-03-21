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

    public static int climbStairs(int n) {
        if (n<= 2){
            return n;
        }
        return climbStairs(n- 1)+ climbStairs(n- 2);
    }
}
