class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;
        int max = -1;
        for(int n : nums) max = Math.max(max, n); 
        int[] freq = new int[max+1];
        for(int n : nums){
            freq[n]++;
        }
        int step = 0;
        for(int fq : freq){
            if(fq==1)
                return -1;
            if(fq%3 == 0)
                step += fq/3;
            else if((fq-2)%3 == 0)
                step = step + 1 + (fq-2)/3;
            else if((fq-4)%3 == 0)
                step = step + 2 + (fq-4)/3;
        }
        return step;
    }
}