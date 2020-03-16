class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE, sum;
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    min_sum = sum;
                    res.clear();
                    res.add(list2[j]);
                } else if (sum == min_sum) res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
