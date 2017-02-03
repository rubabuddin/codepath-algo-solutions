/**

Invert Binary tree - inplace change

 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root != null)    
            invert(root);
    
        return root;
    }
    

    public void invert(TreeNode t){
     
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
     
        if(t.left != null)
            invert(t.left);
     
        if(t.right != null)
            invert(t.right);
    }
}
