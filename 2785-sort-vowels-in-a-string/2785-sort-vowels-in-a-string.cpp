class Solution {
public:
    string sortVowels(string s) {
        int len = s.length();
        vector<char> list;
        char arr[len];
        for(int i=0; i<len; i++){
            arr[i] = s[i];
        }
        for(int i=0; i<len; i++){
            char ch = arr[i];
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

                list.push_back(ch);
                arr[i] = '@';
            }
        }
        sort(list.begin(), list.end());
        int j=0;
        for(int i=0; i<len; i++){
            if(arr[i] == '@'){
                arr[i] = list[j++];
            }
        }
        string str = "";
        for(int i=0; i<len; i++){
            str += arr[i];
        }
        return str;
    }
};