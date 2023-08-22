void rotate(int* nums, int numsSize, int k){
        if(k==0 || k==numsSize) return;
        while(k >= numsSize){
            k -= numsSize;
        }
        reverse(nums, 0, numsSize-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, numsSize-1);
    }
    
    void reverse(int* nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
