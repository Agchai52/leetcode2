class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] seen = new int[rooms.size()];
        for (int i = 0; i < seen.length; i++)
            seen[i] = 0;
        seen[0] = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int key: rooms.get(node)) {
                if (seen[key] == 0) {
                    seen[key] = 1;
                    stack.push(key);
                }
            }
        }
        
        for (int i: seen) {
            if (i == 0)
                return false;
        }
        return true;
    }
}
