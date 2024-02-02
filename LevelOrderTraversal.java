import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述: 层序遍历二叉树
 *
 * @author hezhan
 * @date 2024/1/17 14:12
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listList = new ArrayList<>();
        if (root == null) {
            return listList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            //queue.size()会不断变化所以需要赋值
            int length = queue.size();
           for(int i = 1; i<= length;++i){
               TreeNode treeNode= queue.poll();
               list.add(treeNode.val);
               if(treeNode.left != null){
                   queue.offer(treeNode.left);
               }
               if(treeNode.right != null){
                   queue.offer(treeNode.right);
               }
            }
           listList.add(0,list);
        }
        return  listList;
    }
}
