class Solution {
    public int findMaxK(int[] nums) {
        int[] pos = new int[1001];
        int[] neg = new int[1001];
        for(int num : nums){
            if(num < 0){
                num *= -1;
                neg[num]++;
            }
            else{
                pos[num]++;
            }
        }
        for(int i=1000; i>0; i--){
            if(neg[i]>0 && pos[i]>0) return i;
        }
        return -1;
    }
}