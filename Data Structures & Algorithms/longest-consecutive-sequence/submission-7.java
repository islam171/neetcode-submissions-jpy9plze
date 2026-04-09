
class Solution {
    public int longestConsecutive(int[] nums) {
    	TreeMap<Integer, Integer> hash = new TreeMap<>();
        if(nums.length <= 0) return 0;
        for(int i : nums){
            hash.put(i, 0);
        }
        int max = 1;
        int k = 1;
        int t = hash.firstKey();
        hash.remove(t);
        for(int i : hash.keySet()){
            if(t + 1 == i) {
            	k++;
            }else {
            	k = 1;
            }
            if(k > max) max = k;
        	t = i;
        }
        return max;
    }
}
