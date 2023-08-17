class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int len = m+n;
        int ans[len];
        int i=0, j=0, k=0; 
        while(i<n && j<m){
            int n1 = nums1[i];
            int n2 = nums2[j];
            if(n1 < n2){
                ans[k++] = n1;
                i++;
            }
            else{
                ans[k++] = n2;
                j++;
            }
        }
        while(i<n){
            ans[k++] = nums1[i++];
        }
        while(j<m){
            ans[k++] = nums2[j++];
        }

        if(len%2 == 0){
             return (double)(ans[len/2] + ans[(len-1)/2])/2;
           
        }
        return ans[len/2];
        
    }
};