class Solution {
    public double average(int[] salary) {
        double avg = 0;
        int len = salary.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            avg += salary[i];
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        return (avg-max-min)/(len-2);
    }
}