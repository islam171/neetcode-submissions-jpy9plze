class Solution {
   public:
    int trap(vector<int>& height) {
        int s = height.size();
        vector<int> prefix(s, 0);
        vector<int> suffix(s, 0);
        prefix[0] = height[0];
        suffix[s - 1] = height[s-1];
        for(int i = 1; i < s; i++){
            prefix[i] = max(height[i], prefix[i-1]);
        }

        for(int i = s-2; i >= 0; i--){
            suffix[i] = max(height[i], suffix[i+1]);
        }
        int sum = 0;
        for(int i = 0; i < s; i++){
            cout << suffix[i] << " " << prefix[i] << endl;
            int k = min(prefix[i], suffix[i]) - height[i];
            if(k > 0)
            sum += k;
        }
        return sum;
        // 0 0 2 -3 2 3 2 0 0 0
    }
};
