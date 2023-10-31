class Solution {
    public int[] findArray(int[] pref) {
        //int ans[] =new int[pref.length];
        int prev = pref[0];
        for(int i=1; i<pref.length; i++){
            int temp = pref[i];
            pref[i] = pref[i]^prev;
            prev = temp;
            
        }
        return pref;
    }
}