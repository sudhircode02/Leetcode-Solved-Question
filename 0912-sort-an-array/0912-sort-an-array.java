class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }
    

    public static int[] merge(int[] left, int[] right){
        int i=0, j=0, k=0;
        int lLen = left.length;
        int rLen = right.length;
        int[] ans = new int[lLen + rLen];
        while(i<lLen && j<rLen){
            if(left[i] < right[j])
                ans[k++] = left[i++];
           else
                ans[k++] = right[j++];
            
        }
        while(i<lLen){
            ans[k++] = left[i++];
        }
        while(j<rLen){
            ans[k++] = right[j++];
        }
        return ans;
    }
}