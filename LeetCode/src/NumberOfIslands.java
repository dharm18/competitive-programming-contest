class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[] visited = new boolean[m][n];

        int cnt=0;
       // System.out.println(adj);
        for(int startingIndex=0; startingIndex<m; startingIndex++) {
            for(int c=0; c<n; c++) {
                if(Integer.parseInt(String.valueOf(grid[j][k])) == 1 && !visited[startingIndex][c]) {
                    dfs(adj, visited, startingIndex);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(char[][] grid, boolean[] visited, int index) {
        visited[index] = true;

        for(int nbr: adj.get(index)) {
            if(!visited[nbr])
                dfs(adj, visited, nbr);
        }
    }
}
