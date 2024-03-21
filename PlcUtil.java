import java.util.Scanner;

/**
 * 功能描述:
 *
 * @author hezhan
 * @date 2024/3/21 14:21
 */
public class PlcUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();
        int number = extractNumber(input);
        System.out.println("提取出的数字是：" + number);
    }

    public static int extractNumber(String input) {
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                if (currentNumber.length() == 0 && c == '0') {
                    // Ignore leading zeros
                    continue;
                }
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    break;
                }
            }
        }

        if (currentNumber.length() > 0) {
            return Integer.parseInt(currentNumber.toString());
        } else {
            // Return 0 if no number is found
            return 0;
        }
    }
}
