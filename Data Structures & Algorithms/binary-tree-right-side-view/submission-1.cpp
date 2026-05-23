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

    int lvl[100];
    vector<int> a;
    int k = 0;

public:
    vector<int> rightSideView(TreeNode* root) {
        tl(root, 0);
        for(int i = 0; i < k; i++){
            cout << lvl[i] << " ";
            a.push_back(lvl[i]);
        }
        return a;
    }

    void tl(TreeNode* root, int l){
        if(root == NULL) return;
        k = max(l+1, k);
        // if(!lvl[l]){
        // }
        lvl[l] = root->val;
        tl(root->left, l+1);
        tl(root->right, l+1);
    }
};
