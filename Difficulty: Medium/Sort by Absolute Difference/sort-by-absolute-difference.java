import java.util.*;
class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        // Create a list of pairs (value, index)
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new int[]{arr[i], i});
        }

        // Sort by absolute difference, then by index (to maintain original order)
        Collections.sort(list, (a, b) -> {
            int diffA = Math.abs(a[0] - x);
            int diffB = Math.abs(b[0] - x);
            if (diffA != diffB) {
                return diffA - diffB;
            } else {
                return a[1] - b[1]; // keep original order if same difference
            }
        });

        // Write back sorted values into arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i)[0];
        }
    }
}
