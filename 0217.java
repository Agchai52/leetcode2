class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for (int item: nums) {
            if (hSet.contains(item)) {
                return true;
            } else {
                hSet.add(item);
            }
        }
        return false;
        
    }
}
