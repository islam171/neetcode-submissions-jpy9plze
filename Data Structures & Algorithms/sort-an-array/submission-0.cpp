class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        merge(nums, 0, nums.size()-1);
        return nums;
    }

    void merge(vector<int>& nums, int l, int r){
        if(l >= r) return;
        int m = (l + r) / 2;
        merge(nums, l, m);
        merge(nums, m+1, r);

        ms(nums, l, m, r);
    }

    void ms(vector<int>& nums, int l, int m, int r){
        vector<int> t;
        int left = l;
        int right = m+1;
        while(left <= m && right <= r){
            if(nums[left] <= nums[right]){
                t.push_back(nums[left]);
                left++;
            }else if(nums[left] > nums[right]){
                t.push_back(nums[right]);
                right++;
            }
        }
        while(right <= r){
            t.push_back(nums[right]);
            right++;
        }
        while(left <= m){
            t.push_back(nums[left]);
            left++;
            
        }

        for(int i = l; i <= r; i++){
            nums[i] = t[i-l];
        }
    }


};