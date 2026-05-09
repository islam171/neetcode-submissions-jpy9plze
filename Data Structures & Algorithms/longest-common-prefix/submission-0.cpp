class Solution {
   public:
    string longestCommonPrefix(vector<string>& strs) {
        string a = strs[0];
        int j =0;
        for (j = 0; j < a.size(); j++) {
            bool ok = true;
            for (string i : strs) {
                for(int k = 0; k <= j; k++){
                    if(i[k] != a[k]){
                        ok = false;
                    }
                }
            }
            if(!ok) break;
        }
        string o = "";
        for(int i = 0; i < j; i++){
            o += a[i];
        }
        return o;
    }
};