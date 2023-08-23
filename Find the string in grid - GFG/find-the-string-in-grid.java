//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        List<Integer> list = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        char ch = word.charAt(0);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                char c = grid[i][j];
                if(c == ch){
                    if(stringPresent(i, j, word, grid, n, m)){
                        list.add(i);
                        list.add(j);
                    }
                }
            }
        }
        int[][] ans = new int[list.size()/2][2];
        int k = 0;
        for(int i=0; i<ans.length; i++){
            ans[i][0] = list.get(k++);
            ans[i][1] = list.get(k++);
        }
        return ans;
    }

    public static boolean stringPresent(int r, int c, String word, char[][] grid, int n, int m){
        int len = word.length();

        // left
        if(c >= len-1){
            boolean isPresent = true;
            for(int i=c-1, k=1; i>=c-(len-1) && k<len; i--, k++){
                if(grid[r][i] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        //right
        if(c < m-(len-1)){
            boolean isPresent = true;
            for(int i=c+1, k=1; i<=c+(len-1) && k<len; i++, k++){
                if(grid[r][i] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        // up
        if(r >= len-1){
            boolean isPresent = true;
            for(int i=r-1, k=1; i>=r-(len-1) && k<len; i--, k++){
                if(grid[i][c] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        //down
        if(r < n-(len-1)){
            boolean isPresent = true;
            for(int i=r+1, k=1; i<=r+(len-1) && k<len; i++, k++){
                if(grid[i][c] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        // diagonal left up
        if(r >= len-1 && c >= len-1){
            boolean isPresent = true;
            for(int i=r-1, j=c-1, k=1; i>=r-(len-1) && j>=c-(len-1) && k<len; i--, j--, k++){
                if(grid[i][j] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        // diagonal right up
        if(r >= len-1 && c < m-(len-1)){
            boolean isPresent = true;
            for(int i=r-1, j=c+1, k=1; i>=r-(len-1) && j<=c+(len-1) && k<len; i--, j++, k++){
                if(grid[i][j] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        // diagonal down right
        if(r < n-(len-1) && c < m-(len-1)){
            boolean isPresent = true;
            for(int i=r+1, j=c+1, k=1; i<=r+(len-1) && j<=c+(len-1) && k<len; i++, j++, k++){
                if(grid[i][j] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }

        // diagonal down left
        if(r < n-(len-1) && c >= len-1){
            boolean isPresent = true;
            for(int i=r+1, j=c-1, k=1; i<=r+(len-1) && j>=c-(len-1) && k<len; i++, j--, k++){
                if(grid[i][j] != word.charAt(k)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) return true;
        }


        return false;
    }
}