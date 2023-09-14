class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int>> list;
        for(int i=0; i<=rowIndex; i++){
            vector<int> temp;
            if(i==0) temp.push_back(1);
            else if(i==1){
                temp.push_back(1);
                temp.push_back(1);
            }
            else{
                temp.push_back(1);
                for(int j=1; j<i; j++){
                    int n1 = list[i-1][j-1];
                    int n2 = list[i-1][j];
                    temp.push_back(n1+n2);
                }
                temp.push_back(1);
            }
            list.push_back(temp);
        }
        return list[rowIndex];
    }
};