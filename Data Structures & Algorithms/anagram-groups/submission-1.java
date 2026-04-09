class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
        

          for(String s : strs){
            ArrayList<Character> set = new ArrayList<>();
            for(char ch : s.toCharArray()){
                set.add(ch);
            }
            Collections.sort(set);
            String a = "";
            for(char ch : set){
                a += ch;
            }
            ArrayList<String> temp = new ArrayList<String>();
            if(hash.get(a) != null) {
            	temp = hash.get(a);
            }
            temp.add(s);
			hash.put(a, temp);
        }
        
        List<List<String>> result = new ArrayList<List<String>>();
        for(List<String> value : hash.values()) {
        	result.add(value);
        }
        return result;
    }
}
