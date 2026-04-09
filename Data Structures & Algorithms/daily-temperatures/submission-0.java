class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> s = new Stack<>();
        int[] array = new int[temperatures.length];
        for(int i = 0; i< temperatures.length; i++){
            if(s.empty()){
                int[] a = new int[2];
                a[0] = temperatures[i];
                a[1] = i;
                s.push(a);
                continue;
            }
            if(temperatures[i] > s.peek()[0]){
                int[] elem = s.pop();
                array[elem[1]] = i - elem[1];
                i--;
            }else{
                int[] a = new int[2];
                a[0] = temperatures[i];
                a[1] = i;
                s.push(a);
            }
        }
        return array;
    }
}