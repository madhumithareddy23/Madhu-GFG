// User function Template for Java

class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // Create an empty matrix
        int[][] matrix = new int[n][m];

        // Initialize boundaries
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        // Index to track the position in arr
        int index = 0;

        // Fill the matrix in a spiral order
        while (top <= bottom && left <= right) {
            // Fill the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = arr[index++];
            }
            top++; // Move the top boundary down

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[index++];
            }
            right--; // Move the right boundary left

            // Fill the bottom row (if there are rows remaining)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = arr[index++];
                }
                bottom--; // Move the bottom boundary up
            }

            // Fill the left column (if there are columns remaining)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[index++];
                }
                left++; // Move the left boundary right
            }
        }

        return matrix;
    }
}