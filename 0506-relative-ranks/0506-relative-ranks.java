class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int sorted[] = arr.clone();
        int res[] = new int[arr.length];
          Arrays.sort(sorted);
          int[] reversed = IntStream.rangeClosed(1, arr.length)
                                  .map(i -> sorted[arr.length - i])
                                  .toArray();
   
        int ind = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             if(arr[i]==reversed[j]){
                res[ind++] = j+1;
             }
            }
        }
        String ans[] = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            if(res[i]==1){
            ans[i]= "Gold Medal";
            }else if(res[i]==2){
                ans[i]="Silver Medal";
            }else if(res[i]==3){
                ans[i]="Bronze Medal";
            }else{
                ans[i]=res[i]+"";
            }
        }return ans;
    }
}