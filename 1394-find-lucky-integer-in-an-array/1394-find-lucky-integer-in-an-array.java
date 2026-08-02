class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max = -1;
        int val = 0;
        int min = -1;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                }
                 if(arr[i] == count){
                    max = count;
            }
        }
        return max;
    }
}