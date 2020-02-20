class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int m = numbers[l] + numbers[r];
            if (m == target) return new int[]{l+1, r+1};
            else if (m < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
        
    }
}
