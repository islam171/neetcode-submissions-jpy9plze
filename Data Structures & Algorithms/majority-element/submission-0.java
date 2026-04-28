class Solution {
    public int majorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i]))
            map.put(nums[i], map.get(nums[i]) + 1);
            else{
               map.put(nums[i], 1); 
            }
        }
        int max = 0;
        int maxElem = 0;
        for(int i : map.keySet()){
            System.out.println(i);
            if(max <= map.get(i)){
                max = map.get(i);
                maxElem = i;
            }
        }
        return maxElem;
    }
}