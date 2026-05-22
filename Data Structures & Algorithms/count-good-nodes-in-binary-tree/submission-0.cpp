/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    int goodNodes(TreeNode* root) {
        
        return par(root, -1000);
    }

    int par(TreeNode* root, int parent){
        int s = 0;
        if(root == NULL) return 0;
        if(root->val >= parent){
            s++;
        } 

        int left = par(root->left, max(root->val, parent));
        int right = par(root->right, max(root->val, parent));

        return left + right+s;
    }

};
