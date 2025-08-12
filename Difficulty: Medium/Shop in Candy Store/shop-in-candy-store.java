import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        int n = prices.length;

        
        int minCost = 0;
        int i = 0, j = n - 1;
        while (i <= j) {
            minCost += prices[i];
            i++;
            j -= k;
        }

        
        int maxCost = 0;
        i = 0;
        j = n - 1;
        while (i <= j) {
            maxCost += prices[j];
            j--;
            i += k;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(minCost);
        result.add(maxCost);
        return result;
    }
}
