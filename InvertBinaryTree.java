/**
 * 功能描述: 反转二叉树
 *
 * @author hezhan
 * @date 2024/1/4 20:43
 */
public class InvertBinaryTree {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        right.left = right;
        right.right = left;
        return root;
    }
}
