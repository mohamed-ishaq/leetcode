class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int appeard[] = new int[nums.length+1];
        for(int i: nums){
            appeard[i]++;
        }
        for(int i=1;i<nums.length+1;i++){
            if(appeard[i] == 0){
                arr.add(i);
            }
        }
        return arr;
    }
}