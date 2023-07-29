class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        String[] patArr = pattern.split("");
        int slen = strArr.length;
        int plen = patArr.length;
        if(slen != plen) return false; 
        for(int i=0; i<slen-1; i++){
            for(int j=i+1; j<slen; j++){
                if(patArr[i].equals(patArr[j])){
                    if(!strArr[i].equals(strArr[j])){
                        return false;
                    }
                }
                else{
                    if(strArr[i].equals(strArr[j])){
                        return false;
                    }
                }
            }
        } 
        return true;
    }
}