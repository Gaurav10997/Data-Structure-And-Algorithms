class Solution {
    public boolean canFinish(int n, int[][] edges) {
					ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
					ArrayList<Integer> li = new ArrayList<>();
					Queue<Integer> q = new LinkedList<>();
					for(int i = 0 ; i< n ; i++) graph.add(new ArrayList<>()); 
					int [] index = new int[n];
					for(int i = 0 ; i< n ; i++){
						index[i]=0;
					}

					for(int [] edge : edges){
						int ai = edge[0];
						int bi = edge[1];
						graph.get(bi).add(ai);
						index[ai]++;
					}

					for(int i = 0; i< n ; i++){
						if(index[i]==0){
							q.add(i);
						}
					}

					while(!q.isEmpty()){
						int curr = q.remove();
						li.add(curr);
						for(int nbr : graph.get(curr)){
							index[nbr]--;
							if(index[nbr]==0){
								q.add(nbr);
							}
						}
					}
					if(li.size()!=n){
						return false;
					}

					return true;
    
    }
}