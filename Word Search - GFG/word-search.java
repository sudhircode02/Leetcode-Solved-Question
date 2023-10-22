//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      char a[][] = new char[n][m];
      sc.nextLine();
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
         a[i][j]=sc.next().charAt(0);
      }
      String word=sc.next();
      Solution obj = new Solution();
      int ans = obj.wordSearch(a,word) ? 1 : 0;
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static boolean wordSearch(char board[][],String word) {
    // code here
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                char ch = word.charAt(0);
                if(board[i][j] == ch){
                    if(helper(i, j, board, word, 1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean helper(int r, int c, char[][] board, String word, int count){
        if(count == word.length()){
            return true;
        }
        char currChar = board[r][c];
        board[r][c] = '!';
        char nextChar = word.charAt(count);

        //up
        if(r>0 && board[r-1][c] == nextChar){
            if(helper(r-1, c, board, word, count+1)) return true;
        }
        //down
        if(r<board.length-1 && board[r+1][c] == nextChar){
            if(helper(r+1, c, board, word, count+1)) return true;
        }
        //left
        if(c>0 && board[r][c-1] == nextChar){
            if(helper(r, c-1, board, word, count+1)) return true;
        }
        //right
        if(c<board[0].length-1 && board[r][c+1] == nextChar){
            if(helper(r, c+1, board, word, count+1)) return true;
        }
        board[r][c] = currChar;
        return false;
    }
}
     