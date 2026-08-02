class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int mod = n%10;
            sum = sum + mod;
            mul = mul * mod;
            n = n / 10;
        }
        int val = mul - sum;
        return val;
    }
}