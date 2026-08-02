class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int l =0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int right =0;right<nums.length;right++){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(min , right - l +1);
                sum -= nums[l];
                l++;
            }
        }
        if(min == Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;

    }
}