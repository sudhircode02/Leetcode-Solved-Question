class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        int ones = 0;
        int zeros = len-2;
        boolean firstOne = true;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == '1'){
                if(firstOne){
                    sb.replace(len-1, len, "1");
                    firstOne = false;
                }
                else{
                    sb.replace(ones, ones+1, "1");
                    ones++;
                }
            }else{
                sb.replace(zeros, zeros+1, "0");
                zeros--;
            }
        }
        return sb.toString();
    }
}