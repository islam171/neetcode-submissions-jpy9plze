class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0; int j = 0;
        int k = 0;
        String a = "";
        while(i < word1.length() && j < word2.length()){
            if(k % 2 == 0){
                a += word1.charAt(i);
                i++;
            }else{
                a += word2.charAt(j);
                j++;
            }
            k++;
        }
        while(i < word1.length()){
                a += word1.charAt(i);
                i++;
        }
        while(j < word2.length()){
                a += word2.charAt(j);
                j++;
        }
        return a;
    }
}