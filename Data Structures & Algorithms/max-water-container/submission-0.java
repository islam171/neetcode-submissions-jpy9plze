class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;
    	while(i < j) {

    		if(max < (j - i) * Math.min(heights[i],  heights[j])) {
    			max = Math.min(heights[i],  heights[j]) * (j-i);
//    			System.out.println("MAX: "+ max + "; i: " + i + "; j: " + j);
    		}
    		if(heights[i] > heights[j]) {
    			j--;
    		}else {
    			i++;
    		}
    	}
    	
    	return max;
    }
}
