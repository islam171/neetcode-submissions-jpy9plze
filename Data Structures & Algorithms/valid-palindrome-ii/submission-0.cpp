class Solution {
public:

    bool isPalindrome(string s){
        int i = 0;
        int n = s.size();
        while(i < n / 2){
            if(s[i] != s[n-i-1])
                return false; 
            i++;
        }
        return true;
    }

    bool validPalindrome(string s) {
        int i = 0;
        if(isPalindrome(s)) return true;
        while(i < s.size()){
                cout << s.substr(0, i) + s.substr(i+1) << endl;
            if(isPalindrome(s.substr(0, i) + s.substr(i+1))){
                return true;
            }
            i++;
        }
        return false;
    }
};