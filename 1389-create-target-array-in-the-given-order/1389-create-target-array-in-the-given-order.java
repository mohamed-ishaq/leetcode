class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List.add(index[i], nums[i]);
        }
        int target[] = new int[List.size()];
        for(int i=0;i<target.length;i++){
            target[i] = List.get(i);
        }
        return target;
    }
}