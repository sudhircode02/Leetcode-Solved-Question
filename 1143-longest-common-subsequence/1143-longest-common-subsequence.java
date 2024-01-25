class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        int[][] arr = new int[len1+1][len2+1];

        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                char ch1 = text1.charAt(i-1), ch2 = text2.charAt(j-1);
                if(ch1 == ch2)  
                    arr[i][j] = arr[i-1][j-1]+1;
                else    
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }
        return arr[len1][len2];
    }
}