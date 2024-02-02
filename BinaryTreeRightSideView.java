import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 树的右视图
 *
 * @author hezhan
 * @date 2024/1/17 16:08
 */
public class BinaryTreeRightSideView {
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    public void dfs(TreeNode root,int depth){
        if(root == null){
            return;
        }
        if(depth == res.size()){
            res.add(root.val);
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
    }
}
