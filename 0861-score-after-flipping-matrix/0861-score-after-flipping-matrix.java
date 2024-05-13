class Solution {
    public int matrixScore(int[][] grid) {
    
        for(int r=0; r<grid.length; r++){
            if(grid[r][0] == 0) flipRow(grid, r);
        }

        for(int c=1; c<grid[0].length; c++){
            int o=0, z=0;
            for(int r=0; r<grid.length; r++){
                if(grid[r][c] == 1) o++;
                else z++;
            }
            if(z>o) flipCol(grid, c);
        }

        int res = 0;
        for(int r=0; r<grid.length; r++){
            StringBuilder sb = new StringBuilder("");
            for(int c=0; c<grid[0].length; c++){
                sb.append(grid[r][c]);
            }
            res += Integer.parseInt(sb.toString(), 2);
        }
        return res;

    }

    private void flipRow(int[][] grid, int r){
        for(int c=0; c<grid[0].length; c++){
            grid[r][c] = grid[r][c]==1? 0 : 1;
        }
    }
    private void flipCol(int[][] grid, int c){
        for(int r=0; r<grid.length; r++){
            grid[r][c] = grid[r][c]==1? 0 : 1;
        }
    }
}


