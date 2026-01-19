class Solution {
    //OPTIMAL APPROACH:BINARY SEARCH 
    private boolean checkCow(int[] stalls, int k,int target){
        int cow = 1;
        int last = stalls[0];
        int n = stalls.length;
        for(int i=1;i<n;i++){
            if((stalls[i]-last) >= target){
                cow = cow+1;
                last = stalls[i];
            }
        }
        return cow>=k;
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int x = stalls.length;
      int low = 1;
       int high = stalls[x-1] - stalls[0];
       int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkCow(stalls,k,mid) == true){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}