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
    bool isValidBST(TreeNode* root) {
        return lefft(root, -1005, 1005);
    }


    bool lefft(TreeNode* root, int lb, int rb){
        if(root == NULL) return true;
        if(root->val > lb && root->val < rb){
            bool ok = true;
            if(!lefft(root->left, lb, root->val)) ok = false;
            if(!lefft(root->right, root->val, rb)) ok = false;
            return ok;
        }
        return false;
    }


    
};
