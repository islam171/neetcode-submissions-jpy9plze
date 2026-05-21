class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int mx = 0;
        for(int i = 0; i < s.size(); i++){
            set<int> a;
            for(int j = i; j < s.size(); j++){
                if(a.contains(s[j])) break;
                a.insert(s[j]);
            }
            int k = a.size();
            mx = max(mx, k);
        }
        return mx;
    }
};
