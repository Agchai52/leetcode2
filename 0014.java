class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        int minLen = 0x7fffffff;
        for (int i = 0; i < len; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        for (int j = 0; j < minLen; j++) {
            for (int i = 0; i < len; i++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) return strs[0].substring(0, j);
            }
        }
        return strs[0].substring(0, minLen);
        
    }
}
