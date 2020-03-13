class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        s = "egg", 
        t = "add"
             i
        dict {e:a, g:d}
        */
        if (s == null || s.length() <= 1) return true;
        if (s.length() != t.length()) return false;
        Map<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (dict.containsKey(a)) {
                if (!dict.get(a).equals(b)) return false;
            } else {
                if (!dict.containsValue(b)) dict.put(a, b);
                else return false;
            }
        }
        return true;
        
    }
}
