class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        for(int i=0; i<board.size(); i++){
            for(int j=0; j<board[0].size(); j++){
                char ch = word[0];
                if(board[i][j] == ch){
                    if(helper(i, j, board, word, 1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    bool helper(int r, int c, vector<vector<char>>& board, string word, int count){
        if(count == word.size()){
            return true;
        }
        char currChar = board[r][c];
        board[r][c] = '!';
        char nextChar = word[count];

        //up
        if(r>0 && board[r-1][c] == nextChar){
            if(helper(r-1, c, board, word, count+1)) return true;
        }
        //down
        if(r<board.size()-1 && board[r+1][c] == nextChar){
            if(helper(r+1, c, board, word, count+1)) return true;
        }
        //left
        if(c>0 && board[r][c-1] == nextChar){
            if(helper(r, c-1, board, word, count+1)) return true;
        }
        //right
        if(c<board[0].size()-1 && board[r][c+1] == nextChar){
            if(helper(r, c+1, board, word, count+1)) return true;
        }
        board[r][c] = currChar;
        return false;
    }
};