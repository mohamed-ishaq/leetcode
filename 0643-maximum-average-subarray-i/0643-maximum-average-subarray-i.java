class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r= 0;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
            if((i - l +1) == k){
                max = Math.max(max,sum/k);
                sum -= nums[l];
                l++;
            }  
        }
        return (double)max;
    }
}