class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c] != '.') {
                    char digit = board[r][c];
                    board[r][c] = '.';
                    if(!isSafe(board, r, c, digit)) return false;
                    board[r][c] = digit; 
                }
            }
        }
        return true;
    }

    


    public static boolean isSafe(char[][] sudoku, int row, int col , char digit){
        for(int c=0; c<9; c++){
            if(sudoku[row][c] == digit) return false;
        }
        // Col
        for(int r=0; r<9; r++){

            if(sudoku[r][col] == digit) return false;
        }
        // 3X3
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
        for(int r=sRow; r<sRow+3; r++){
            for(int c=sCol; c<sCol+3; c++){

                if(sudoku[r][c] == digit) return false;
            }
        }
        return true;
    }
}