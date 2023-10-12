//{ Driver Code Starts
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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(i, j, board, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    static boolean search(int r, int c, char[][] board, String word, int k){
        if(k == word.length()-1){
            return true;
        }
        char nextChar = word.charAt(k+1);
        char temp = board[r][c];
        board[r][c] = '!';
        //left
        if(c>0 && board[r][c-1]==nextChar){
            if(search(r, c-1, board, word, k+1)) return true;
        }
        //right
        if(c<board[0].length-1 && board[r][c+1]==nextChar){
            if(search(r, c+1, board, word, k+1)) return true;
        }
        //up
        if(r>0 && board[r-1][c]==nextChar){
            if(search(r-1, c, board, word, k+1)) return true;
        }
        //down
        if(r<board.length-1 && board[r+1][c]==nextChar){
            if(search(r+1, c, board, word, k+1)) return true;
        }
        board[r][c] = temp;

        return false;
    }
}