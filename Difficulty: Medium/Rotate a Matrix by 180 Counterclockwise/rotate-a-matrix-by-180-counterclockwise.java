class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int start = 0, end = mat.length - 1;
        while (start < end) {
            int[]temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            rev(mat[start++]);
            rev(mat[end--]);
        }
        if(start==end)rev(mat[start]);
    }
    public int[]rev(int[]arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;
    }
}