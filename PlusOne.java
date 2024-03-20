import java.util.Arrays;

/**
 * 功能描述: 加一
 *
 * @author hezhan
 * @date 2024/3/20 11:15
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] nums = {9};
        nums = plusOne(nums);
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (index >= 0 && digits[index] == 9) {
            digits[index] = 0;
            index--;
        }
        if (index >= 0) {
            digits[index]++;
            return digits;
        } else {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
    }
}
