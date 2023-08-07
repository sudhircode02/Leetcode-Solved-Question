//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return helper(grid, 0, 0);
    }
    
    static boolean helper(int[][] grid, int row, int col){
        if(row == 9){ 
            return true;
        }
        
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        
        if(grid[row][col] != 0){
            return helper(grid, nextRow, nextCol);
        }
        
        for(int digit =1; digit<=9; digit++){
            if(isSafe(grid, row, col, digit)){
                grid[row][col] = digit;
                if(helper(grid, nextRow, nextCol)){
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }
    
    static boolean isSafe(int[][] grid, int row,int col, int digit){
        for(int r=0; r<9; r++){
            if(grid[r][col] == digit){
                return false;
            }
        }
        for(int c=0; c<9; c++){
            if(grid[row][c] == digit){
                return false;
            }
        }
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
        for(int r=sRow; r<sRow+3; r++){
            for(int c=sCol; c<sCol+3; c++){
                if(grid[r][c] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                System.out.print(grid[r][c]+" ");
                
            }
        }
    }
}