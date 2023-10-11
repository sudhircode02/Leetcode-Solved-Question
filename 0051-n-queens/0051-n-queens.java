class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> list = new ArrayList<>();
        helper(0, board, list);
        return list;
    }

    static void helper(int row, boolean[][] board, List<List<String>> list){
        if(row == board.length){
            list.add(helper(board));
            return;
        }

        for(int col=0; col<board.length; col++){
            if(isSafe(row, col, board)){
                board[row][col] = true;
                helper(row+1, board, list);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(int row, int col, boolean[][] board){
        if(row == 0) return true;

        for(int r=row-1; r>=0; r--){
            if(board[r][col]) return false;
        }
        for(int r=row-1, c=col-1; r>=0 && c>=0; --r, --c){
            if(board[r][c]) return false;
        }
        for(int r=row-1, c=col+1; r>=0 && c<board.length; --r, ++c){
            if(board[r][c]) return false;
        }
        return true;
    }

    public static List<String> helper(boolean[][] board){
        List<String> list = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder sb = new StringBuilder();
            for(boolean b : row){
                if(b){
                    sb.append('Q');
                }else{
                    sb.append('.');
                }
            }
            list.add(sb.toString());
        }
        return list;
    }

}