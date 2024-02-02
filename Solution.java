import java.util.Random;

/**
 * 功能描述: 打乱数组
 *
 * @author hezhan
 * @date 2024/1/30 11:27
 */
public class Solution{
    private final int[] nums;

    private final int n;
    Random random = new Random();
    public Solution(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
    }
    public int[] reset(){
        return nums;
    }
    public int[] shuffle(){
        int[] ans = nums.clone();
        for (int i = 0; i < n; i++) {
            swap(ans, i, i + random.nextInt(n - i));
        }
        return ans;
    }
    void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
}
