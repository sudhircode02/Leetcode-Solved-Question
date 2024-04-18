class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c] == 1){
                    res += 4;
                    res -= touch(r, c, grid);
                }
            }
        }
        return res;
    }

    private int touch(int r, int c, int[][] grid){
        int t = 0;
        if(r>0 && grid[r-1][c] == 1) t++;
        if(r<grid.length-1 && grid[r+1][c] == 1) t++; 
        if(c>0 && grid[r][c-1] == 1) t++;
        if(c<grid[0].length-1 && grid[r][c+1] == 1) t++;
        return t;
    }
}