
/**

MAX DEPTH OF BINARY TREE

 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int maxDepth(TreeNode a) {
	
	    if(a==null){
	        return 0;
	    } else {
	        int leftDepth = maxDepth(a.left);
	        int rightDepth = maxDepth(a.right);
	        
	         if (leftDepth > rightDepth)
                return (leftDepth + 1);
             else
                return (rightDepth + 1);
	    }
	}
}
