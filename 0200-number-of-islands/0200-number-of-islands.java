class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c] == '1'){
                    count++;
                    mark(grid, r, c);
                }
            }
        }
        return count;
    }

    private void mark(char[][] grid, int r, int c){
        if(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1 || grid[r][c] == '0') return;
        grid[r][c] = '0';
        //up
        mark(grid, r-1, c);
        //down
        mark(grid, r+1, c);
        //left
        mark(grid, r, c-1);
        //right
        mark(grid, r, c+1);
    }
}