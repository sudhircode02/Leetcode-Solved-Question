class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWaterArea = 0;
        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int diff = right - left;
            int water = minHeight*diff;
            if(water > maxWaterArea){
                maxWaterArea = water;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWaterArea;
    }
}