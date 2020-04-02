class ValidWordAbbr {
    private Map<String, Set<String>> dict;

    public ValidWordAbbr(String[] dictionary) {
        dict = new HashMap<String, Set<String>>();
        for (String s: dictionary) {
            String code = encode(s);
            if (!dict.containsKey(code)) {
                Set<String> set = new HashSet<String>();
                dict.put(code, set);
            }
            dict.get(code).add(s);
        }
    }
    
    public String encode(String s) {
        if (s.length() < 3) return s;
        return s.substring(0, 1) + String.valueOf(s.length() - 2) + s.substring(s.length()-1); 
    }
    
    public boolean isUnique(String word) {
        String w = encode(word);
        return !dict.containsKey(w) || dict.get(w).size() == 1 && dict.get(w).contains(word);
        
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
