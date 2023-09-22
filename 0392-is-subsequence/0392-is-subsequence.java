class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int j=0;
        for(int i=0; i< sArr.length; i++){
            boolean isFound = false;
            while(j< tArr.length){
                if(i == sArr.length-1 && sArr[i] == tArr[j]){
                   return true;
                }
                if(sArr[i] == tArr[j]){
                   isFound = true;
                   j++;
                   break;
                }
                j++;
            }
            if(!isFound){
              return false;
            }
        }
        return false;
    }
}