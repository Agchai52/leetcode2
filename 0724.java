class Solution {
    public int pivotIndex(int[] nums) {
        int l_sum = 0;
        int sum = 0;
        for (int x: nums) sum +=x;
        
        for (int i = 0; i < nums.length; i++) {
            if (l_sum == sum - l_sum - nums[i]) return i;
            l_sum += nums[i];
        }
        return -1;
    }
}
