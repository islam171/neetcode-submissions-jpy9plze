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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        int sum = length(root);
        return this.max;
    }


    public int length(TreeNode root){
        if(root == null) return 0;
        int a = length(root.left);
        int b = length(root.right);
        
   
        this.max = Math.max(this.max, a+b);
        if(a > b)
            return a + 1;
        return b+1;
    }
}
