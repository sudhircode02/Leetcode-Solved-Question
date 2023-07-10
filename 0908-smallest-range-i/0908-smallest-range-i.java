class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        int low = nums[0];
        int high = nums[0];
        for(int num : nums){
            if(low > num){
                low = num;
            }
            if(high < num){
                high = num;
            }
        }
        int min = (high-k) - (low+k);
        if(min < 0){
            return 0;
        }
        return min;
    }
}
