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
    vector<int> a;
public:
    vector<int> preorderTraversal(TreeNode* root) {
        tr(root);
        return a;
    }

    void tr(TreeNode* root){
        if(root == NULL) return;
        a.push_back(root->val);
        if(root->left) tr(root->left);
        if(root->right) tr(root->right);
        return;
    }
};