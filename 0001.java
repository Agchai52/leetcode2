/*
index=  0, 1, 2,  3
nums = [2, 7, 11, 15]
         i = [0, len-1]
         j = [i+1, len-1]
         
         i
         if target - value not in map, add value, index to map
         else return curIndex and Index of target - value;
         
         
hMap = {value = index} = {2 = 0; 7 = 1}          
        
*/
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Method 1: bruth force: Time = O(N^2), Space = O(1)
        int[] returnIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    returnIndex[0] = i;
                    returnIndex[1] = j;
                    return returnIndex;
                }
            }
        }
        return returnIndex;
        */
        
        /* Method2: hashTable, Time = O(N), Space = O(N). */
        int[] returnIndex = new int[2];
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(target - nums[i])) {
                returnIndex[0] = hMap.get(target-nums[i]);
                returnIndex[1] = i;
                return returnIndex;
            } else {
                hMap.put(nums[i], i);
            }
        }
        return returnIndex;    
        
    }
}
