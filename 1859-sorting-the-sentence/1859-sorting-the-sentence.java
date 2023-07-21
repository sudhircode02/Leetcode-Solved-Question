class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        for (String curStr : arr) {
            int len = curStr.length() - 1;
            char lastChar = curStr.charAt(len);
            int n = lastChar - '0';
            ans[n - 1] = curStr.substring(0, len);
        }
        StringBuilder str = new StringBuilder();
        for (int i=0; i<ans.length; i++) {
            if(i == ans.length-1){
                str.append(ans[i]);
            }
            else{
                str.append(ans[i]).append(" ");
            }
        }
        return str.toString();
    }
}