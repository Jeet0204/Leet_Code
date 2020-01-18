class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        if(nums.length==0)
            return 0;
        int i=0;
        int j=1;
        while(j<nums.length)
        {
            if(nums[i]==nums[j] && count<2)
            {
                nums[i+1] = nums[j];
                count++;
                j++;
                i++;
            }
            else if(nums[i]==nums[j] && count==2)
            {
                j++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
                count=1;
            }
            
        }
        return i+1;
    }
}