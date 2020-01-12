class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0)
                continue;
            else if(i!=0 && nums[i]==nums[i-1])
                continue;
            else if(nums[i]==count)
                count++;
            else
                break;
                
        }
        return count;
    }
}