class Solution {
public:
    bool isAlienSorted(vector<string>& words, string order) {
        map<char, int> mp;
        for(int i = 0; i < order.size(); i++){
            mp[order[i]] = i;
        }
        for(int i = 0; i < words.size()-1; i++){
            if(compareTwo(words[i], words[i+1], mp) == -1){
                return false;
            }
        }
        return true;
    }

    int compareTwo(string a, string b, map<char, int> order){
        int al = a.size();
        int bl = b.size();
        int i = 0;
        int j = 0;

        while(i < al && j < bl){
            if(order[a[i]] < order[b[j]]){
                return 1;
            }else if(order[a[i]] > order[b[j]]){
                return -1;
            }
            i++; j++;
        }
        if(al > bl) return -1;
        if(al < bl) return 1;
        return 0;
    }
};