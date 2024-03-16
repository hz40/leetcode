/**
 * 功能描述: 单词搜索
 *
 * @author hezhan
 * @date 2024/3/16 16:20
 */
public class WordSearch {

    StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {


    }
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtracking(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] board, String word, int i, int j, int index) {

        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '\0';
        boolean res = backtracking(board, word, i + 1, j, index + 1) || backtracking(board,
                word, i - 1, j, index + 1) || backtracking(board, word, i, j + 1,
                index + 1) || backtracking(board, word, i, j - 1, index + 1);
        board[i][j] = temp;
        return res;
    }
}
