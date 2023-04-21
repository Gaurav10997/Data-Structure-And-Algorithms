class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int l = 0 ; 
        int r = 0 ; 
        int ans = 0;
        for(int el : arr){
            r+=el;
            l=Math.max(el,l);
        }
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println(mid + " " + isPosible(arr,mid,days));
            if(isPosible(arr,mid,days)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
       
    }
    
    public boolean isPosible(int [] arr , int mid , int days){
        int noOfDays = 1 ; 
        int sum = 0; 
        for(int i = 0; i< arr.length ; i++){
            sum+=arr[i];
            if(sum>mid){
                noOfDays++;
                sum=arr[i];
            }
        }
        return noOfDays<=days;
    }
}