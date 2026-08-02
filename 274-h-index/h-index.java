class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i=0;i<citations.length;i++){
            int count = n-i;
            if(citations[i] >= count){
                return count;
            }
        }
        return 0;
    }
}