/**
 * 功能描述: 最后最大字符串
 *
 * @author hezhan
 * @date 2024/3/20 10:53
 */
public class LengthLastWord {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}
