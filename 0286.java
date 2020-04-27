class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0) return;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = rooms.length;
        int n = rooms[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++)
            for (int j=0; j < n; j++) {
                if (rooms[i][j] != 0)
                    continue;
                q.add(new int[]{i, j});
            }
        while (!q.isEmpty()) {                    
            int[] gate = q.poll();
            int row = gate[0];
            int col = gate[1];
            int val = rooms[row][col] + 1;
            for (int d = 0; d < 4; d++) {
                int i_d = row + direction[d][0];
                int j_d = col + direction[d][1];
                if (0 <= i_d && i_d < m && 0<= j_d && j_d < n && rooms[i_d][j_d] == EMPTY) {
                    rooms[i_d][j_d] = Math.min(val, rooms[i_d][j_d ]);
                    q.add(new int[]{i_d, j_d});
                }            
            }
        }
                    
    }
}
