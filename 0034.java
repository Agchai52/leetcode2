class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int l = 0;
        int r = nums.length - 1;
        // find index i that nums[i] => target && nums[i - 1] < target
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        if (nums[l] != target) return new int[]{-1, -1};
        int res_l = l;
        
        // find index j that nums[i] <= target && nums[i + 1] > target
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
