class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> pascal;
        for(int row = 1; row <= numRows; row++){
            vector<int> temp;
            pascal.push_back(temp);
            if(row == 1){
                pascal[0].push_back(1);
            }
            else if(row == 2){
                pascal[1].push_back(1);
                pascal[1].push_back(1);
            }
            else{
                pascal[row-1].push_back(1);
                for(int j=1; j<=row-2; j++){
                    int n = pascal[row-2][j-1] + pascal[row-2][j];
                    pascal[row-1].push_back(n);
                }
                pascal[row-1].push_back(1);
            }
        }
        return pascal;
    }
};