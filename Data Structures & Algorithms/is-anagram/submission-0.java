class Solution {
    public boolean isAnagram(String s, String t) {

        return check(s, t);

    }

    boolean check(String s, String t){
        HashMap<Character, Integer> h = new HashMap<>();

        for(char c : s.toCharArray()){
            if(h.containsKey(c)){
                h.put(c, h.get(c) + 1);
            }else{
                h.put(c, 1);
            }
        }

        for(char c : t.toCharArray()){
            if(h.containsKey(c)){
                h.put(c, h.get(c) - 1);
            }else{
                return false;
            }
        }

        for(Integer i : h.values()){
            if(i != 0) return false;
        }
        return true;

    }
}
