class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] == 101){
                continue;
            }
            else{
                count++;
            }
            
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[j] = 101;
                }
                else{
                    break;
                }
            }        
        }
        Arrays.sort(nums);
        return count;
    }
}
