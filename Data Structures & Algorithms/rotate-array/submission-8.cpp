class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> t;
        int a = k%nums.size();
        for(int i = 0; i < a; i++){
            t.push_back(nums[nums.size()-1]);
            cout << nums[nums.size()-1] << " ";
            nums.pop_back();
        }
        for(int i : t){
            nums.insert(nums.begin(), i);
        }
    }
};