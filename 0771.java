class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < J.length(); i++) {
            char j = J.charAt(i);
            if (map.containsKey(j)) res += map.get(j);
        }
        return res;
        
    }
}
