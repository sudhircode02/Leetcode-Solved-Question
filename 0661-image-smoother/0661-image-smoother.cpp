class Solution {
public:
    vector<vector<int>> imageSmoother(vector<vector<int>>& img) {
        int n = img.size(), m=img[0].size(); 
        vector<vector<int>> res(n, vector<int> (m,0));
        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                res[r][c] = smoother(img, r, c);
            }
        }
        return res;
    }

    int smoother(vector<vector<int>>& img, int row, int col){
        int sum = img[row][col];
        int div = 1;
        //up
        if(row>0){
            sum += img[row-1][col];
            div++;
        } 
        //right
        if(col<img[0].size()-1){
            sum += img[row][col+1];
            div++;
        } 
        //left
        if(col>0){
            sum += img[row][col-1];
            div++;
        } 
        //down
        if(row<img.size()-1){
            sum += img[row+1][col];
            div++;
        } 
        //up right
        if(row>0 && col<img[0].size()-1){
            sum += img[row-1][col+1];
            div++;
        }
        //up left
        if(row>0 && col>0){
            sum += img[row-1][col-1];
            div++;
        }
        //down left
        if(row<img.size()-1 && col>0){
            sum += img[row+1][col-1];
            div++;
        }
        //down right
        if(row<img.size()-1 && col<img[0].size()-1){
            sum += img[row+1][col+1];
            div++;
        }
        return sum/div;
    }
};