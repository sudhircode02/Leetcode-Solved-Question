class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length +1];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(arr[n] == 1){
                return n;
            }
            else{
                arr[n] = 1;
            }
        }
        return -1;
    }
}