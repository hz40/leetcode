import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: 最大子数组和
 *
 * @author hezhan
 * @date 2023/12/25 15:36
 */
public class MaximumErasureValue {
    public static void main(String[] args) {

        int[] ints = {0};
        int i  = maximumUniqueSubarray(ints);
        System.out.println(i);
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int max = 0;

        int left = 0;

        int right = 0;

        Map<Integer ,Integer> integerIntegerMap = new HashMap<>();
        int sum =0;
        while (right<nums.length){
            integerIntegerMap.merge(nums[right], 1, Integer::sum);
            sum = sum+nums[right];
            while (integerIntegerMap.get(nums[right])==2){
               Integer integer =integerIntegerMap.get(nums[left]);
               integer = integer-1;
               if(integer ==0){
                   sum = sum-nums[left];
                   integerIntegerMap.remove(nums[left]);
               }else {
                   sum = sum-nums[left];
                   integerIntegerMap.put(nums[left],integer);
               }
               left++;
            }
            max = Math.max(max,sum);
            right++;
        }
        return max;
    }
}
