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
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        if (root->val == subRoot->val) {
            bool ok = equal(root, subRoot);
            if(ok) return true;
        }
        bool ok = false;
        if(root->left)
        if (isSubtree(root->left, subRoot)) ok = true;
        if(root->right)
        if (isSubtree(root->right, subRoot)) ok = true;
        return ok;
    }

    bool equal(TreeNode* root, TreeNode* subRoot) {
        if (root && subRoot) {
            if (root->val == subRoot->val) {
                bool ok = true;
                ok = equal(root->left, subRoot->left) && ok;
                ok = equal(root->right, subRoot->right) && ok;
                return ok;
            }
        }
        if(root) return false;
        if(subRoot) return false;
        return true;
    }
};
