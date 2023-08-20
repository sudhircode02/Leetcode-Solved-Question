//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
public:
    int Count(vector<vector<int> >& matrix) {
        // Code here
        int count = 0;
            for(int i=0; i<matrix.size(); i++){
                for(int j=0; j<matrix[0].size(); j++){
                    if(matrix[i][j] == 1) {
                        if (evenZero(i, j, matrix)) count++;
                    } 
                }
            }
        return count;
        
    }
    
    bool evenZero(int r, int c, vector<vector<int> >& mat){
        
        int zeroCount = 0;
        
        // left
        if(c>0 && mat[r][c-1] == 0) zeroCount++;
        
        // right
        if(c<mat[0].size()-1 && mat[r][c+1] == 0) zeroCount++;
        
        // up
        if(r>0 && mat[r-1][c] == 0) zeroCount++;
    
        // down
        if(r<mat.size()-1 && mat[r+1][c] == 0) zeroCount++;
        
        // diagonal left up
        if(r>0 && c>0 && mat[r-1][c-1] == 0) zeroCount++;
        
        // diagonal right up
        if(r>0 && c<mat[0].size()-1 && mat[r-1][c+1] == 0) zeroCount++;
        
        // diagonal down left
        if(r<mat.size()-1 && c>0 && mat[r+1][c-1] == 0) zeroCount++;
        
        // diagonal down right
        if(r<mat.size()-1 && c<mat[0].size()-1 && mat[r+1][c+1] == 0) zeroCount++;
        
        if(zeroCount == 0) return false;
        if(zeroCount%2 != 0) return false;
        return true;
        
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>> matrix(n, vector<int>(m,0));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> matrix[i][j];
			}
		}
		Solution ob;
		int ans = ob.Count(matrix);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends