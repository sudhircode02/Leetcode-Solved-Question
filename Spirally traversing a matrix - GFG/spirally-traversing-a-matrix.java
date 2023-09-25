//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left <= right && top <= bottom){
            
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            if(top+1 > bottom) break;
            for(int i=top+1; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            if(right-1 < left) break;
            for(int i=right-1; i>=left; i--){
                list.add(matrix[bottom][i]);
            }
            
            for(int i=bottom-1; i>=top+1; i--){
                list.add(matrix[i][left]);
            }
            
            left++; right--;
            top++; bottom--;
        }
        return list;
    }
}
