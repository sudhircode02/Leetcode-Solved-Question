class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n =grid.length, m = grid[0].length;
        int[][] diff = new int[n][m];
        int[] onesRow = new int[n];
        int[] onesCol = new int[m];
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
                diff[r][c] = onesRow[r]+onesCol[c]-zeroRow-zeroCol;
            }
        }
        return diff;
    }
}