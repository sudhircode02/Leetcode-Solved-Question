class Solution {
    public String reverseWords(String str) {
        StringBuilder sb = new StringBuilder();
        int s = 0;
        for(int e=0; e<str.length(); e++){
            if(str.charAt(e) == ' '){
                StringBuilder temp = new StringBuilder(str.substring(s,e));
                sb.append(temp.reverse()+" ");
                s=e+1;
            }
        }
        StringBuilder temp = new StringBuilder(str.substring(s,str.length()));
        sb.append(temp.reverse());
        return sb.toString();
    }
}