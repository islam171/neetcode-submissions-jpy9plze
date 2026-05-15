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
    vector<int> inorderTraversal(TreeNode* root) {
        tr(root);
        return a;
    }


    void tr(TreeNode* root){
        if(root == NULL) return;
        if(root->left){
            inorderTraversal(root->left);
        }
        a.push_back(root->val);
        if(root->right){
            inorderTraversal(root->right);
        }
    }
};