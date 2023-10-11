class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<bool>> board(n, vector<bool>(n, false));
        vector<vector<string>> list;
        helper(0, board, list);
        return list;
    }

    void helper(int row, vector<vector<bool>>& board, vector<vector<string>>& list){
        if(row == board.size()){
            list.push_back(helper(board));
            return;
        }

        for(int col=0; col<board.size(); col++){
            if(isSafe(row, col, board)){
                board[row][col] = true;
                helper(row+1, board, list);
                board[row][col] = false;
            }
        }
    }

    bool isSafe(int row, int col, vector<vector<bool>>& board){
        if(row == 0) return true;

        for(int r=row-1; r>=0; r--){
            if(board[r][col]) return false;
        }
        for(int r=row-1, c=col-1; r>=0 && c>=0; --r, --c){
            if(board[r][c]) return false;
        }
        for(int r=row-1, c=col+1; r>=0 && c<board.size(); --r, ++c){
            if(board[r][c]) return false;
        }
        return true;
    }

    vector<string> helper(vector<vector<bool>>& board){
        vector<string> list;
        for(vector<bool> row : board){
            string s;
            for(bool b : row){
                if(b){
                    s += "Q";
                }else{
                    s += ".";
                }
            }
            list.push_back(s);
        }
        return list;
    }

};