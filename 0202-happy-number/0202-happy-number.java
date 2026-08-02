class Solution {
    public boolean isHappy(int n) {
        while(n>0){
        int sq = 0;
        while(n != 0){
            int mod = n % 10;
            sq = sq + (mod * mod);
            n=n/10;
        }
        n=sq;
        if(n == 1){
            return true;
        }
        if(n ==4 ){
            return false;
        }
    }
        return false;
    }
}