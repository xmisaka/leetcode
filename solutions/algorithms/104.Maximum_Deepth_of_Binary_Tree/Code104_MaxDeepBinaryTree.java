package algorithm;

/** 
 * @ClassName: Code104_MaxDeepBinaryTree 
 * @Description: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * @author Warming 
 * @date 2016-4-8 ÏÂÎç5:30:27 
 *  
 */
public class Code104_MaxDeepBinaryTree {

	public static int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return 1 + (left > right ? left : right);
    }
	
	
	public static void main(String[] args) {
		//No test data.
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}