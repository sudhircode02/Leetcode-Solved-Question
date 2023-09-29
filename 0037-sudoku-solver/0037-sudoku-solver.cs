public class Solution {
    public void SolveSudoku(char[][] board) {
        checkSudoku(0, 0, board);
    }
    public bool checkSudoku(int row, int col, char[][] sudoku){
        if(row==9){
            return true;
        }
        int nextRow = row, nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != '.'){
            return checkSudoku(nextRow,nextCol, sudoku);

        }
        for(int digit = 1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = (char)(digit+'0');
                if(checkSudoku( nextRow, nextCol, sudoku)){
                    return true;
                }
                sudoku[row][col] = '.';
            }
        }
        return false;
    }

    public bool isSafe(char[][] sudoku, int row, int col , int digit){
        for(int c=0; c<9; c++){
            if(sudoku[row][c]-'0' == digit) return false;
        }
        for(int r=0; r<9; r++){

            if(sudoku[r][col]-'0' == digit) return false;
        }
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
        for(int r=sRow; r<sRow+3; r++){
            for(int c=sCol; c<sCol+3; c++){
                if(sudoku[r][c]-'0' == digit) return false;
            }
        }
        return true;
    }
}