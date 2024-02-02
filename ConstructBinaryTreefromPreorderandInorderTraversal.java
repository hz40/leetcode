import java.util.HashMap;

/**
 * 功能描述: 前序遍历与中序遍历还原二叉树
 *
 * @author hezhan
 * @date 2024/1/12 09:54
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1 ; i < preorder.length ; i++){
            TreeNode node = new TreeNode(preorder[i]);
            insertNode(root,node,map);

        }
        return root;


    }

    private void insertNode(TreeNode root,TreeNode node,HashMap<Integer,Integer> map){
        while(root != node){
            if(map.get(node.val) < map.get(root.val)){
                if(root.left == null){
                    root.left = node;
                }
                root = root.left;
            }else{
                if(root.right == null){
                    root.right = node;
                }
                root = root.right;

            }

        }
    }
}
