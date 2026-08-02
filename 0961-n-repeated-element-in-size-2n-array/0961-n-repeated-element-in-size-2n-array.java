class Solution {
    public int repeatedNTimes(int[] nums) {
        int val = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                val = nums[i];
            }
        }
        return val;
    }
}