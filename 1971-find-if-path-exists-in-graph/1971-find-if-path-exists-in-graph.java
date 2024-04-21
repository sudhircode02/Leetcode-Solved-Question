class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = graphgenerator(n , edges);   
        return pathfinder(source , destination , adj, new boolean[n]);  
    }
    
    public boolean pathfinder(int src , int dest , ArrayList<ArrayList<Integer>> adj ,boolean[]            visited){
        if(src==dest) return true;
        
        visited[src]=true;
        
        for(int x : adj.get(src)){
            if(visited[x]==false){
                boolean haspathfromx  = pathfinder(x , dest , adj , visited);
                if(haspathfromx) return true;
            }
            
        }
        return false;
    }
    
    public ArrayList<ArrayList<Integer>> graphgenerator( int n , int[][] edges){
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<n ;i++){
            al.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            int src = edge[0];
            int dest = edge[1];
            al.get(src).add(dest);
            al.get(dest).add(src);
        }
        
        return al;
    }
    
}