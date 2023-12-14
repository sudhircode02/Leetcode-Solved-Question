class Solution {
public:
    vector<vector<int>> onesMinusZeros(vector<vector<int>>& grid) {
        int n=grid.size(), m=grid[0].size();
        vector<vector<int>> diff(n, vector<int> (m));
        vector<int> onesRow(n);
        vector<int> onesCol(m);
        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                if(grid[r][c]==1){
                    onesRow[r]++;
                    onesCol[c]++;
                }
            }
        }
        for(int r=0; r<n; r++){
            int zeroRow = m-onesRow[r];
            for(int c=0; c<m; c++){
                int zeroCol = n-onesCol[c];
                diff[r][c] = onesRow[r] + onesCol[c] - zeroRow - zeroCol;
            }
        }
        return diff;
    }
};