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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int[] ans = new int[nums.length];
        helper(nums, 0, nums.length-1, ans);
        return ans;
    }
    int i=0;
    private void helper(int[] arr, int s, int e, int[] ans){
        if(s>e) return;
        int mid = (s+e)/2;
        ans[i++] =  arr[mid];
        helper(arr, s, mid-1, ans);
        helper(arr, mid+1, e, ans);
    }
}