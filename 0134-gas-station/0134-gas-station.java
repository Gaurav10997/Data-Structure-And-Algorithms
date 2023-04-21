class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0 ; 
        int costSum = 0 ; 
        int fueltank = 0 ; 
        int sp = 0 ; 
        
        for(int i = 0 ; i< gas.length ; i++){
            gasSum+=gas[i];
            costSum+=cost[i];
            
            fueltank+=gas[i]-cost[i];
            if(fueltank<0){
                sp=i+1;
                fueltank=0;    
            }
            
        }
        if(gasSum<costSum){
            return -1;
        }
        return sp;
    }
}