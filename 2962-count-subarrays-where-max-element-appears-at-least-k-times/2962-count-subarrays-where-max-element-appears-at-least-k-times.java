class Solution {
    public long countSubarrays(int[] nums, int k) {
        /*
        long count = 0;
        int max = -1;
        for(int num : nums) max = Math.max(max, num);
        for(int i=0; i<nums.length; i++){
            int maxCount = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[j] == max) maxCount++;
                if(maxCount >= k) count++;
            }
        }
        return count; 
        */
        long maxNum = Long.MIN_VALUE, count = 0, ans = 0;
        int s = 0, e = 0;
        
        for (int num : nums) maxNum = Math.max(maxNum, num);
        while (e < nums.length || s > e) {
            if (nums[e] == maxNum) {
                count++;
            }
            while (count >= k) {
                if (nums[s] == maxNum) {
                    count--;
                }
                s++;
                ans += nums.length - e;
            }
            e++;
        }
        return ans;
    }

}