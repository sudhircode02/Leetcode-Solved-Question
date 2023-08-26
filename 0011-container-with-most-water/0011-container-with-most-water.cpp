class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int maxWaterArea = 0;
        while(left < right){
            int minHeight = min(height[left], height[right]);
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
};