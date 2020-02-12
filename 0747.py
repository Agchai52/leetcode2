class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int max_val = findMax(nums);
        int max_idx = findIndex(nums, max_val);
        for (int i = 0; i < nums.length; i++) {
            if (max_idx == i) continue;
            if (max_val < 2 * nums[i]) return -1;
        }
        return max_idx;        
    }
    
    public static int findMax(int[] arr) {
        int maxVal = arr[0];
        for (int x: arr) {
            if (x > maxVal) maxVal = x;
        }
        return maxVal;
    }
    
    public static int findIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) return i;
        }
        return -1;
    }
}
