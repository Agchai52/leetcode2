class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '1') continue;
                int[] point = {i, j};                
                res++;
                q.add(point);
                grid[i][j] = '0';
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int row = cur[0];
                    int col = cur[1];
                    for (int d = 0; d < 4; d++) {
                        int r = row + direction[d][0];
                        int c = col + direction[d][1];
                        int[] next = new int[]{r, c};
                        if (0 <= r && r < m && 0 <= c && c < n && grid[r][c] == '1') {
                            q.add(next);
                            grid[r][c] = '0';
                        }
                        
                    }
                }
                                
            }
        return res;
    }
}
