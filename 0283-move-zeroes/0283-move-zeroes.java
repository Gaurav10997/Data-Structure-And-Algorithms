class Solution {
    public void moveZeroes(int[] arr) {
        int cnt = 0 ;
        for(int l = 0 ; l<arr.length ; l++){
            if(arr[l]==0){
                cnt++;
            }
        }
        
        int z = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]!=0){
                arr[z]=arr[i];
                z++;
            }
        }
        int k = arr.length-1;
        while(cnt-->0){
            arr[k]=0;
            k--;
        }
        
    }
}