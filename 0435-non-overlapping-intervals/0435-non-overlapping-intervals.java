class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int ans = 0;
        int [] first = intervals[0];
        
        for(int i = 1 ; i< intervals.length ; i++){
            if(first[1]>intervals[i][0]){
                
                ans++;
                
                if(first[1]>=intervals[i][1]){
                    first=intervals[i];
                }
            }
            else{
                first=intervals[i];
            }
        }
        return ans;
    }
}