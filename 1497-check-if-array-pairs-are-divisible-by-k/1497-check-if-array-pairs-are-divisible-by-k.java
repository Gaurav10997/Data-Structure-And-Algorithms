class Solution {
public boolean canArrange(int[] arr, int k) {
    int map[] = new int[k];
    for(int elements: arr){
        int rem = ((elements % k)+k)%k ;
        map[rem]++;
    }
    for(int elements: arr ){
        int remainder = ((elements % k)+k)%k;
        int oth = (k - remainder ) % k;
        if(remainder == oth){
            if(map[oth] %2==1) return false;
        }
        else if(map[remainder]!=map[oth]){
            return false;
        }
    }
    return true;
}

}