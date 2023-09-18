class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int len = mat.size();
        vector<int> soldier;
        for(int i=0; i<len; i++){
            soldier.push_back(countOne(mat[i]));
        }
        vector<int> weakCount;
        for(int i=0; i<len; i++){
            int c = 0; 
            for(int j=0; j<len; j++){
                if(i==j) continue;
                if((soldier[i] < soldier[j]) || (soldier[i]==soldier[j] && i<j))
                    c++;
            }
            weakCount.push_back(c);
        } 
        vector<int> kWeakest;
        for(int i=0; i<k; i++){
            int max = 0;
            for(int j=0; j<len; j++){
                if(weakCount[max] < weakCount[j]){
                    max = j; 
                }
            }
            kWeakest.push_back(max);
            weakCount[max] = -1;
        }
        return kWeakest;  
    }

    int countOne(vector<int> arr){
        int c = 0;
        for(int n : arr){
            if(n==1) c++;
        }
        return c;
    }
};