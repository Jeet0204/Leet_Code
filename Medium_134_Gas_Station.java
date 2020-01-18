class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0, left=0, start=0;
        for(int i=0;i<gas.length;i++)
        {
            sum += gas[i]-cost[i];
            if(sum<0)
            {
                left += gas[i]-cost[i];
                sum=0;
                start=i+1;
            }
            else
                left += gas[i]-cost[i];
;
        }
        if(left<0)
            return -1;
        
        return start;
    }
}
