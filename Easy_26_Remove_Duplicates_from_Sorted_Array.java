class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        if(nums.length==0)
            return count;
        int i=0;
        int j=1;
        while(j<nums.length)
        {
           if(nums[j]!=nums[i])
           {
               i++;
               nums[i] = nums[j];
           }
            j++;
        }
        return i+1;
    }
}