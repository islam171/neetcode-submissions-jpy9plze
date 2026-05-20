class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        set<int> a;
        for(int i : nums){
            a.insert(i);
        }
        int i = 1;
        while(true){
            if(!a.contains(i)){
                return i;
            }i++;
        }
        return 0;
    }
};