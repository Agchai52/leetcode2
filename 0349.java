class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hSet = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int i: nums1) hSet.add(i);
        for(int j: nums2) {
            if (hSet.contains(j)) {
                res.add(j);
                hSet.remove(j);
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) arr[i] = res.get(i);
        return arr;
        
    }
}
