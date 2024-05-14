class Solution {

    private int maxGold;

    public int getMaximumGold(int[][] grid) {
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] != 0){
                   countGold(grid, i, j, 0);
                }
            }
        }
        
        return maxGold;
    }

    private void countGold(int[][] grid, int r, int c, int gold){
        
        int g = grid[r][c];
        gold += g;
        grid[r][c] = 0;
        
        // up
        if(r>0 && grid[r-1][c]!=0) countGold(grid, r-1, c, gold);
        // down
        if(r<grid.length-1 && grid[r+1][c]!=0) countGold(grid, r+1, c, gold);
        //left
        if(c>0 && grid[r][c-1]!=0) countGold(grid, r, c-1, gold);
        //right
        if(c<grid[0].length-1 && grid[r][c+1]!=0) countGold(grid, r, c+1, gold);

        maxGold = Math.max(maxGold, gold);
        grid[r][c] = g;
    }
}