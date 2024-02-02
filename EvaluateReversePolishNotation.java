import java.util.Stack;

/**
 * 功能描述: 逆波兰数表达式
 *
 * @author hezhan
 * @date 2023/12/21 15:11
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        int rightNum;
        int leftNum;
        int ans;

        for (String token : tokens) {
            if("+".equals(token)){
                rightNum = result.pop();
                leftNum = result.pop();
                ans = leftNum + rightNum;
            }else if("-".equals(token)){
                rightNum = result.pop();
                leftNum = result.pop();
                ans = leftNum - rightNum;
            }else if("*".equals(token)){
                rightNum = result.pop();
                leftNum = result.pop();
                ans = leftNum * rightNum;
            }else if("/".equals(token)){
                rightNum = result.pop();
                leftNum = result.pop();
                ans = leftNum / rightNum;
            }else{
                ans = Integer.parseInt(token);

            }
            result.push(ans);
        }
        return result.pop();
    }
}
