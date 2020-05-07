class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            if (S == 0) return 1;
            else return 0;
        }
        
        int count = 0;       
        count += findTargetSumWays(Arrays.copyOfRange(nums, 1, nums.length), S - nums[0]);
        count += findTargetSumWays(Arrays.copyOfRange(nums, 1, nums.length), S + nums[0]);
        
        return count;
    }
}
