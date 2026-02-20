/*class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer>set = new HashSet<>();
        for (int x : arr) {
            int val = target - x;
            if (set.contains(val)) return true;
            set.add(x);
        }
        return false;
    }
}*/

import java.util.*;

class Solution {
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int required = target - arr[i];
            if (binarySearch(arr, i + 1, n - 1, required)) {
                return true;
            }
        }
        
        return false;
    }
    boolean binarySearch(int arr[], int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return true;
            }
            else if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}