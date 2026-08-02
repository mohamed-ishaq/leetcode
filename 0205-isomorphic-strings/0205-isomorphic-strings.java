class Solution {
    public boolean isIsomorphic(String s, String t) {
        int freq[] = new int[256];
        int freq1[] = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ca = t.charAt(i);
            if(freq[ch] != freq1[ca]){
                return false;
            }
            freq[ch]=i+1;
            freq1[ca]=i+1;
            
        }
        // for(int i=0;i<s.length();i++){
        //     if(freq[s.charAt(i)] != freq1[t.charAt(i)]){
        //         return false;
        //     }
        // }
        return true;
    }
}