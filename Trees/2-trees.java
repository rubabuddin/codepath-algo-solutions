/**

Check if two trees are identical


 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int isSameTree(TreeNode a, TreeNode b) {
	
	if(a == null && b == null)
	    return 1;
	
	if(a!=null && b!=null)
	    if(a.val == b.val && isSameTree(a.right, b.right) == 1 && isSameTree(a.left, b.left) == 1)
	        return 1;
	 
	return 0;
	}
}
