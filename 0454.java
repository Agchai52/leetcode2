class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        
        for (int a: A) {
            for (int b: B) {
                map.put(a+b, map.getOrDefault(a+b, 0)+1);
            }
        }
        
        for (int c: C) {
            for (int d: D) {
                if (map.containsKey(0-c-d)) {
                    res += map.get(0-c-d);
                }
            }
        }
        
        return res;
        
    }
}
