//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<>();
        helper(S, "", list);
        Collections.sort(list);
        return list;
    }
    
    public static void helper(String s, String ans, ArrayList<String> list){
        if(s.isEmpty()){
            list.add(ans);
            return;
        }
        
        char ch = s.charAt(0);
        for(int i=0; i<=ans.length(); i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            
            helper(s.substring(1), first+ch+second, list);
        }
    }
	   
}
