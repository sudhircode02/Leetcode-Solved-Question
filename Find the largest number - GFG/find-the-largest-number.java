//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.find(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int find(int N){
        // code here       
        if(isAsc(N)) return N;
        for(int i=N-1; i>=0; i--){
            if(isAsc(i)) return i;
        }
        return 0;
    }
    
    static boolean isAsc(int n){
        
        int temp = 10;
        int j=0;
        while(n>0){
            int ld = n%10;
            n /= 10;
            if(temp >= ld){
                temp = ld;    
            }else{
                return false;
            }
        }
        return true;
    }
}