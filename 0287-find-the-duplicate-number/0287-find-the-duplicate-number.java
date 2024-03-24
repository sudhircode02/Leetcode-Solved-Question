class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length +1];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            freq[n]++;
            if(freq[n] > 1) return n;
        }
        return -1;
    }
}