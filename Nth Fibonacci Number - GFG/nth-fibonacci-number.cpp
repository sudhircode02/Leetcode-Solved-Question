//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    int nthFibonacci(int n){
        // code here
        int n1 =0;
        int n2 =1;
        int mod = 1000000007;
    
        for(int i=2; i<=n; i++){
            int sum = n1+n2;
            n1 = n2;
            n2 = sum%mod;
        }
        return n2;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.nthFibonacci(n) << endl;
    }
    return 0;
}

// } Driver Code Ends