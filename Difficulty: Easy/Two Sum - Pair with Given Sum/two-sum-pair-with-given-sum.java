class Solution {
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
}