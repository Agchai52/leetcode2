class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] row = new HashMap[9];
        HashMap<Integer, Integer>[] col = new HashMap[9];
        HashMap<Integer, Integer>[] box = new HashMap[9];
        
        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<Integer, Integer>();
            col[i] = new HashMap<Integer, Integer>();
            box[i] = new HashMap<Integer, Integer>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num == '.') continue;
                int n = (int) num;
                int box_id = (i / 3) * 3 + j / 3;
                
                row[i].put(n, row[i].getOrDefault(n, 0) + 1);
                col[j].put(n, col[j].getOrDefault(n, 0) + 1);
                box[box_id]. put(n, box[box_id].getOrDefault(n, 0) + 1);
                
                if (row[i].get(n) > 1 || col[j].get(n) > 1 || box[box_id].get(n) > 1) 
                    return false;
            }
        }
        return true;
    }
}
