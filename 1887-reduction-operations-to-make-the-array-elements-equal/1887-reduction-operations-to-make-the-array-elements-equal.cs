public class Solution {
    public int ReductionOperations(int[] nums) {
        Array.Sort(nums);
        int opr = 0;
        int res =0;
        for(int i=1; i<nums.Length; i++){
            if(nums[i] == nums[i-1]) res += opr;
            else{
                opr++;
                res += opr;
            }
        }
        return res;
    }
}