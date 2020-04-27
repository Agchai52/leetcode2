class Solution {
    private List<String> getNeighbor(String node) {
        List<String> res = new LinkedList<>();
        int[] dir = new int[]{1, -1};
        for (int i = 0; i < 4; i++) {
            int x = node.charAt(i) - '0';
            for (int d: dir) {
                int y = (x + d + 10) % 10;
                String s = node.substring(0, i) + ("" + y) + node.substring(i+1);
                res.add(s);
            }
        }
        return res;
    }
    
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for (String s: deadends) dead.add(s);
        
        Set<String> seen = new HashSet<>();
        seen.add("0000");
        
        Queue<String> q_str = new LinkedList<>();
        Queue<Integer> q_depth = new LinkedList<>();
        q_str.add("0000");
        q_depth.add(0);
        while (!q_str.isEmpty()) {
            String cur = q_str.poll();
            int depth = (int) q_depth.poll();
            if (cur.equals(target)) return depth;
            if (dead.contains(cur)) continue;
            List<String> neighbor = getNeighbor(cur);
            for (String s: neighbor) {
                if (!seen.contains(s)) {
                    seen.add(s);
                    q_str.add(s);
                    q_depth.add(depth + 1);
                }
            }
        }
        return -1;
    }
}
