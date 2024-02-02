/**
 * 功能描述: 平衡二叉树
 *
 * @author hezhan
 * @date 2024/1/16 19:06
 */
public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Balanced(root) >= 0;
    }

    public int Balanced(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        int left = Balanced(root.left);
        int right = Balanced(root.right);
        int x = right - left;
        if (x > 1 || x < -1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
