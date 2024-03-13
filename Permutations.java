import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 全排列
 *
 * @author hezhan
 * @date 2024/3/12 20:16
 */
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 ,5, 6,7, 8, 9};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }
   static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        Boolean[] used = new Boolean[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            used[i] = false;
        }
        backtrack(nums, new ArrayList<>(), used);
        return res;
    }

    private static void backtrack(int[] nums, List<Integer> track, Boolean[] used) {

        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if (used[i]){
                continue;
            }else {
                track.add(nums[i]);
                used[i] = true;
                backtrack(nums, track, used);
                track.remove(track.size() - 1);
                used[i] = false;
            }
        }
    }
}
