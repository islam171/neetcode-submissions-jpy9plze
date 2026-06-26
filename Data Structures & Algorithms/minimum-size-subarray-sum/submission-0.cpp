class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int mn = INT_MAX;
        bool ok = 0;
        for(int i = 0; i < nums.size(); i++){
            int sum = 0;
            int k = 0;
            for(int j = i; j < nums.size(); j++){
                sum += nums[j];
                k++;
                if(sum >= target){
                    mn = min(mn, k);     
                    ok = 1;  
                }
            }
        }
        if(!ok) return 0;
        return mn;
    }
};