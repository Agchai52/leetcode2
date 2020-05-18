class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int l = 0;
        int r = nums.length - 1;
        int middle = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                l = m;
                break;
            }
            else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        if (l > r) return new int[]{-1, -1};
        middle = l;
        l = 0;
        r = middle;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        int res_l = l;
        System.out.println(l);
        l = middle;
        r = nums.length - 1;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target) r = m;
            else l = m;
        }
        int res_r = nums[r] == target ? r : l;
        return new int[]{res_l, res_r};
    }
}
