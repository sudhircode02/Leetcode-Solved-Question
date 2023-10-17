//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        helper(new boolean[n][n], 0, list);
        return list;
        
    }
    
    static void helper(boolean[][] board, int row, ArrayList<ArrayList<Integer>> list){
        if(row == board.length){
            list.add(queenPos(board));
            return;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(row, col, board)){
                board[row][col] = true;
                helper(board, row+1, list);
                board[row][col] = false;
            }
        }
    }
    
    private static boolean isSafe(int row, int col, boolean[][] board){
        for(int r=row-1; r>=0; r--){
            if(board[r][col]) return false;
        }
        for(int r=row-1, c=col-1; r>=0 && c>=0; r--, c--){
            if(board[r][c]) return false;
        }
        for(int r=row-1, c=col+1; r>=0 && c<board.length; r--,c++){
            if(board[r][c]) return false;
        }
        return true;
    }
    
    private static ArrayList<Integer> queenPos(boolean[][] board){
        ArrayList<Integer> list = new ArrayList<>();
        for(boolean[] row : board){
            for(int i=0; i<row.length; i++){
                if(row[i]){
                     list.add(i+1);
                     break;
                }
            }
        }
        return list;
    }
}