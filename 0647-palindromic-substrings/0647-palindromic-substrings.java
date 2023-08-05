class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            
            for (int j = i+1; j <=s.length() ; j++) {
                
                String temp = s.substring(i,j);
                if(isPalindrome(temp)){
                    count++;
                }
            }
        }
        return count;
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