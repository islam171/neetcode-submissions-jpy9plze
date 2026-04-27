class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length-1;
        int max = arr[len];
        arr[len] = -1;
        for(int i = len-1; i >= 0; i--){
            int prev = max;
            if(arr[i] > max){
                max = arr[i];
            }
            arr[i] = prev;
            
        }
        return arr;
    }
}