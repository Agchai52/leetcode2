class Solution {
    public int numSquares(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        
        List<Integer> square = new LinkedList<>();
        for (int i = 1; i*i <= n; i++) {
            square.add(i*i);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int num = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            num++;
            for (int i = 0; i < size; i++) {
                int prev = q.poll();
                for (int j = 0; j < square.size(); j++) {
                    int cur = prev - square.get(j);
                    if (cur == 0) return num;
                    if (cur < 0) break;
                    if (!set.contains(cur)) {
                        q.add(cur);
                        set.add(cur);
                    }
                        
                }
                
            }
        }
        return -1;
    }
}
