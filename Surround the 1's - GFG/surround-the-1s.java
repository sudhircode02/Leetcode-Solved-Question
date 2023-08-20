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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 1) {
                    if (evenZero(i, j, matrix)) count++;
                } 
            }
        }
        return count;
        
    }
    
    public static boolean evenZero(int r, int c, int[][] mat){
        int zeroCount = 0;
        
        // left
        if(c>0 && mat[r][c-1] == 0) zeroCount++;
        
        // right
        if(c<mat[0].length-1 && mat[r][c+1] == 0) zeroCount++;
        
        // up
        if(r>0 && mat[r-1][c] == 0) zeroCount++;
    
        // down
        if(r<mat.length-1 && mat[r+1][c] == 0) zeroCount++;
        
        // diagonal left up
        if(r>0 && c>0 && mat[r-1][c-1] == 0) zeroCount++;
        
        // diagonal right up
        if(r>0 && c<mat[0].length-1 && mat[r-1][c+1] == 0) zeroCount++;
        
        // diagonal down left
        if(r<mat.length-1 && c>0 && mat[r+1][c-1] == 0) zeroCount++;
        
        // diagonal down right
        if(r<mat.length-1 && c<mat[0].length-1 && mat[r+1][c+1] == 0) zeroCount++;
        
        if(zeroCount == 0) return false;
        if(zeroCount%2 != 0) return false;
        return true;
        
    }
    
}