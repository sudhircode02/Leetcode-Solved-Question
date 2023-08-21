class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=1; i<=len/2; i++){
            String ss1 = s.substring(0, i);
            int j=i;
            boolean isEqual = true;
            while(j < len){
                int n = j + ss1.length();
                if(n > len){
                    isEqual = false;
                    break;
                }
                String ss2 = s.substring(j,n);
                if(!ss1.equals(ss2)){
                    isEqual = false;
                    break;
                }
                j = n;
            }
            if(isEqual) return true;
        }
        return false;
    }
}