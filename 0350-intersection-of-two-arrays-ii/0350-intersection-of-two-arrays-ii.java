class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        
        Arrays.sort(num1);
        Arrays.sort(num2);
           
        int j=0;int i=0;int k=0;       
        int[] ans = new int[Math.min(num1.length, num2.length)];
         while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                ans[k++] = num1[i];
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else {
                j++;
            }
        } return Arrays.copyOf(ans, k);
       
    }
}