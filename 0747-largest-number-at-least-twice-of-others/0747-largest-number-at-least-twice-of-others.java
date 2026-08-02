class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secoundmax = Integer.MIN_VALUE;
        int index = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] > max){
                secoundmax = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i] > secoundmax){
                secoundmax = nums[i];
            }
            }
        if(max >= secoundmax*2)
        {
            return index;
        }
        return -1;
    }
}