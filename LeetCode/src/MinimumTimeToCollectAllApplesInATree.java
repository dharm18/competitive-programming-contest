class MinimumTimeToCollectAllApplesInATree {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>(n);
        for(int k=0; k<n; k++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i<edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int totalApples = 0;
        for(boolean isApple: hasApple) {
            if(isApple)
                totalApples++;
        }

        if(totalApples < 1) return 0;

        int minTime = dfs(adj, 0, hasApple, 0);

        return minTime;
    }

    private int dfs(List<List<Integer>> adj, int v, List<Boolean> hasApple, int parent) {
        int minTime = 0;

        for(int vertex: adj.get(v)) { // start with starting vertex
            if(vertex == parent) continue;

            minTime+=dfs(adj, vertex, hasApple, v);
        }
        if(v!= 0 && (hasApple.get(v) || minTime > 0))
            minTime += 2;
        return minTime;
    }
}
