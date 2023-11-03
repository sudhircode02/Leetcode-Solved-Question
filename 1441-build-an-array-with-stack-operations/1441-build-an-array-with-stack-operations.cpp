class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> list;
        int i=0, j=1;
        while(i<target.size() && j<=n){
            list.push_back("Push");
            if(j == target[i]) i++;       
            else list.push_back("Pop");
            j++;
        }
        return list;
    }
};