class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = nums.length + 1, sum = 0;
        int l = 0, r = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= s) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return res == nums.length + 1 ? 0 : res;
        
    }
}
