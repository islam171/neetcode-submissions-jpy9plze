class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> a; 
        for(int i = 0; i < nums.size(); i++){
            a.insert(nums[i]);
        }
        
        return a.size() != nums.size();
    }
};