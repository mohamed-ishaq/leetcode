class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<salary.length;i++){
            if(salary[i]>max){
                max = salary[i];
            }
            if(salary[i]<min){
                min = salary[i];
            }
        }
        double sum =0;
        int count = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i] != max && salary[i] != min ){
                sum = sum + salary[i];
                count++;
            }
        }
        return sum/count;
    }
}