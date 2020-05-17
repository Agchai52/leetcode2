class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        if (m == 0 || n == 0) return matrix;
        
        Queue<int []> q = new LinkedList<>();
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for (int i = 0; i < m ; i++)
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    int[] cor = new int[]{i, j};
                    q.add(cor);
                } else
                    matrix[i][j] = -1;
            }
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            for (int[] d: dirs) {
                int x = r + d[0];
                int y = c + d[1];
                int[] new_cor = {x, y};
                if (0 <= x && x < m && 0 <= y && y < n && matrix[x][y] == -1) {
                    matrix[x][y] = matrix[r][c] + 1;
                    q.add(new_cor);
                }
            }           
        }
        return matrix;
        
    }
}
