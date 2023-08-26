int maxArea(int* height, int heightSize){
    int left = 0;
    int right = heightSize-1;
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

int min(int n1, int n2){
    if(n1 < n2) return n1;
    return n2;
}