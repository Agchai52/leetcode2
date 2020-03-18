class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        
        int k = 0;
        for (int n: nums2) {
            int cnt = map1.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                map1.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
        
    }
}
