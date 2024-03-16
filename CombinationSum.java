import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 组合总和
 *
 * @author hezhan
 * @date 2024/3/16 15:01
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] ints = {2, 3, 6, 7};
        List<List<Integer>> results = combinationSum(ints, 7);
        for(List<Integer> list : results){
            System.out.println(list);
        }
    }

    static List<List<Integer>> res = new ArrayList<>();

    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates, 0, target);
        return res;
    }

    public static void combination(int[] candidates, Integer start, Integer target) {
        Integer sum = 0;
        for (Integer num : path) {
            sum += num;
        }
        if (sum > target) {
            return;
        } else if (sum == target) {
            List<Integer> list = new ArrayList<>(path);
            res.add(list);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            combination(candidates, i, target);
            path.remove(path.size() - 1);
        }
    }
}