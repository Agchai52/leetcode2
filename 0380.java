class RandomizedSet {
    private Set<Integer> dict;
    private List<Integer> ls;
    private Random rd;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        dict = new HashSet<>();
        ls = new ArrayList<>();
        rd = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (dict.contains(val)) return false;
        dict.add(val);
        ls.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!dict.contains(val)) return false;
        dict.remove(val);
        ls.remove(Integer.valueOf(val));
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return ls.get(rd.nextInt(dict.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
