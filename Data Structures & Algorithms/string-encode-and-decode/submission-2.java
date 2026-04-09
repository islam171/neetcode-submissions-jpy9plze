class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String s : strs){
            str += s;
            str+="-";
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> a = new ArrayList<>(); 
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-'){
                a.add(temp);
                temp = "";
            }else
                temp += str.charAt(i);
            
        }
        return a;
    }
}
