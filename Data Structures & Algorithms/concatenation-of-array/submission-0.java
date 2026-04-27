class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length * 2];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            a[j] = nums[i];
            j++;
        }
        for(int i = 0; i < nums.length; i++){
            a[j] = nums[i];
            j++;
        }
        return a;
    }
}