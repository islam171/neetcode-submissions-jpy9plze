/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return isBal;

    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        int a = depth(root.left);
        int b = depth(root.right);
        if(Math.abs(a - b) > 1) isBal = false;
        if(a > b) return a+1;
        return b+1;
    }
}
