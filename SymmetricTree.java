/**
 * 功能描述: 对称二叉树
 *
 * @author hezhan
 * @date 2024/1/17 15:45
 */
public class SymmetricTree {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
       return isSymmetric(root,root);
    }
    public boolean isSymmetric(TreeNode root1,TreeNode root2) {
        if(root1 == null&&root2==null){
            return  true;
        }
        if(root1 ==null&&root2 != null){
            return  false;
        }
        if(root1 !=null&&root2 == null){
            return  false;
        }
        if(root1.val != root2.val){
            return false;
        }
       boolean leftResult = isSymmetric(root1.left,root2.right);
       boolean rightResult = isSymmetric(root1.right,root2.left);
       return leftResult&&rightResult;
    }
}
