class Solution {
    public int removeDuplicates(int[] nums) {
       
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 101){
                continue;
            }
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[j] = 101;
                }
            }        
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 101){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}