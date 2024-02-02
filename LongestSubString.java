import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述: 无重复字符的最长子串
 *
 * @author hezhan
 * @date 2023/12/22 13:34
 */
public class LongestSubString {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;
        for (int right = 0;right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return  max;
    }
}
