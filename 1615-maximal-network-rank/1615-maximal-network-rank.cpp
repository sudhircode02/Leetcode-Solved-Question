class Solution {
public:
    int maximalNetworkRank(int n, vector<vector<int>>& roads) {
        if(roads.size() == 1) return 1;
        
        vector<int> citysRoad(n, 0);
        
        for(vector<int>& road : roads){
            for(int city : road){
                citysRoad[city]++;
            }
        }
        
        int maxRoadNetwork = 0;
        
        for(int i=0; i<n-1; i++){
            if(citysRoad[i] == 0) continue;
            
            for(int j=i+1; j<n; j++){
                if(citysRoad[j] == 0) continue;
                
                int roadNetwork = citysRoad[i] + citysRoad[j];
                
                roadNetwork -= ijPairCheck(i, j, roads);
                
                if(roadNetwork > maxRoadNetwork){
                    maxRoadNetwork = roadNetwork;
                }
            }
        }
        return maxRoadNetwork;
    }
    
     int ijPairCheck(int i, int j, vector<vector<int>>& roads) {
        int count = 0;
         
        for(vector<int>& road : roads){
            if(road[0]==i && road[1]==j){
                count++;
            }
            else if(road[0]==j && road[1]==i){
                count++;
            }
        }
        return count;
    }
};