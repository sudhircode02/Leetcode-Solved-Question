public class Solution {
    public int NumberOfArithmeticSlices(int[] nums) {
        int count = 0;
        for(int i=0; i<=nums.Length-3; i++){
            int diff = nums[i+1] - nums[i];
            int len = 2;
            int j = i+2;
            while(j<nums.Length && nums[j]-nums[j-1]==diff){
                j++;
                len++;
            }
            if(len >= 3){
                count += len-2;
            }
        }
        return count;
    }
}