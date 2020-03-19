class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strings) {
            String key = "";
            char first = s.charAt(0);
            for (char c: s.toCharArray()) {
                key += (c - first<0 ? c-first+26 : c-first) + ",";
                
            }
            if (!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
