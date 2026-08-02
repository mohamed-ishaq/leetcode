class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
        int index = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count++;
            if(nums[i] != 1){
                count = 0;
            }
            if(index<count){
                index = count;
            }
        }
        return index;
    }
}