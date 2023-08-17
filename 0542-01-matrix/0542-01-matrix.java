class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int bit = mat[i][j];
                if(bit != 0){
                    int nearZeroBit = findNearestZero(i, j, mat);
                    ans[i][j] = nearZeroBit;
                }
            }
        }
        return ans;
    }

    public int findNearestZero(int r, int c, int[][] mat){
        int len = Integer.MAX_VALUE;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                int bit = mat[i][j];
                if(bit == 0){
                    int rDis = Math.abs(r-i);
                    int cDis = Math.abs(c-j);
                    int dis = rDis + cDis;
                    if(dis < len){
                        len = dis;
                    }
                }
            }
            if(len == 1) break;
        }
        return len;
    }
}