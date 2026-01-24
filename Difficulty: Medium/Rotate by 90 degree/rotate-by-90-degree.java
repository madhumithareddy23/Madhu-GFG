class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        int[][] ans = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[i][n - 1 - j] = mat[n - 1 - j][n - 1 - i];
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = ans[i][j];
            }
        }
    }
}