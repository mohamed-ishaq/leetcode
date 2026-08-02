class Solution {
    public int distributeCandies(int[] candyType) {
    HashSet<Integer> val = new HashSet<>(); 
    for(int i=0;i<candyType.length;i++){
        val.add(candyType[i]);
    }   
    int types = val.size();
    int n = candyType.length/2;
    if(n==types){
        return n;
    }
    else if(types < n){
        return types;
    }
    return n;
    }
}