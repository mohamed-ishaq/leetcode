class Solution {
    public int[] shuffle(int[] nums, int n) {
        int val[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                val[i] = nums[i/2];
            }
            else{
                val[i] = nums[n + (i/2)];
            }
        }
        return val;
    }
}