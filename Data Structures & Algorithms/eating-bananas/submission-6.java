class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1;
        int r = 0;
        for(int i = 0; i < piles.length; i++){
            r = Math.max(r, piles[i]);
        }
        int ans = r;
        while(l < r){
            int m = (r - l)/2 + l;
            if(mayEat(piles, m, h)){
                r = m;
                ans = r;
            }else{
                l = m + 1;
            }
        }
        return ans;
    }

    public boolean mayEat(int[] plies, int k, int h){
        
        for(int i = 0; i < plies.length; i++){
            if(plies[i] % k == 0){
                h -= plies[i] / k;
            }else{
                h -= plies[i] / k + 1;
            }
        }
        return h >= 0;
    }
}
