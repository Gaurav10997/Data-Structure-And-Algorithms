class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adjLs) {
        boolean vis[] = new boolean[adjLs.size()]; 
        dfs(0, adjLs, vis); 
        System.out.println(Arrays.toString(vis));
        for(int i = 0 ; i< vis.length ; i++){
            if(!vis[i]) return false;
        }
        
        return true;
    }
    
     private static void dfs(int src, List<List<Integer>> adjLs , boolean vis[]) {
        vis[src] = true; 
        for(int nbr: adjLs.get(src)) {
            if(!vis[nbr]) {
                dfs(nbr, adjLs, vis); 
            }
        }
    }
}