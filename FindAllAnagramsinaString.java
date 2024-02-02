import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 找到字符串中的所有异位词
 *
 * @author hezhan
 * @date 2023/12/25 16:51
 */

public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> lists = findAnagrams1(s, p);
        System.out.println(lists);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int i = 0;
        while (i < p.length()) {
            characterIntegerMap.merge(p.charAt(i), 1, Integer::sum);
            i++;
        }

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (right<s.length()){
            while (right-left+1>p.length()){
                left++;
            }
            String s1 = s.substring(left,right+1);
            if(compare(characterIntegerMap,s1)){
               list.add(left);
            }
            right++;
        }
        return list;
    }

    private static Boolean compare(Map<Character, Integer> characterIntegerMap, String str) {
        Map<Character, Integer> characterIntegerMap1 = new HashMap<>(characterIntegerMap);
        int i = 0;
        while (i < str.length()) {
            Integer integer = characterIntegerMap1.get(str.charAt(i));
            if (integer == null) {
                return false;
            } else if (integer == 1) {
                characterIntegerMap1.remove(str.charAt(i));
            } else {
                characterIntegerMap1.put(str.charAt(i), integer - 1);
            }
            i++;
        }
       if(characterIntegerMap1.size()==0){
           return true;
       }else {
           return false;
       }
    }



    public static List<Integer> findAnagrams1(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int[] needs = new int[26];


        for(char ch : p.toCharArray()){
            needs[ch - 'a']++;
        }

        int[] window = new int[26];

        int start = 0;
        int end = 0;

        while (end<s.length()){
            window[s.charAt(end)-'a']++;
            while (end-start+1>p.length()){
                window[s.charAt(start)-'a']--;
                start++;
            }
            if(isSame(needs,window)){
                res.add(start);
            }
            end++;
        }
        return  res;
    }

    private static boolean isSame (int[] a, int [] b){

        for(int i = 0; i < a.length; i++){

            if(a[i] != b[i])return false;

        }
        return true;
    }
}
