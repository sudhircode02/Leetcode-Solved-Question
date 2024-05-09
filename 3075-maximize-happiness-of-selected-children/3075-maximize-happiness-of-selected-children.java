class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res = 0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1, j=0; i>=0 && k>0; i--,k--,j++){
            int n = happiness[i]-j;
            if(n <= 0) break;
            res += n;
        }
        return res;
    }
}