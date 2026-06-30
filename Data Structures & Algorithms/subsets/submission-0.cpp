class Solution {
   public:
    void subset(vector<int>& a, vector<int>& ans, int i, vector<vector<int>> &k) {
        if (i == a.size()) {
            k.push_back(ans);
            return;
        }

        ans.push_back(a[i]);
        subset(a, ans, i + 1, k);

        ans.pop_back();
        subset(a, ans, i + 1, k);
    }

    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> vec; 
        vector<int> ans;
        subset(nums, ans, 0, vec);
        return vec;
    }
};
