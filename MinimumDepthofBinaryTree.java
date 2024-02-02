import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

/**
 * 功能描述: 二叉树的最小深度
 *
 * @author hezhan
 * @date 2024/1/6 15:38
 */
public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        //处理边界问题
        if (root == null) return 0;

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);

        int depth = 0;

        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodeQueue.poll();

                if (curNode.left == null && curNode.right == null) {
                    return depth;
                }
                if (curNode.left != null) {
                    nodeQueue.add(curNode.left);
                }
                if (curNode.right != null) {
                    nodeQueue.add(curNode.right);
                }
            }
        }
        return depth;
    }
}
