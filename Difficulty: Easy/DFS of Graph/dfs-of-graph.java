class Solution {
    
    public void solve(ArrayList<ArrayList<Integer>> graph, int curr, boolean[] isVisited, ArrayList<Integer> ans){
        ans.add(curr);
        isVisited[curr]=true;   //mark it as visited
        
        for(int i = 0; i<graph.get(curr).size();i++){
            int next = graph.get(curr).get(i);
            if(!isVisited[next]){   // if not visited  -> go visit
                solve(graph, next, isVisited, ans);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[adj.size()];   // to avoid cycles and infinite loop
        solve(adj, 0, isVisited, ans); 
        return ans;
    }
}