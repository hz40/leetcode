import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能描述: 颜色分类
 *
 * @author hezhan
 * @date 2023/12/18 16:42
 */
public class Color {
    public static void main(String[] args) {
        sortColors(new int[]{0,2,0,0,0,1});
    }

    public static void sortColors(int[] nums) {
        List<Integer> r = new ArrayList<>();
        List<Integer> w = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) {
                r.add(num);
            } else if (num == 1) {
                w.add(num);
            } else {
                b.add(num);
            }
        }
        r.addAll(w);
        r.addAll(b);
        r.toArray();
        int k = 0;
        for(Integer integer:r){
            nums[k]=integer;
            k++;
        }
    }
}
