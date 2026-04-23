class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        while(l+1 < r){
            int m = (r - l) / 2 + l;
            if(nums[l] > nums[m]){
                r = m;
            }else{
                l = m;
            }
        }
        return Math.min(nums[r], nums[0]);
    }
}
