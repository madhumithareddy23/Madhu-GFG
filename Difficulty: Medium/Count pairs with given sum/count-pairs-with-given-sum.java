import java.util.*;

class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int required = target - num;
            if (map.containsKey(required)) {
                count += map.get(required);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}