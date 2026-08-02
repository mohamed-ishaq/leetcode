class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> val = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    val.add(nums1[i]);
                } 
            }
        }
        int arr[] = new int[val.size()];
        int index = 0;
        for(int i:val){
            arr[index] = i;
            index++;
        }
        return arr;
    }
}