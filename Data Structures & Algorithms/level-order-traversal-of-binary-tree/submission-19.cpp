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
    vector<vector<int>> levelOrder(TreeNode* root) {
        queue<pair<TreeNode*, int>> q;
        vector<vector<int>> vec = {};
        if(root == NULL) return vec;
        q.push({root, 0});
        while(!q.empty()){
            // if(vec.size() == 0)
            //     vec.push_back({});
            root = q.front().first;
            int level = q.front().second;
            q.pop();
            if(root == NULL) {
                continue;
            }
            if(level >= vec.size()) vec.push_back({});
            vec[level].push_back(root->val);
            // if(root->left)
                q.push({root->left, level+1});
            // if(root->right)
                q.push({root->right, level+1});
            


        } 
        if(vec.size() > 0)
        if(vec[vec.size()-1].size() == 0) vec.pop_back();
        return vec;
    }
};
