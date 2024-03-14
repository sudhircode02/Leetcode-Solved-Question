class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        /*
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int sum = nums[i];
            if(sum == goal) count++;
            for(int j=i+1; j<n; j++){
                sum += nums[j];
                if(sum > goal) break;
                if(sum == goal) count++;
            }
        }
        return count;
        */
     return atMost(nums, goal) - atMost(nums, goal-1);
    }

    private int atMost(int[] nums, int goal) {
        if(goal < 0) return 0;
        int left=0,right=0,res=0;
        for(;right<nums.length;right++){
            goal-=nums[right];
            while(goal<0){
                goal+=nums[left++];
            }

            res += right-left+1;
        }

        return res;
    }
}