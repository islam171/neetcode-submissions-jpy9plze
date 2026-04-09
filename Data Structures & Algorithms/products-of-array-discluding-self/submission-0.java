class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 1, 1, 2, 8
        // 48, 24, 6, 1
        int[] t = new int[nums.length];
		t[0] = 1;
		
		int[] t1 = new int[nums.length+1];
		t1[nums.length] = 1;
		
		
		for(int i = 1; i < nums.length; i++){
			t[i] = nums[i-1] * t[i-1];
			
        }
        for(int i = nums.length-1; i >= 0; i--) {
        	t1[i] = nums[i] * t1[i+1];
        }
		
		
		for(int i = 0; i < nums.length-1; i++) {
			t[i] = t[i] * t1[i+1];
		}
        return t;
    }
}  
