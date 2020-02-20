class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if (n == 0) return;
        for (int i = 0; i < (int) (n / 2); i++) {
            int j = n - 1 - i;
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return;
    }
}
