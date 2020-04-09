class Solution {
    public int kthGrammar(int N, int K) {
        if (N == 1) return 0;
        int num = kthGrammar(N - 1, (K + 1) / 2);
        if (num == 0) {
            if (K % 2 == 1) return 0;
            else return 1;
        } else {
            if (K % 2 == 1) return 1;
            else return 0;
        }
        
    }
}
