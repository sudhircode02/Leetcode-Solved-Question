class Solution {
    public String longestPalindrome(String s) {
        String lgtPal = "";
        for(int i=0; i<s.length(); i++){
            if(s.length()-i <= lgtPal.length()) break;
            for (int j = i+1; j <=s.length() ; j++) {
                if(j-i < lgtPal.length()) continue;
                String temp = s.substring(i,j);
                if(isPalindrome(temp)){
                    if(temp.length() > lgtPal.length()){
                        lgtPal = temp;
                    }
                }
            }
        }
        return lgtPal;
    }

    private static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}