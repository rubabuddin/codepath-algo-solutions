/**
Given a binary tree, determine if it is height-balanced.

 Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem



 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public static int isBalanced(TreeNode root){

        int leftHeight;
        int rightHeight;

        if(root == null)
            return 1;

        leftHeight = height(root.right);
        rightHeight = height(root.left);

        if(Math.abs(leftHeight-rightHeight) <= 1
                 && isBalanced(root.left) == 1
                 && isBalanced(root.right) == 1){
             return 1;
         }

         return 0;
}

    public static int height(TreeNode node)
    {
        //empty tree
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

}
