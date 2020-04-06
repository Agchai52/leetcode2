class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int fib(int N) {
        if (cache.containsKey(N)) return cache.get(N);
        int res;
        if (N < 2) res = N;
        else res = fib(N-1) + fib(N-2);
        cache.put(N, res);
        return res;        
    }

}
