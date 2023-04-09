class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        int [] indegrees = new int [n];
        
        // creating a Adjacency Graph 
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i< n ; i++)graph.add(new ArrayList<>());
        
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            indegrees[edge[1]]++;
        }
        
        // edges those having zero degree 
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i< n ; i++ ){
            if(indegrees[i]==0){
                q.add(i);
            }
        }
        
        
        // filling the colors ; 
        int [][] counts = new int[n][26];
        
        for(int i = 0 ; i< n ; i++){
            counts[i][colors.charAt(i)-'a']++;
        }
        
        int maxcount = 0 ; 
        int visited = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            visited++;
            for(int nbr : graph.get(curr)){
                
                 for (int i = 0; i < 26; i++) {
                    counts[nbr][i] = Math.max(counts[nbr][i], counts[curr][i] + (colors.charAt(nbr) - 'a' == i ? 1 : 0));
                }
                 indegrees[nbr]--;
                 if(indegrees[nbr]==0){
                     q.add(nbr);
                 }
              
                
            }
            
              maxcount = Math.max(maxcount, Arrays.stream(counts[curr]).max().getAsInt());
        }
        if(visited==n){
            return maxcount;
        }
        return -1;
    }
}