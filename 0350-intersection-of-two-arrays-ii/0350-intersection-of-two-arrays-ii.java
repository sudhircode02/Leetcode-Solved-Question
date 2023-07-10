class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(n < m){
           for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(nums2[j] == -1){
                    continue;
                    }
                    if(nums1[i] == nums2[j]){
                        list.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(nums1[j] == -1){
                        continue;
                    }
                    if(nums2[i] == nums1[j]){
                        list.add(nums2[i]);
                        nums1[j] = -1;
                        break;
                    }
                }
            }
        }
        
        int len = list.size();
        int[] ans = new int[len];
        for(int i=0; i<len; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}