class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int time = 0;
        int p=0, m=0, g=0;
        for(int i=0; i<garbage.size(); i++){
            time += garbage[i].length();
            if(isContain(garbage[i], 'P')) p=i;
            if(isContain(garbage[i], 'M')) m=i;
            if(isContain(garbage[i], 'G')) g=i;
        }
        while(p>0 && m>0 && g>0){
            time += travel[--p] + travel[--m] + travel[--g]; 
        }
        while(p>0) time += travel[--p];
        while(m>0) time += travel[--m];
        while(g>0) time += travel[--g];
        return time;
    }
    bool isContain(string s, char ch){
        for(int i=0; i<s.length(); i++){
            if(s[i] == ch) return true;
        }
        return false;
    }
};