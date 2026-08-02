class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String lo = word.toLowerCase();
        String thousif = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(up) || word.equals(lo)){
            return true;
        }
        if(thousif.equals(word)){
            return true;
        }
        return false;
    }
}