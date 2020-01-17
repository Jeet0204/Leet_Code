class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        if(nums.length==0)
            return count;
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if(nums[i]!=val)
                i++;
            else
            {
                count++;
                if(nums[j]==val)
                    j--;
                else
                {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j--;
                }
            }
        }
        return nums.length-count;
    }
}