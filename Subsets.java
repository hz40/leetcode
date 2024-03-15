import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 子集
 *
 * @author hezhan
 * @date 2024/3/14 19:14
 */
public class Subsets {
    public static void main(String[] args) {
        int[] ints= {1,2,3,4,5};
        List<List<Integer>> subsets = subsets(ints);
        System.out.println(subsets);
    }

   static List<Integer> path = new ArrayList<>();

   static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {
        subsets(nums, 0);
        return res;
    }

    public static void subsets(int[] nums ,Integer start) {
        res.add(new ArrayList<>(path));
        if (start >= nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            subsets(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
