import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 电话号码字母组合
 *
 * @author hezhan
 * @date 2024/3/19 10:16
 */
public class LetterCombinationsPhoneNumber {


    List<String> res = new ArrayList<>();
    String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return res;
        }
        backtrack(digits, 0, new StringBuilder());
        return res;
    }


    private void backtrack(String digits, int index, StringBuilder path) {

        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
