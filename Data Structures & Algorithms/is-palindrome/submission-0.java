class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        boolean ok = true;
        while(i < s.length() && j > 0){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j) ){
                ok = false;
                break;
            }

            i++;
            j--; 
        }
        return ok;
    }
}
