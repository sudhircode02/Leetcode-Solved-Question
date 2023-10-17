class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return helper(board, 0);
    }

    public static int helper(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for(int col=0; col<board.length; col++){
            if(isSafe(row, col, board)){
                board[row][col] = true;
                count += helper(board, row+1);
                board[row][col] = false;
            }
        } 
        return count;
    }

    private static boolean isSafe(int row, int col, boolean[][] board){
        for(int r=row-1; r>=0; r--){
            if(board[r][col]) return false;
        }
        for(int r=row-1, c=col-1; r>=0 && c>=0; r--, c--){
            if(board[r][c]) return false;
        }
        for(int r=row-1, c=col+1; r>=0 && c<board.length; r--,c++){
            if(board[r][c]) return false;
        }
        return true;
    }
}