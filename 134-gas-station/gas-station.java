class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_cost=0;
        int total_gas=0;
        int start=0;
        int cur_gas=0;
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
            cur_gas+=gas[i] - cost[i];
            if(cur_gas<0){
                start=i+1;
                cur_gas=0;
            }
        }
        return total_gas<total_cost ? -1 : start;
    }
}