//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2){
        
        //code here.
        int len1 = s1.length();
        int len2 = s2.length();
        
        if(s1.equals("0") || s2.equals("0")) return "0";
        
        int[] arr = new int[len1+len2];
        
        for(int i=len1-1; i>=0; i--){
            
            for(int j=len2-1; j>=0; j--){
                
                if(s1.charAt(i) != '-' && s2.charAt(j) != '-'){
                    
                    int prod = (s1.charAt(i)-'0') * (s2.charAt(j)-'0');
                    arr[i+j+1] += prod;
                    arr[i+j] += arr[i+j+1]/10;
                    arr[i+j+1] %= 10;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if((s1.charAt(0) == '-' && s2.charAt(0) != '-') || (s1.charAt(0) != '-' && s2.charAt(0) == '-')){
            sb.append('-');
        }
        
        int i=0;
        while(i<arr.length && arr[i] == 0){
            i++;
        }
        while(i < arr.length){
            sb.append(arr[i]);
            i++;
        }
        
        return sb.toString();
        
    }
}