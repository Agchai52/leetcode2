class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int val = nums[m];
            if (val == target) return m;
            if (target >= nums[0]) {
                if (val > target || val < nums[0]) r = m - 1;
                else l = m + 1;
            } else {
                if (val >= nums[0] || val < target) l = m + 1;
                else r = m - 1;                
            }
        }
        return -1;
        
    }
}
