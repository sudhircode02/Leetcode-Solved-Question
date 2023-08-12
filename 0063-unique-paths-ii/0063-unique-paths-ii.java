class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] temp = new int[m][n];
        
        for(int i=0; i<m; i++){
            if(obstacleGrid[i][0] == 0){
                temp[i][0] = 1;
            }else{
                break;
            }
                
        } 
        
        for(int i=0; i<n; i++){
            if(obstacleGrid[0][i] == 0){
                temp[0][i] = 1;
            }else{
                break;
            }
        } 
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j] == 0){
                    temp[i][j] = temp[i-1][j] + temp[i][j-1];
                }
        
            }
        }
        
        return temp[m-1][n-1];
    }
}