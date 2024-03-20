import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: 多数元素
 *
 * @author hezhan
 * @date 2024/3/20 10:34
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] ints = {3,2,3};

        System.out.println(majorityElement(ints));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer integer : nums){
            if(map.get(integer) == null){
                map.put(integer,0);
            }else {
                map.put(integer, map.get(integer) + 1);
            }
        }
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() >= nums.length/2){
                    key = entry.getKey();
                }
        }
        return  key;
    }
}
