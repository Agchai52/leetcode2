class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur_sum = 0, max_len = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_sum = nums[i] == 1 ? cur_sum + 1 : 0;
            max_len = Math.max(max_len, cur_sum);
        }
        return max_len;
        
    }
}
