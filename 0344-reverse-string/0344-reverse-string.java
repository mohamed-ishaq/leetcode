class Solution {
    public void reverseString(char[] s) {
        char a[] = new char[s.length];
        int index = 0;
        for(int i=a.length-1;i>=0;i--){
            a[index] = s[i];
            index++;
        }
        for(int i =0;i<a.length;i++){
            s[i] = a[i];
        }
    }
}