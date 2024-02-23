import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述: 只出现一次的数字
 *
 * @author hezhan
 * @date 2024/2/23 14:48
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] ints = {2,2,1};
        int i = singleNumber(ints);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
            }
        }
        return set.stream().findFirst().get();
    }
}
