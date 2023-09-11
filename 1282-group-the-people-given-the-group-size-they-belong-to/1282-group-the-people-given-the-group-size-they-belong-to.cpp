class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        int len = groupSizes.size();
        int count = 0;
        int n = 1;
        vector<vector<int>> list;
        while(count < len){
            int i = 0;
            while (i < len) {
                vector<int> temp;
                for (int j=i; j<len; j++) {
                    if (groupSizes[j] == n) {
                        temp.push_back(j);
                        if (temp.size() == n) {
                            list.push_back(temp);
                            i=j+1;
                            count += n;
                            break;
                        }
                    }
                    if(j==len-1) i=j+1;
                }
            }
            n++;
        }
        return list;
    }
};