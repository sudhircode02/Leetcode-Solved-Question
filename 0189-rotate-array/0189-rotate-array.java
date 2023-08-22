class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k == 0 || k == len){
            return;
        }
        k = k%len;
        int[] temp = new int[len];
        int n = 0;
        for(int i=len-k; i<len; i++){
            temp[n++] = nums[i];
        }  
        for(int i=0; i<len-k; i++){
             temp[n++] = nums[i];
        }
        for(int i=0; i<len; i++){
            nums[i] = temp[i];
        }
    }    
}