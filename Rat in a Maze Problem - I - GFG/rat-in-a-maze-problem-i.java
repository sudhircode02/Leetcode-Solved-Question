//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        int len = m.length;
        path(m, 0, 0, "", len-1, list);
        return list;
        
    }
    public static void path(int[][] m, int r, int c, String p, int n, ArrayList<String> list){
        
        if(m[r][c] == 0) return;
        
        if(r==n && c==n){
            list.add(p);
            return;
        }
        
        m[r][c] = 0;
        
        if(r < n){
            path(m, r+1, c, p+'D', n, list);
        }
        if(c < n){
            path(m, r, c+1, p+'R', n, list);
        }
        if(r > 0){
            path(m, r-1, c, p+'U', n, list);
        }
        if(c > 0){
            path(m, r, c-1, p+'L', n, list);
        }
        
        m[r][c] = 1;
    }
}