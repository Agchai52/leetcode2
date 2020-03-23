class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
                 01234567
        input = "abba"
                   l
                    r
        map = {a:0, b:2}
        max_len = r - l + 1 = 2  
        */
        Map<Character, Integer> map = new HashMap<>();
        int max_len = 0, l = 0, r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (map.containsKey(c)) 
                l = Math.max(l, map.get(c) + 1);          
            max_len = Math.max(max_len, r-l+1);
            map.put(c, r++);
            
        }
        return max_len;
    }
}
