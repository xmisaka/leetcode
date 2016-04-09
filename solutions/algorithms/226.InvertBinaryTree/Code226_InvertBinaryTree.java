package algorithm;

/** 
 * @ClassName: Code226_InvertBinaryTree 
 * @Description: https://leetcode.com/problems/invert-binary-tree/
 * @author Warming 
 * @date 2016-4-8 обнГ6:30:38 
 *  
 */
public class Code226_InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
	public static void main(String[] args) {
		//No test data.
	}

}
