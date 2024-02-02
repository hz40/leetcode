import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: 数组的度
 *
 * @author hezhan
 * @date 2023/12/25 20:50
 */
public class DegreeofanArray {
    public static void main(String[] args) {
        int[] ints = {1,2,2,3,1,4,2};
        int i = findShortestSubArray(ints);
        System.out.println(i);
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        Map<Integer,Integer> map1= new HashMap<>();
        int i =1;
        int max = i;
        for (Integer integer:nums){
            map.merge(integer,1,Integer::sum);
            Integer integer1=map1.get(integer);
            if(integer1 ==null){
                integer = -i;
            }
            map1.put(integer,integer1+i);
            i++;
        }
        for (Map.Entry<Integer,Integer> k:map.entrySet()){
            max = Math.max(max, k.getValue());
        }
        return max;
    }
}
