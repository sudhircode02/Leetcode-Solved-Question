class Solution {
public:
    double average(vector<int>& salary) {
        double avg = 0;
        int len = salary.size();
        int min = INT_MAX;
        int max = INT_MIN;
        for(int i=0; i<len; i++){
            avg += salary[i];
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        return (avg-max-min)/(len-2);
    }
};