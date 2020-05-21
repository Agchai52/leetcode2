class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;        
        int l = 0;
        int r = len - k;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (x - arr[m] <= arr[m + k] - x) r = m;
            else l = m + 1;
        }
        for (int i = l; i < l + k; i++)
            list.add(arr[i]);
        return list;
    }
}
